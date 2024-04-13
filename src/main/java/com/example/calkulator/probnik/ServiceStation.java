package com.example.calkulator.probnik;

public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Начинаем сервис данного транспорта");
        transport.service();
    }
}
