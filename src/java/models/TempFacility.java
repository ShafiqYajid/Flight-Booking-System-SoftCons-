
package models;

/**
 *
 * @author user
 */
public class TempFacility {

    /**
     * @return the videoType
     */
    public String getVideoType() {
        return videoType;
    }

    /**
     * @param videoType the videoType to set
     */
    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    /**
     * @return the powerType
     */
    public String getPowerType() {
        return powerType;
    }

    /**
     * @param powerType the powerType to set
     */
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    /**
     * @return the wifi
     */
    public String getWifi() {
        return wifi;
    }

    /**
     * @param wifi the wifi to set
     */
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    /**
     * @return the specialFood
     */
    public String getSpecialFood() {
        return specialFood;
    }

    /**
     * @param specialFood the specialFood to set
     */
    public void setSpecialFood(String specialFood) {
        this.specialFood = specialFood;
    }
    
    private String videoType;
    private String powerType;
    private String wifi;
    private String specialFood;
    
    
    public TempFacility(String vt, String pt, String w, String sf){
        
        videoType = vt;
        powerType = pt;
        wifi = w;
        specialFood = sf;
       
    }
    
}
