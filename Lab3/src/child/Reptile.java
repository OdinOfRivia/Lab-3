package child;

import parent.animal;

public class Reptile extends animal {
    
    private String drySkin;
    private String backBone;
    private String softShelledEggs;

    public Reptile(float height, float weight, String animalType, String bloodType, String drySkin, String backBone,
            String softShelledEggs) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backBone = backBone;
        this.softShelledEggs = softShelledEggs;
        
    }

    public String getDrySkin() {
        return drySkin;
    }

    public void setDrySkin(String drySkin) {
        this.drySkin = drySkin;
    }

    public String getBackBone() {
        return backBone;
    }

    public void setBackBone(String backBone) {
        this.backBone = backBone;
    }

    public String getSoftShelledEggs() {
        return softShelledEggs;
    }

    public void setSoftShelledEggs(String softShelledEggs) {
        this.softShelledEggs = softShelledEggs;
    }

    
    
}
