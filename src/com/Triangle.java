package com;

public abstract class Triangle {
    Double[] x = new Double[2];
    Double[] y = new Double[2];
    Double[] z = new Double[2];

    public Triangle(){
        x[0] = 0.0;
        x[1] = 0.0;
        y[0] = 3.0;
        y[1] = 0.0;
        z[0] = 0.0;
        z[1] = 4.0;
    }

    public void setX(Double[] x){
        this.x = x;
    }

    public Double[] getX(){
        return x;
    }

    public void setY(Double[] y){
        this.y = y;
    }

    public Double[] getY(){
        return y;
    }

    public void setZ(Double[] z){
        this.z = z;
    }

    public Double[] getZ(){
        return z;
    }

    public abstract String toString();
}
