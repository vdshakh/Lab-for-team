package com;

public class AbstractFactory {
    public BaseFactory getFactory(Factories types)
    {
        switch (types) {
            case WhiteFactory: return new WhiteFactory();
            case BlackFactory: return new BlackFactory();
            default: throw new IllegalArgumentException("Doesn't exist:" + types);
        }
    }
}

