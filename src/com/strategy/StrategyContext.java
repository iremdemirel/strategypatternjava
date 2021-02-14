package com.strategy;

public class StrategyContext {
    IStrategy encodingstrategy;

    public StrategyContext(IStrategy iStrategy){
        encodingstrategy = iStrategy;
    }

    public void encode(String value){
        encodingstrategy.encode(value);
    }

}

