package com.strategy;

public class StrategyA implements IStrategy{
    @Override
    public void encode(String value) {
        System.out.print(value + " is encoded using strategy A\n");
    }
}
