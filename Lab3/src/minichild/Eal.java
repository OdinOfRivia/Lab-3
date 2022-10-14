package minichild;

import child.Fish;

public class Eal extends Fish {
    private String releaseElectricCharge;

    public void Showinfo(){
        System.out.println("height='" + getHeight() + "'\n"+
        "weight='" + getWeight() + "'\n"+
        "animalType='" + getAnimalType() + 
        "'\n"+"bloodType='" + getBloodType() + 
        "'\n" + "liveInWater" + getLiveInWater() + 
        "'\n" + "HasGills" + getHasGills() + "'\n");
    }

    public Eal(float height, float weight, String animalType, String bloodType, String liveInWater, String hasGills,
            String releaseElectricCharge) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.releaseElectricCharge = releaseElectricCharge;
    }


    public String getReleaseElectricCharge() {
        return releaseElectricCharge;
    }

    public void setReleaseElectricCharge(String releaseElectricCharge) {
        this.releaseElectricCharge = releaseElectricCharge;
    }


    
    
}
