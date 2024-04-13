package com.example.calkulator.probnik;

public class Bicycle extends WheelsTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}


