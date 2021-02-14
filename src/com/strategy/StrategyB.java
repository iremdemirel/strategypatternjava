package com.strategy;

public class StrategyB implements IStrategy{
    @Override
    public void encode(String value) {
        System.out.print(value + " is encoded using strategy B\n");
    }
}
