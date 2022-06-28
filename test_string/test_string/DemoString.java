import java.util.StringTokenizer;

public class DemoString {
    
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello I am*Nguyen Trung Hieu", "*");

        System.out.println("Tong so token " + st.countTokens() + "\n");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken(" ") + '\n');
        }
    }
   }