package overloading;

public class Function {
    public void print(int a, int b){
        System.out.println("result is " + (a + b));
    }
    public void print(int a, int b, int c){
        System.out.println("result is " + (a + b + c));
    }
}
