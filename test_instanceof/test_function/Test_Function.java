public class Test_Function {
    public static void main(String[] args){
        Object[] obj = new Object[4];
        obj[0] = 1;
        obj[1] = "string";
        obj[2] = 'c';
        obj[3] = 23.4;
        for(int i=0;i<4;i++){
            if(obj[i] instanceof String){
                System.out.println(obj[i] + " is String");
            }
            else {
                if(obj[i] instanceof Integer){
                    System.out.println(obj[i] + " is Integer");
                }
                else {
                    if(obj[i] instanceof Double){
                        System.out.println(obj[i] + " is Double");
                    }
                    else {
                        if(obj[i] instanceof Character){
                            System.out.println(obj[i] + " is Character");
                        }
                    }
                }
            }
        }
    }
}
