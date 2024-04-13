package com.example.calkulator.calculator;

public class ZnageniaServiceOSN {

    public double revenueR(Znagenia znagenia) {
        znagenia.revenue = znagenia.prodaja - znagenia.zakupka;
        return znagenia.revenue;
    }

    public double NDSObshay(Znagenia znagenia) {
        znagenia.ndsObshay = ((znagenia.prodaja - (znagenia.zakupka)) * 20) / 120.0;
        return znagenia.ndsObshay;
    }

    public double NDFL(Znagenia znagenia) {
        znagenia.ndfl = (znagenia.prodaja - znagenia.zakupka) * 0.13;
        return znagenia.ndfl;
    }

    public double iNCOME(Znagenia znagenia) {
        znagenia.income = revenueR(znagenia) - NDSObshay(znagenia) - NDFL(znagenia);
        return znagenia.income;
    }

}
