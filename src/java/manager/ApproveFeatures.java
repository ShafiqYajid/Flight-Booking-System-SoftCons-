package manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Features;
import models.SeatFeatures;
import models.Facility;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MuhammadHarris
 */
public class ApproveFeatures extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        approveBooking();

        response.sendRedirect("ApproveFeatures.jsp");
    }

    public void approveBooking ()
    {
        ArrayList<Features> f = (ArrayList<Features>) (getServletContext().getAttribute("features"));
        ArrayList<SeatFeatures> sF = (ArrayList<SeatFeatures>) (getServletContext().getAttribute("seatFeature"));
        ArrayList<Facility> fac = (ArrayList<Facility>) (getServletContext().getAttribute("facility"));
        
        for (int i = 0; i < 3; i++)
        {
            (sF.get(i)).setNewSeatPitch( 0.0);
            //(f.get(i)).setNewSeatPitch( 0);
            (sF.get(i)).setNewSeatWidth(0.0);
            //(f.get(i)).setNewSeatWidth( 0);  
            (sF.get(i)).setNewSeatType(null);
            (fac.get(i)).setNewPowerType(null);
            (fac.get(i)).setNewSpecialFood(null);
            (fac.get(i)).setNewVideoType(null);
            (fac.get(i)).setNewWifi(null);
            //(f.get(i)).setNewVideoType( null);            
            //(f.get(i)).setNewPowerType( null);            
            //(f.get(i)).setNewSeatType( null);            
            (f.get(i)).setNewPrice( 0);
            //(f.get(i)).setNewWifi( null);
            //(f.get(i)).setNewSpecialFood( null);
        }
        
        Features.isChanged = false;
    }
}
