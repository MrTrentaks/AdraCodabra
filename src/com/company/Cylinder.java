package com.company;

public class Cylinder extends com.company.Circle {
    private double height;


    public Cylinder(){
        super();
        height = 1.0;//??? откуда ты взялось


    }
    public Cylinder( double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;

    }
    public void setHeight(double height){
        this.height=height;
    }


    public double getVolume(){
        return getArea()*height;
    }
    @Override
    public double getArea(){
        return super.getRadius() *  2 * Math.PI *height + 2*super.getArea();//this.getArea()     getArea()    super.getArea()
    }
    @Override
    public String toString(){
        return "Цилиндр с окружность у основания радуса = "+super.getRadius() + "  высотой = " + height +"и цвета "+super.getColor() + "\nПлощадь цилиндра = " + getArea();
    }

}
