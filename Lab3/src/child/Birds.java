package child;

import parent.animal;


public class Birds extends animal{

    private String animalsWithFeathers;
    private String canFly;


    public Birds(float height, float weight, String animalType, String bloodType, String animalsWithFeathers,
            String canFly) {
        super(height, weight, animalType, bloodType);
        this.animalsWithFeathers = animalsWithFeathers;
        this.canFly = canFly;
    }


    public String getAnimalsWithFeathers() {
        return animalsWithFeathers;
    }
    public void setAnimalsWithFeathers(String animalsWithFeathers) {
        this.animalsWithFeathers = animalsWithFeathers;
    }
    public String getCanFly() {
        return canFly;
    }
    public void setCanFly(String canFly) {
        this.canFly = canFly;
    } 
    
}
