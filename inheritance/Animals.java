package inheritance;

public class Animals{
    public String sound;
    public int num_leg;
    public String type;
    public Animals(){
        sound = "sound";
        num_leg = 0;
        type = "Animals";
    }
    public void print_sound(){
        System.out.println(type + " " + sound);
    }
    public void print_num_leg(){
        System.out.println(type + " has " + num_leg);
    }
};
