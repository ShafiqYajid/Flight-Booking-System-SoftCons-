
package models;

/**
 *
 * @author user
 */
public class Facility {

    /**
     * @return the newVideoType
     */
    public String getNewVideoType() {
        return newVideoType;
    }

    /**
     * @param newVideoType the newVideoType to set
     */
    public void setNewVideoType(String newVideoType) {
        this.newVideoType = newVideoType;
    }

    /**
     * @return the newPowerType
     */
    public String getNewPowerType() {
        return newPowerType;
    }

    /**
     * @param newPowerType the newPowerType to set
     */
    public void setNewPowerType(String newPowerType) {
        this.newPowerType = newPowerType;
    }

    /**
     * @return the newWifi
     */
    public String getNewWifi() {
        return newWifi;
    }

    /**
     * @param newWifi the newWifi to set
     */
    public void setNewWifi(String newWifi) {
        this.newWifi = newWifi;
    }

    /**
     * @return the newSpecialFood
     */
    public String getNewSpecialFood() {
        return newSpecialFood;
    }

    /**
     * @param newSpecialFood the newSpecialFood to set
     */
    public void setNewSpecialFood(String newSpecialFood) {
        this.newSpecialFood = newSpecialFood;
    }
    
    private String newVideoType;
    private String newPowerType;
    private String newWifi;
    private String newSpecialFood;
    
    public Facility (String newVt, String newPt, String newW, String newSf){
        
        newVideoType = newVt;
        newPowerType = newPt;
        newWifi = newW;
        newSpecialFood = newSf;  
    }
    
}
