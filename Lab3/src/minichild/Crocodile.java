package minichild;

import child.Reptile;

public class Crocodile extends Reptile {

    private String hardShelledEggs;
    
    public void Showinfo(){
        System.out.println("'\n" + "height='" + getHeight() + "'\n"+
        "weight='" + getWeight() + "'\n"+
        "animalType='" + getAnimalType() + "'\n"+
        "bloodType='" + getBloodType() + "'\n"+
        "skeletalStructure='" + getBackBone() + "'\n"+
        "skinType='" + getDrySkin() + "'\n"+
        "eggType='" + getHardShelledEggs() + "'\n");
    }



    public Crocodile(float height, float weight, String animalType, String bloodType, String drySkin, String backBone,
            String softShelledEggs, String hardShelledEggs) {
        super(height, weight, animalType, bloodType, drySkin, backBone, softShelledEggs);
        this.hardShelledEggs = hardShelledEggs;
    }

    public String getHardShelledEggs() {
        return hardShelledEggs;
    }

    public void setHardShelledEggs(String hardShelledEggs) {
        this.hardShelledEggs = hardShelledEggs;
    }

    
    
}
