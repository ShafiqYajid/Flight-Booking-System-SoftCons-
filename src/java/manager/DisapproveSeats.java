package manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.FBS;
import models.Flight;
import models.FlightClass;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MuhammadHarris
 */
public class DisapproveSeats extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Flight> flights = (ArrayList<Flight>) (getServletContext().getAttribute("flights"));
        ArrayList<FlightClass> flightClass = (ArrayList<FlightClass>) (getServletContext().getAttribute("flightsClass"));

        Flight f = null;
        FlightClass fC = null;
        
        for (int i = 0; i < flights.size(); i++)
        {
            if (flights.get(i).getFlightName().equals(request.getParameter("flight_name")))
            {
                f = flights.get(i);
                break;
            }            
        }
        
        fC.setEconomySeats(fC.getOldESeats());
        fC.setBusinessSeats(fC.getOldBSeats());
        fC.setFirstSeats(fC.getOldFSeats());
        f.setTotalSeats(fC.getOldTSeats());
        f.setCurrentSeats(f.getTotalSeats());
        
        fC.setOldESeats(0);
        fC.setOldBSeats(0);
        fC.setOldFSeats(0);
        fC.setOldTSeats(0);

        f.isChanged = false;
        response.sendRedirect("ApproveSeats.jsp");
    }
}
