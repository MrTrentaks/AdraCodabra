package com.company;

public class Circle extends Shape {
    public static final double DEFAULT_RADIUS=1.0;
    public static final String DEFAULT_COLOR="Красный";
    private double radius;
    //private String color;
    public Circle (){//Circle q = new Circle()
        super(DEFAULT_COLOR);
        radius=DEFAULT_RADIUS;
        //color=DEFAULT_COLOR;
    }
    public Circle(double radius){//Circle q = new Circle(1.35)    Circle q;
        super(DEFAULT_COLOR);
        this.radius = radius;
        //color = DEFAULT_COLOR;
    }
    public Circle(double radius, String color){//Circle q = new Circle(1.35, "red")
        super(color);
        this.radius=radius;                    //Circle q = new Circle("red", 1.35) не сработает!!!


    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    /*public String getColor(){
        return color;
    }
    public void SetColour(String color){
        this.color=color;
    }*/
    @Override
    public String toString(){
        return "Круг радуса="+radius+"и цвета"+super.getColor();
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){ return 2*Math.PI*this.radius;}

}
