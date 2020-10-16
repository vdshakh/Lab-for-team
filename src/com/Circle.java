package com;

public abstract class Circle {
    Double x;
    Double y;
    Double radius;

    public Circle(){
        x = 0.0;
        y = 0.0;
        radius = 1.0;
    }

    /*public Circle(Double x, Double y, Double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }*/

    public void setX(Double x){
        this.x = x;
    }

    public Double getX(){
        return x;
    }
    public void setY(Double y){
        this.y = y;
    }

    public Double getY(){
        return y;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    public Double getRadius(){
        return radius;
    }

    public abstract String toString();
}
