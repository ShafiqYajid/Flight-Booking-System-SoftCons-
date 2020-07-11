package manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Features;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Facility;
import models.SeatFeatures;
import models.TempSeat;
import models.TempFacility;

/**
 *
 * @author MuhammadHarris
 */
public class DisapproveFeatures extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Features> f = (ArrayList<Features>) (getServletContext().getAttribute("features"));
        ArrayList<SeatFeatures> sF = (ArrayList<SeatFeatures>) (getServletContext().getAttribute("seatFeature"));
        ArrayList<Facility> fac = (ArrayList<Facility>) (getServletContext().getAttribute("facility"));
        ArrayList<TempSeat> tS = (ArrayList<TempSeat>) (getServletContext().getAttribute("tempSeat"));
        ArrayList<TempFacility> tF = (ArrayList<TempFacility>) (getServletContext().getAttribute("tempFacility"));
        for (int i = 0; i < 3; i++)
        {
            (tS.get(i)).setSeatPitch( sF.get(i).getNewSeatPitch() );
            //(f.get(i)).setSeatPitch( f.get(i).getNewSeatPitch() );
            
            (tS.get(i)).setSeatType( sF.get(i).getNewSeatType() );
            (tS.get(i)).setSeatWidth( sF.get(i).getNewSeatWidth() );
            //(f.get(i)).setSeatWidth( f.get(i).getNewSeatWidth() );     
            (tF.get(i)).setPowerType( fac.get(i).getNewPowerType() );
            (tF.get(i)).setVideoType(fac.get(i).getNewVideoType() );
            (tF.get(i)).setSpecialFood(fac.get(i).getNewSpecialFood() );
            (tF.get(i)).setWifi(fac.get(i).getNewWifi() );
            //(f.get(i)).setVideoType( f.get(i).getNewVideoType() );            
            //(f.get(i)).setPowerType( f.get(i).getNewPowerType() );            
            //(f.get(i)).setSeatType( f.get(i).getNewSeatType() );            
            (f.get(i)).setPrice( f.get(i).getNewPrice() );
            //(f.get(i)).setWifi( f.get(i).getNewWifi() );
            //(f.get(i)).setSpecialFood( f.get(i).getNewSpecialFood() );

            (sF.get(i)).setNewSeatPitch( 0.0);
            (sF.get(i)).setNewSeatType(null);
            (sF.get(i)).setNewSeatWidth( 0.0);
            //(f.get(i)).setNewSeatPitch( 0);
            //(f.get(i)).setNewSeatWidth( 0);   
            (fac.get(i)).setNewPowerType( null);
            (fac.get(i)).setNewSpecialFood( null);
            (fac.get(i)).setNewVideoType( null);
            (fac.get(i)).setNewWifi( null);
            //(f.get(i)).setNewVideoType( null);            
            //(f.get(i)).setNewPowerType( null);            
            //(f.get(i)).setNewSeatType( null);            
            (f.get(i)).setNewPrice( 0);
            //(f.get(i)).setNewWifi( null);
            //(f.get(i)).setNewSpecialFood( null);
                        
        }

        Features.isChanged = false;
        
        response.sendRedirect("ApproveFeatures.jsp");
    }


}
