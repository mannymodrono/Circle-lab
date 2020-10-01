import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Circle radius?");
        Double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circle's area is: " + circle.getArea());
        System.out.println("Circle's diameter:  " + circle.getDiameter());
        System.out.println("Circle's circumference: " + circle.getCircumference());
    }
}
