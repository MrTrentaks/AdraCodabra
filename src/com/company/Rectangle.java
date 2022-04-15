package com.company;

public class Rectangle extends Shape {
    public static final double DEFAULT_WIDTH_AND_LENGTH=1.0;
    private double width;
    private  double length;
    public Rectangle(){
        super();
        width = DEFAULT_WIDTH_AND_LENGTH;
        length = DEFAULT_WIDTH_AND_LENGTH;
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }
    public  void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }
    public  void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "Прямоугольник " + super.getColor() + " цвета, площадью " + getArea() + " и периметром " + getPerimeter();
    }

}