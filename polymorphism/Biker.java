package polymorphism;

public class Biker {
    int speedlimit;
    String name;
    public Biker(){
        name = "biker";
        speedlimit = 90;        
    }
    public void print(){
        System.out.println(name + " with speed " + speedlimit);
    }
};
