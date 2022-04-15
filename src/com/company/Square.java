package com.company;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color){
        super(side,side,color);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public  void setWidth(double width){//    Square.setWidth()
        setSide(width);
    }
    @Override
    public  void setLength(double length){
        setSide(length);
    }

}
