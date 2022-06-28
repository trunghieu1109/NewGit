public class DemoFinalize {
    public void finalize(){
        System.out.println("End of program");
    }
    public static void main(String[] args) {
        DemoFinalize demo = new DemoFinalize();
        DemoFinalize demo1 = new DemoFinalize();
        demo = null;
        demo1 = null;
        System.gc();
    }
}
