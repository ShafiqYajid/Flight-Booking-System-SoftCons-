package admin;

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
import models.TempFacility;
import models.TempSeat;

/**
 *
 * @author MuhammadHarris
 */
public class ChangeFeatures extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Features> f = (ArrayList<Features>) (getServletContext().getAttribute("features"));
        ArrayList<SeatFeatures> sF = (ArrayList<SeatFeatures>) (getServletContext().getAttribute("seatFeature"));
        ArrayList<Facility> fac = (ArrayList<Facility>) (getServletContext().getAttribute("facility"));
        ArrayList<TempSeat> tS = (ArrayList<TempSeat>) (getServletContext().getAttribute("tempSeat"));
        ArrayList<TempFacility> tF = (ArrayList<TempFacility>) (getServletContext().getAttribute("tempFacility"));
        
        char[] s = {'e','b','f'};
                
        
        for (int i = 0; i < 3; i++)
        {
            //Saving old values
            (tS.get(i)).setSeatPitch( sF.get(i).getNewSeatPitch() );
            //(f.get(i)).setSeatPitch( f.get(i).getNewSeatPitch() );
            
            (tS.get(i)).setSeatType( sF.get(i).getNewSeatType() );
            (tS.get(i)).setSeatWidth( sF.get(i).getNewSeatWidth() );
            //(f.get(i)).setSeatWidth( f.get(i).getNewSeatWidth() );     
            (tF.get(i)).setPowerType( fac.get(i).getNewPowerType() );
            (tF.get(i)).setVideoType(fac.get(i).getNewVideoType() );
            (tF.get(i)).setSpecialFood(fac.get(i).getNewSpecialFood() );
            (tF.get(i)).setWifi(fac.get(i).getNewWifi() );          
            (f.get(i)).setPrice( f.get(i).getNewPrice() );
            //(f.get(i)).setWifi( f.get(i).getNewWifi() );
            //(f.get(i)).setSpecialFood( f.get(i).getNewSpecialFood() );

            //Setting new values temporarily
            (tS.get(i)).setSeatPitch((Double.parseDouble(request.getParameter("seat_pitch_" + s[i])))  );
            (tS.get(i)).setSeatWidth((Double.parseDouble(request.getParameter("seat_width_" + s[i])))  );
            (tS.get(i)).setSeatType((request.getParameter("seat_type_" + s[i]))  );
            (tF.get(i)).setPowerType((request.getParameter("power_" + s[i]))  );
            (tF.get(i)).setVideoType((request.getParameter("video_" + s[i]))  );
            //(f.get(i)).setSeatPitch( (Double.parseDouble(request.getParameter("seat_pitch_" + s[i])))  );
            //(f.get(i)).setSeatWidth( (Double.parseDouble(request.getParameter("seat_width_" + s[i])))  );
            //(f.get(i)).setVideoType( (request.getParameter("video_" + s[i]))  );
            //(f.get(i)).setPowerType( (request.getParameter("power_" + s[i]))  );
            //(f.get(i)).setSeatType ( (request.getParameter("seat_type_" + s[i]))  );
            (f.get(i)).setPrice ( Integer.parseInt(request.getParameter("price_" + s[i]))  );            
            
        }
        fac.get(1).setNewWifi(tF.get(1).getWifi());
        fac.get(2).setNewWifi(tF.get(2).getWifi());
        //f.get(1).setNewWifi( f.get(1).getWifi());
        //f.get(2).setNewWifi( f.get(2).getWifi());
       
        tF.get(1).setWifi( request.getParameter("wifi_b"));
        tF.get(2).setWifi( request.getParameter("wifi_f"));
        //f.get(1).setWifi( request.getParameter("wifi_b"));
        //f.get(2).setWifi( request.getParameter("wifi_f"));
        
        fac.get(2).setNewSpecialFood(tF.get(2).getSpecialFood());
        tF.get(2).setSpecialFood( request.getParameter("special_food_f"));
        //f.get(2).setNewSpecialFood(f.get(2).getSpecialFood());
        //f.get(2).setSpecialFood( request.getParameter("special_food_f"));       
        
        Features.isChanged = true;
        
        response.sendRedirect("ChangeFeatures.jsp");
    }


}
