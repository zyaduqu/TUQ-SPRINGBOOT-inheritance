package org.example;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        if (side < 0){
            System.out.println("can't input negative side");
        } else {
            super.setLength(side);
            super.setWidth(side);
        }
    }

    @Override
    public String toString() {
        return "\nSquare"+
                "\nSide= "+super.getWidth()+
                "\nArea= "+super.getArea()+
                "\nPerimeter= "+super.getPerimeter()+
                "\ncolor= "+super.getColor()+
                "\nisFilled= "+super.isFilled();
    }
}
