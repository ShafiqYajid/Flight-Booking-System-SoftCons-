/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class FlightClass {
    
    int economySeats;
    int businessSeats;
    int firstSeats;
    
    int oldESeats;
    int oldBSeats;
    int oldFSeats;
    int oldTSeats;
    
    public FlightClass(int oldE, int oldB, int oldF, int oldT, int economySeats, int bSeats, int firstSeats) {
        
        this.economySeats = economySeats;
        this.businessSeats = bSeats;
        this.firstSeats = firstSeats;  
        oldESeats = oldE;
        oldBSeats = oldB;
        oldFSeats = oldF;
        oldTSeats = oldT;
    }
    
    public int getOldESeats()
    {
        return oldESeats;
    }
    
    public int getOldBSeats()
    {
        return oldBSeats;
    }

    public int getOldFSeats()
    {
        return oldFSeats;
    }
    
    public int getOldTSeats()
    {
        return oldTSeats;
    }

    public int getEconomySeats()
    {
        return economySeats;
    }

    public int getBusinessSeats()
    {
        return businessSeats;
    }

    public int getFirstSeats()
    {
        return firstSeats;
    }
    
    public void setOldESeats(int s)
    {
        oldESeats = s;
    }
    
    public void setOldBSeats(int s)
    {
        oldBSeats = s;
    }

    public void setOldFSeats(int s)
    {
        oldFSeats = s;
    }
    
    public void setOldTSeats(int s)
    {
        oldTSeats = s;
    }

    public void setEconomySeats(int s)
    {
        economySeats = s;
    }

    public void setBusinessSeats(int s)
    {
        businessSeats = s;
    }

    public void setFirstSeats(int s)
    {
        firstSeats = s;
    }
    
}
