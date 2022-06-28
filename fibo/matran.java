package fibo;

public class matran {
    public
    long[][] matrix = new long[2][2];
    public matran(){
        matrix[0][0] = 0L;
        matrix[0][1] = 1L;
        matrix[1][0] = 1L;
        matrix[1][1] = 1L;
    }
    public void print(){
        for(int i=0;i<2;i++){
            System.out.print("[ ");
            for(int j=0;j<2;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}