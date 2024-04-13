package com.example.calkulator.probnik;

public abstract class WheelsTransport implements Transport {
    public WheelsTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("У данной модели: " + modelName + "- Меняем покрышку");
    }
}