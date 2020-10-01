public class Circle {
    // instance vars
    private double radius;
    private final double pi = 3.14;

    //constructors
    public Circle(){

    }

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

    public double getDiameter() {
        return radius * 2.0;
    }

    public double getCircumference() {
        return this.getDiameter() * pi;
    }
}