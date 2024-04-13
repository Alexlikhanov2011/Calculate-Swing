package com.example.calkulator.probnik;

public class Truck extends MotorTransport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    void checkTrailer() {
        System.out.println("У данной модели: " + getModelName() + "- Проверяем прицеп");
    }

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
