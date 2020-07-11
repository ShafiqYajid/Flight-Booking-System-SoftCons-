package models;


import java.sql.Date;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadHarris
 */
public class Flight {
    
    String flightName;
    
    ArrayList<Seat> seats;
    int totalSeats;
    int currentSeats;
    
    String departureCity;
    String arrivalCity;
    
    Date departureDate;
    Date arrivalDate;
    
    
    public boolean isChanged;
    
    public Flight(boolean c, String flightName, ArrayList<Seat> seats, int totalSeats, int currentSeats, String departureCity, String arrivalCity, Date departureDate, Date arrivalDate)            
    {
        isChanged = c;
        this.flightName = flightName;

        this.seats = seats;
        this.totalSeats = totalSeats;
        this.currentSeats = currentSeats;

        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;

        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    
    }
    
    public boolean isEmpty()
    {
        return (totalSeats==currentSeats);
    }
    
            
    public String getFlightName()
    {
        return flightName;
    }
    
    public int getTotalSeats()
    {
        return totalSeats;
    }

    public void setTotalSeats(int s)
    {
        totalSeats = s;
    }
    
    public void setCurrentSeats(int s)
    {
        currentSeats = s;
    }    
    
    public String getDepartureCity()
    {
        return departureCity;
    }
    
    public String getArrivalCity()
    {
        return arrivalCity;
    }
    
    public Date getDepartureDate()
    {
        return departureDate;
    }
    
    public Date getArrivalDate()
    {
        return arrivalDate;
    }
    
    
    public int getCurrentSeats()
    {
        return currentSeats;
    }
    
    public void setCustomer (Customer c)            
    {
        seats.get(totalSeats-currentSeats).setCustomer(c);
        c.setSeat(seats.get(totalSeats-currentSeats));
        currentSeats--;
    }
    
    public void setSeats (ArrayList<Seat> s)
    {
        seats = s;
    }
}
