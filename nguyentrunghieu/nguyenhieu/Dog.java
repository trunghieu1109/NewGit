package nguyenhieu;

public class Dog extends Animals {
    static {
        System.out.println("Create clones");
    }
    public void bark(){
        System.out.println("Gau");
        super.bark();
    }
};
