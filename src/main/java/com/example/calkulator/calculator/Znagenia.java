package com.example.calkulator.calculator;

import java.util.Objects;
import java.util.Scanner;

public class Znagenia {
    double zakupka;
    double prodaja;
    double ndsObshay;
    double ndfl;
    double income;
    static double revenue;

    public Znagenia(double zakupka, double prodaja) {
        this.zakupka = zakupka;
        this.prodaja = prodaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Znagenia znagenia = (Znagenia) o;
        return Double.compare(zakupka, znagenia.zakupka) == 0 && Double.compare(prodaja, znagenia.prodaja) == 0 && Double.compare(ndsObshay, znagenia.ndsObshay) == 0 && Double.compare(ndfl, znagenia.ndfl) == 0 && Double.compare(income, znagenia.income) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zakupka, prodaja, ndsObshay, ndfl, income);
    }

    @Override
    public String toString() {
        return "Znagenia{" +
                "zakupka=" + zakupka +
                ", prodaja=" + prodaja +
                ", ndsObshay=" + ndsObshay +
                ", ndfl=" + ndfl +
                ", income=" + income +
                '}';
    }
}
