import java.util.Scanner;


public class Binary {
    public static Scanner sc = new Scanner(System.in);
    public String change(int n){
        StringBuilder ans = new StringBuilder();
        while(n > 0){
            int remainder = n%2;
            n /= 2;
            ans.append((char) (55 + remainder));
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        Binary b = new Binary();
        System.out.println(b.change(n));
    }
}
