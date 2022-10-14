package parent;



public class animal {
    private float Height;
    private float Weight;
    private String animalType;
    private String bloodType;

    public animal(float height, float weight, String animalType, String bloodType) {
        Height = height;
        Weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }


    public float getHeight() {
        return Height;
    }
    
    public void setHeight(float height) {
        Height = height;
    }
    
    public float getWeight() {
        return Weight;
    }
    
    public void setWeight(float weight) {
        Weight = weight;
    }
    
    public String getAnimalType() {
        return animalType;
    }
    
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    
    public String getBloodType() {
        return bloodType;
    }
    
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    

}





