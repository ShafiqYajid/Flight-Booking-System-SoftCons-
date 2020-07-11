package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MuhammadHarris
 */


public class Features {
    
    public static boolean isChanged = false;
    
    SeatFeatures seat_Features;
    TempSeat tempSeat;
    Facility facility;
    TempFacility tempFacility;
    
    int type;
    public int price;
    int newPrice;
    
    
    
    public Features(TempFacility tempFacility,Facility facility,TempSeat tempSeat, SeatFeatures seatFeatures, int price, int newPrice, int t, boolean c)
    {
        this.price = price;
        this.newPrice = newPrice;
        type = t;
        isChanged = c;
        
        this.seat_Features = seatFeatures;
        this.tempSeat = tempSeat;
        this.tempFacility = tempFacility;
        this.facility = facility;
        
    }
    
/*
     public static class Builder {
         
        Features feature = new Features();

        public Builder() {
        }

        public Builder seat_Features(SeatFeatures seat_Features) {
            Features.seat_Features = seat_Features;
            return this;
        }


        public PollutantEntry build() {
            return pollutantEntry;
        }
    }
    */
    
    public int getPrice()
    {
        return price;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
       
    public int getNewPrice()
    {
        return newPrice;
    }
    
    public void setNewPrice(int price)
    {
        newPrice = price;
    }
        
    public boolean getIsChanged()
    {
        return isChanged;
    }
   
    public void setIsChanged(boolean c)
    {
        isChanged = c;
    }

    
}
