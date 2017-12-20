package javalab8;
public class TestCircleWithException {        
    public static void main(String[] args) {
    /*Because setRadius method declares an Exception,and the argument constructor calls it:
      we must put the calling of the constructor in try block or make main method to declare the exception*/
       try {            
         CircleWithException c1  = new CircleWithException(5);  //It's OK
         CircleWithException c2  = new CircleWithException(-5); // Here, there is an exception, so it doesn't complete try block and move to catch the exception 
         CircleWithException c3  = new CircleWithException(0);
      }
      catch (IllegalArgumentException ex) {    //Exception catching
        System.out.println(ex);
      }
      System.out.println("Number of objects created:" +
        CircleWithException.getNumberOfObjects());
    }   
}
