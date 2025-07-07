package org.example;

public class Main {
    public static void main(String[] args) {
        // circle objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(3.0, "blue", true);
        Circle circle4 = new Circle(7.5, "red", false);
        Circle circle5 = new Circle(2.5);

        System.out.println("CIRCLES:");
        // testing Circle 1
        System.out.println("Circle 1 initial:");
        System.out.println(circle1);
        circle1.setRadius(2.0);
        circle1.setColor("yellow");
        circle1.setFilled(true);
        System.out.println("\nCircle 1 after setters:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Is Filled: " + circle1.isFilled());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(circle1);

        // testing other circles
        System.out.println("\nCircle 2-5:");
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
        System.out.println(circle5);

        System.out.println("---------------------");

        // rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4.0, 6.0);
        Rectangle rect3 = new Rectangle(5.0, 8.0, "yellow", true);
        Rectangle rect4 = new Rectangle(3.0, 7.0, "purple", false);
        Rectangle rect5 = new Rectangle(2.0, 3.0);

        System.out.println("\nRECTANGLES:");
        // testing rectangle 1
        System.out.println("Rectangle 1 initial:");
        System.out.println(rect1);
        rect1.setWidth(3.0);
        rect1.setLength(4.0);
        rect1.setColor("brown");
        rect1.setFilled(true);
        System.out.println("\nRectangle 1 after setters:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Color: " + rect1.getColor());
        System.out.println("Is Filled: " + rect1.isFilled());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println(rect1);

        // testing remaining rectangles
        System.out.println("\nRectangle 2-5:");
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);
        System.out.println(rect5);

        System.out.println("---------------------");

        // square objects
        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0, "pink", true);
        Square square4 = new Square(6.0, "black", false);
        Square square5 = new Square(3.0);

        System.out.println("\nSQUARES:");
        // testing square 1
        System.out.println("Square 1 initial:");
        System.out.println(square1);
        square1.setSide(5.0);
        square1.setColor("gray");
        square1.setFilled(true);
        System.out.println("\nSquare 1 after setters:");
        System.out.println("Side: " + square1.getSide());
        System.out.println("Color: " + square1.getColor());
        System.out.println("Is Filled: " + square1.isFilled());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println(square1);

        // testing remaining squares
        System.out.println("\nSquare 2-5:");
        System.out.println(square2);
        System.out.println(square3);
        System.out.println(square4);
        System.out.println(square5);

        System.out.println("---------END--------");
    }
}