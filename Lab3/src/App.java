import minichild.Crocodile;
import minichild.Eal;
import minichild.eagle;

public class App {
    public static void main(String[] args) throws Exception {

        Crocodile funnyLizard = new Crocodile(2, 100, "Reptile", "O+", "Yes", "Yes", "Yes", "No");
        funnyLizard.Showinfo();

        Eal Ålefisk = new Eal(1, 2, "aquatic Vertebrate", "O+", "Yes", "Yes", "Yes");
        Ålefisk.Showinfo();

        eagle soudiEagle = new eagle(1, 4, "bird", "O+", "Yes", "Yes");
        soudiEagle.Showinfo();

    }
}
