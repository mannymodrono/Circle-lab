public class Circle {
    // instance vars
    private double radius;
    private final double pi = 3.14;

    //constructors
    public Circle(double pRadius){
        this.radius = pRadius;
    }

    //methods
    public void setRadius(double pRadius) {
        this.radius = pRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}