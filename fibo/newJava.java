package fibo;

public class newJava {
    final long mod = 1000007;
    public matran multiplyMatrix(matran a, matran b) {
        matran c = new matran();
        for(int i=0 ;i < 2; i++){
            for(int j=0 ;j < 2; j++){
                c.matrix[i][j] = 0L;
                for(int k=0;k<2;k++){
                    c.matrix[i][j] = (c.matrix[i][j] + a.matrix[i][k]*b.matrix[k][j] + mod*mod)%mod;   
                }
                //System.out.println(c.matrix[i][j]);
            }
        }
        return c;
    }
    public matran powerMatrix(matran a, int n){
        if(n == 1)return a;
        matran tmp = powerMatrix(a, n/2);
        if(n%2 == 0)return multiplyMatrix(tmp, tmp);
        else return multiplyMatrix(multiplyMatrix(tmp, tmp), a);
    }
    public static void main(String[] args) {
        newJava variable = new newJava();
        matran a = new matran();
        matran ab = variable.powerMatrix(a, 19411);
        System.out.println(ab.matrix[0][1]);
        //ab.print();
    }
};
