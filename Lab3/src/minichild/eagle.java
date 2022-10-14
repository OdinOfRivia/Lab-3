package minichild;

import child.Birds;

public class eagle extends Birds {

    public void Showinfo(){
        System.out.println("height='" + getHeight() + "'\n"+
        "weight='" + getWeight() + 
        "'\n"+"animalType='" + getAnimalType() + 
        "'\n"+"bloodType='" + getBloodType() + 
        "'\n"+"animalWithFeathers" + getAnimalsWithFeathers() +
        "'\n"+"canFly'" + getCanFly());

    }

    public eagle(float height, float weight, String animalType, String bloodType, String animalsWithFeathers,
            String canFly) {
        super(height, weight, animalType, bloodType, animalsWithFeathers, canFly);
    }

}
