package javalab8;
public class Division {
    public static void main(String[] args) {
        for (int i = 2; i >= -3; i--) {
            try {
                double z = division(5, i);
                System.out.println("Result: " + z);
            }
            catch(ArithmeticException ar){
               System.out.println(ar.getMessage());
               break;
           }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            finally{
                System.out.println("i: "+i);
            }
        }
        System.out.println("Finish");
    }
    
    public static double division(double x , double y) throws Exception{
        if(y==0) {
            throw new ArithmeticException("Cann`t divid number by zero!");
        }else if(y==1) {
            throw new Exception("division by 1 is forbidden.");
        }else{
            return x/y;
        }
    }
}
    
