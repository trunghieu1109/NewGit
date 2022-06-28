package bubblesort;

public class bubblesort {
    public static void main(String[] args){
        int[] a = new int[4];
        a[0] = 9;
        a[1] = 2;
        a[2] = 8;
        a[3] = 3;
        boolean quit = false;
        while(!quit){
            quit = true;
            for(int i=0;i<3;i++){
                if(a[i] > a[i+1]){
                    int tg = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tg;
                    quit = false;
                }
            }
        }
        for(int i=0;i<4;i++){
            System.out.println(a[i] + " ");
        }
    }
};
