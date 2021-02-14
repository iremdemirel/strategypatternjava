package com.strategy;

public class Main {

    public static void main(String[] args) {
        IStrategy encodingStrategy = new StrategyA();
        StrategyContext encoding = new StrategyContext(encodingStrategy);
        encoding.encode("10000011110");

        //Strategy has changed to B
        encodingStrategy = new StrategyB();
        encoding = new StrategyContext(encodingStrategy);
        encoding.encode("10000011110");

    }
}
