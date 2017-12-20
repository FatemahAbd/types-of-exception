package javalab8;
public class JavaLab8 {
    public static void main(String[] args) {
        System.out.println("Before the method call");
        try {
           method();
           System.out.println("After the method call");
        }     
        catch (ArithmeticException ex) {
           System.out.println("ArithmeticException");
        }
        catch (NullPointerException ex) {
           System.out.println("FileNotFoundException");
        }
        catch (Exception e) {
           System.out.println("Exception");
        }
        finally{
         System.out.println("finally");
        }    
        System.out.print("After catching");
    }
    public static void method() {
        System.out.println(1/0);
        System.out.print("inside method");
    }
}