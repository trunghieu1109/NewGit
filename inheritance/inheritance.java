package inheritance;

public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animals frog = new Animals();
        dog.eating();
        dog.print_num_leg();
        frog.print_num_leg();
        frog.print_sound();
    }
};