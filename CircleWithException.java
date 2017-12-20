package javalab8;
public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0; // The number of the objects created 
    public CircleWithException(){
      this(1.0);  
      /*This statment call argument constructor for radius=1. Instead of it, You can do the following:
       radius=1.0;
       numberOfObjects++;
       */     
    }
    public CircleWithException(double newRadius) {
      setRadius(newRadius);
      numberOfObjects++;
    }
    public double getRadius() {
      return radius;
    }
    public void setRadius(double newRadius)throws IllegalArgumentException{  //Exception Declaration
      if (newRadius >= 0 )
        radius = newRadius;
      else
        throw new IllegalArgumentException("Radius cannot be negative"); //Exception throwing 
    }
    public static int getNumberOfObjects() {
      return numberOfObjects;
    }
    public double getArea() {
      return radius * radius * Math.PI;
    }
}
