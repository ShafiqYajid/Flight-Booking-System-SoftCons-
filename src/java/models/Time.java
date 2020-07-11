/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author MuhammadHarris
 */
public class Time {

    String timeDeparture;
    String timeArrival;
    String timeBooking;
    
    public Time(String d,String a, String b)
    {
        timeDeparture = d;
        timeArrival = a;
        timeBooking = b;
    }
    
 
    
    public String getTimeDeparture()
    {
        return timeDeparture;
    }
    
    
    public String getTimeArrival()
    {
        return timeArrival;
    }
    
    public String getTimeBooking()
    {
        return timeBooking;
    }
}