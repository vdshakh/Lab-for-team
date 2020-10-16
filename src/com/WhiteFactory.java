package com;

public class WhiteFactory implements BaseFactory  {
    @Override
    public Circle createCircle() {
        return new WhiteCircle();
    }

    public Triangle createTriangle() {
        return new WhiteTriangle();
    }
}
