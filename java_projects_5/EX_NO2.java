import java.util.Scanner;

// Shape class
class Shape {
    protected double dimension1;
    protected double dimension2;

    public Shape() {
        dimension1 = 0.0;
        dimension2 = 0.0;
    }

    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double getDimension1() {
        return dimension1;
    }

    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public void setDimension2(double dimension2) {
        this.dimension2 = dimension2;
    }

    public double findArea() {
        return 0.0; // Default implementation in the base class
    }

    public void displayArea() {
        System.out.println("Area: " + findArea());
    }
}

// Triangle class
class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double findArea() {
        return 0.5 * dimension1 * dimension2;
    }

    @Override
    public void displayArea() {
        System.out.println("Triangle Area: " + findArea());
    }
}

// Rectangle class
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double findArea() {
        return dimension1 * dimension2;
    }

    @Override
    public void displayArea() {
        System.out.println("Rectangle Area: " + findArea());
    }
}

public class EX_NO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double dimension1, dimension2;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Triangle Area");
            System.out.println("2. Calculate Rectangle Area");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the base of the triangle: ");
                    dimension1 = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    dimension2 = scanner.nextDouble();
                    Shape triangle = new Triangle(dimension1, dimension2);
                    triangle.displayArea();
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    dimension1 = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    dimension2 = scanner.nextDouble();
                    Shape rectangle = new Rectangle(dimension1, dimension2);
                    rectangle.displayArea();
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
