import java.util.Scanner;

import java.io.IOException;

public class DemoException {
    public static void checkNumber(int num) throws InvalidNumException{
        if(num < 45){
            throw new InvalidNumException("The number is too small");
        }
        else {
            System.out.println("The number is valid");
        }
    }
    public static void main(String[] args) {
        try {
            DemoException.checkNumber(40);
        }
        catch(InvalidNumException e){
            System.out.println(e);
        }
    }
}
