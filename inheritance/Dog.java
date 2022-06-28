package inheritance;

public class Dog extends Animals {
    public Dog(){
        sound = "Gau";
        num_leg = 4;
        type = "Dog";
    }
    public void eating(){
        System.out.println("eating...");
    }
};