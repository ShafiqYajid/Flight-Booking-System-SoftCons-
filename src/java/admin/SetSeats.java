package admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Flight;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.FlightClass;

/**
 *
 * @author MuhammadHarris
 */
public class SetSeats extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Flight> flights = (ArrayList<Flight>) (getServletContext().getAttribute("flights"));
        ArrayList<FlightClass> flightClass = (ArrayList<FlightClass>) (getServletContext().getAttribute("flightsClass"));

        Flight flight = null;
        FlightClass fC = null;
        
        for (int i = 0; i < flights.size(); i++)
        {
            if (flights.get(i).getFlightName().equals(request.getParameter("flight_name")))
            {
                flight = flights.get(i);
                break;
            }            
        }
            
        fC.setOldESeats(fC.getEconomySeats());
        fC.setOldBSeats(fC.getBusinessSeats());
        fC.setOldFSeats(fC.getFirstSeats());        
        fC.setOldTSeats(flight.getTotalSeats());

        fC.setEconomySeats(Integer.parseInt (request.getParameter("seats_e")));
        fC.setBusinessSeats(Integer.parseInt (request.getParameter("seats_b")));        
        fC.setFirstSeats(Integer.parseInt (request.getParameter("seats_f")));
        flight.setTotalSeats(fC.getEconomySeats() + fC.getBusinessSeats() + fC.getFirstSeats());
        
        flight.setCurrentSeats(flight.getTotalSeats());
        
        
        flight.isChanged = true;

        response.sendRedirect("SetSeats.jsp");        
    }
}
