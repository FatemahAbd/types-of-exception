package javalab8;
public class Test {
    public static void main(String [] args){
        int value= -2;
        while(true){
            try{
                System.out.print("Square Root: "+method(value));
            }
            catch(NumberFormatException nfe){
                System.out.print(nfe.getMessage());
            }
            catch(Exception ex){
                System.out.print(ex.getMessage());
                break;
            }
            finally{
                System.out.println(" Value= "+value);
                value+=2;
            }
        }
        System.out.print("The End");
    }
    public static double method(int value)throws Exception{
        if(value < 0) 
            throw new NumberFormatException("The value is Negative:");
        else if(value > 4)
            throw new Exception("The value reaches the maximum limit:");
        else 
            return Math.sqrt(value);
    }
}
