public class ExceptionDemo {
    public static void check(int num) throws ArithmeticException {
        if(num < 15)throw new ArithmeticException("This num is too small");
        else System.out.println("This num is valid");
    }
    public static void main(String[] args) {
        try {
            ExceptionDemo.check(1);
        } catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception be handled");
        }
        finally {
            System.out.println("Handle completely");
        }
    }
}
