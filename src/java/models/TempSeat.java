
package models;

/**
 *
 * @author user
 */
public class TempSeat {

    /**
     * @return the seatPitch
     */
    public double getSeatPitch() {
        return seatPitch;
    }

    /**
     * @param seatPitch the seatPitch to set
     */
    public void setSeatPitch(double seatPitch) {
        this.seatPitch = seatPitch;
    }

    /**
     * @return the seatWidth
     */
    public double getSeatWidth() {
        return seatWidth;
    }

    /**
     * @param seatWidth the seatWidth to set
     */
    public void setSeatWidth(double seatWidth) {
        this.seatWidth = seatWidth;
    }

    /**
     * @return the seatType
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * @param seatType the seatType to set
     */
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
    
    double seatPitch;
    double seatWidth;
    String seatType;
    
    public TempSeat(double sp, double sw, String st){
        
        this.seatPitch = sp;
        this.seatWidth = sw;
        this.seatType = st;
        
    }
    
}
