package com;

public class BlackFactory implements BaseFactory{
    @Override
    public Circle createCircle() {
        return new BlackCircle();
    }

    public Triangle createTriangle() {
        return new BlackTriangle();
    }
}
