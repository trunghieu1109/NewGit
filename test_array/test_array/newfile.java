import java.util.Scanner;

public class newfile {
    public static Scanner scanner = new Scanner(System.in);
    public static void print(String arr[]){
        for(String s : arr){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        String[][] str = new String[2][2];
        System.out.println("Nhập dữ liệu....");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.printf("str[%d][%d] = ", i, j);
                str[i][j] = scanner.nextLine();
                System.out.print("\n");
            }
            System.out.println("");
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(str[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
