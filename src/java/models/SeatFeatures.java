
package models;

/**
 *
 * @author user
 */
public class SeatFeatures {

    /**
     * @return the newSeatPitch
     */
    public Double getNewSeatPitch() {
        return newSeatPitch;
    }

    /**
     * @param newSeatPitch the newSeatPitch to set
     */
    public void setNewSeatPitch(double newSeatPitch) {
        newSeatPitch = newSeatPitch;
    }

    /**
     * @return the newSeatWidth
     */
    public Double getNewSeatWidth() {
        return newSeatWidth;
    }

    /**
     * @param newSeatWidth the newSeatWidth to set
     */
    public void setNewSeatWidth(Double newSeatWidth) {
        this.newSeatWidth = newSeatWidth;
    }

    /**
     * @return the newSeatType
     */
    public String getNewSeatType() {
        return newSeatType;
    }

    /**
     * @param newSeatType the newSeatType to set
     */
    public void setNewSeatType(String newSeatType) {
        this.newSeatType = newSeatType;
    }
    double newSeatPitch;
    Double newSeatWidth;
    String newSeatType;
    
    public SeatFeatures(double newSp, double newSw, String newSt){
        
        this.newSeatPitch = newSp;
        this.newSeatWidth = newSw;
        this.newSeatType = newSt;
        
    }
    
}
