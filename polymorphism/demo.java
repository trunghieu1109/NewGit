package polymorphism;

public class demo {
    public static void main(String[] args){
        Biker a = new Biker();
        Biker b = new Driver();
        a.print();
        b.print();
    }    
};
