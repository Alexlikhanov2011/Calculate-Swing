package com.example.calkulator.probnik;

public abstract class MotorTransport extends WheelsTransport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    void checkEngine() {
        System.out.println("У данной модели: " + getModelName() + "- Проверяем двигатель");
    }
}
