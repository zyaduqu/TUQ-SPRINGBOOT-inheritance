package org.example;

public class Circle extends Shape{
    private double radius = 1.0;
    private final double pi = Math.PI;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("can't enter a negative radius");
        } else {
            this.radius = radius;
        }

    }

    public double getArea(){
        return pi*(this.radius*this.radius);
    }

    public double getPerimeter(){
        return 2*(this.pi*this.radius);
    }

    @Override
    public String toString() {
        return "Circle"+
                "\nradius= " + this.radius +
                "\nArea= "+getArea()+
                "\nPerimeter= "+getPerimeter()+
                "\n"+super.toString();
    }
}
