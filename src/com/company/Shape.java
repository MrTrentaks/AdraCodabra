package com.company;

public abstract class Shape {
    private String color;
    public Shape (String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public Shape (){
        color = "red";
    }
    public abstract double getArea();
    public abstract String toString();
    public void setColor(String color){
        this.color =color;
    }
    public abstract double getPerimeter();
}
