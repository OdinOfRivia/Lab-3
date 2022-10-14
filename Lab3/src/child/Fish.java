package child;

import parent.animal;

public class Fish extends animal {

    private String liveInWater;
    private String hasGills;

    public Fish(float height, float weight, String animalType, String bloodType, String liveInWater, String hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }


    public String getLiveInWater() {
        return liveInWater;
    }

    public void setLiveInWater(String liveInWater) {
        this.liveInWater = liveInWater;
    }

    public String getHasGills() {
        return hasGills;
    }

    public void setHasGills(String hasGills) {
        this.hasGills = hasGills;
    }
    
    
}
