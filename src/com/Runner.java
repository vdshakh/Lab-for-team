package com;

import com.*;

public class Runner {
    public static void main(String[] args){
        AbstractFactory factory = new AbstractFactory();
        BaseFactory factBlack = factory.getFactory(Factories.BlackFactory);
        BaseFactory factWhite = factory.getFactory(Factories.WhiteFactory);
        Circle circle = factBlack.createCircle();
        Triangle triangle = factWhite.createTriangle();
        System.out.println(circle);
        System.out.println(triangle);
        circle.setRadius(3.0);
        System.out.println("Длинна окружности = " + circle.len());
        System.out.println("Периметр = " + triangle.len());
    }
}
