package com.example.calkulator.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

import static com.example.calkulator.calculator.Variants.*;
import static java.lang.System.console;

public class ContactForm extends JFrame implements ActionListener {
    JTextField zakupka1_field, prodaja1_field;
    JRadioButton usn, osn, ooo;
    JCheckBox NDSObshay, NDFL, iNCOME, revenueR;
    private JButton calculateButton;
    ZnageniaServiceOSN znageniaServiceOSN = new ZnageniaServiceOSN();


    public ContactForm() {
        super("Калькулятор чистой прибыли");
        super.setBounds(200, 100, 400, 250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(6, 2, 2, 5));
// обьявление строк и названий
        JLabel zakupka = new JLabel("Введите сумму закупки");
        zakupka1_field = new JTextField("", 1);
        JLabel prodaja = new JLabel("Введите сумму продажи");
        prodaja1_field = new JTextField("", 1);
// добавление наших строк в приложение
        container.add(zakupka);
        container.add(zakupka1_field);
        container.add(prodaja);
        container.add(prodaja1_field);

        // названия наших кнопок и обьявление кнопок с галочкой
        NDSObshay = new JCheckBox("NDSObshay");
        NDFL = new JCheckBox("NDFL");
        iNCOME = new JCheckBox("iNCOME");
        revenueR = new JCheckBox("revenueR");
        // названия наших кнопок и обьявление кнопок в круге
        usn = new JRadioButton("ИП на УСН");
        osn = new JRadioButton("ИП на ОСН");
        ooo = new JRadioButton("ООО");
// этот метод добавляет кнопку и говорит нам что после нажатия на кнопку произойдет действие из метода
        calculateButton = new JButton("Рассчитать");
        calculateButton.addActionListener(this);
        add(calculateButton);
// метод автоматически ставит галочку на данной кнопке
        //osn.setSelected(true);
// это добавляет наши кнопки в панель
        container.add(osn);
        container.add(usn);
        container.add(ooo);

        // revenueR.setSelected(true);
        container.add(revenueR);
        container.add(NDSObshay);
        container.add(NDFL);
        container.add(iNCOME);
// этот метод запрещает выбор нескольких кнопок одновременно
        ButtonGroup group = new ButtonGroup();
        group.add(osn);
        group.add(usn);
        group.add(ooo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calculateButton) {
            try {
                double num1 = Double.parseDouble(zakupka1_field.getText());
                double num2 = Double.parseDouble(prodaja1_field.getText());
                Znagenia znagenia = new Znagenia(num1, num2);
                String result = null;
                String name = null;
                if (osn.isSelected() && iNCOME.isSelected() &&
                        revenueR.isSelected() && NDFL.isSelected() && NDSObshay.isSelected()) {
                    name = "ИП на OСН";
                    result = " \niNCOME: " + znageniaServiceOSN.iNCOME(znagenia) + "\n" +
                            " \nчистая прибыль: " + znageniaServiceOSN.revenueR(znagenia) + "\n" +
                            " \nNDFL: " + znageniaServiceOSN.NDFL(znagenia) + "\n" +
                            " \nNDSObshay: " + znageniaServiceOSN.NDSObshay(znagenia);
                } else if (osn.isSelected() && iNCOME.isSelected() &&
                        revenueR.isSelected() && NDFL.isSelected()) {
                    name = "ИП на OСН";
                    result = " \niNCOME: " + znageniaServiceOSN.iNCOME(znagenia) + "\n" +
                            " \nчистая прибыль: " + znageniaServiceOSN.revenueR(znagenia) + "\n" +
                            " \nNDFL: " + znageniaServiceOSN.NDFL(znagenia);
                } else if (osn.isSelected() && iNCOME.isSelected() && revenueR.isSelected()) {
                    name = "ИП на OСН";
                    result = " \niNCOME: " + znageniaServiceOSN.iNCOME(znagenia) + "\n" +
                            " \nчистая прибыль: " + znageniaServiceOSN.revenueR(znagenia);

                } else if (osn.isSelected() && revenueR.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nчистая прибыль: " + znageniaServiceOSN.revenueR(znagenia);
                } else if (osn.isSelected() && iNCOME.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nincome: " + znageniaServiceOSN.iNCOME(znagenia);
                } else if (osn.isSelected() && NDSObshay.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nnds " + znageniaServiceOSN.NDSObshay(znagenia);
                } else if (osn.isSelected() && NDFL.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nndfl: " + znageniaServiceOSN.NDFL(znagenia);
                } else if (calculateButton.equals(OsnAndIncomeAndRevenueRAndNDSObshayAndNDFL)) {
                } else if (calculateButton.equals(OsnAndRevenueRAndNDSObshay)) {
                } else if (calculateButton.equals(OsnAndRevenueRAndNDFL)) {
                } else if (calculateButton.equals(OsnAndNDSObshayRAndNDNDFL)) {
                } else if (calculateButton.equals(OooAndRevenueR)) {
                } else if (calculateButton.equals(OooAndIncome)) {
                } else if (calculateButton.equals(OooAndNDSObshay)) {
                } else if (calculateButton.equals(OooAndNDFL)) {
                } else if (calculateButton.equals(OooAndIncomeAndRevenueR)) {
                } else if (calculateButton.equals(OooAndIncomeAndNDSObshay)) {
                } else if (calculateButton.equals(OooAndIncomeAndNDFL)) {
                } else if (calculateButton.equals(OooAndIncomeAndRevenueRAndNDSObshayAndNDFL)) {
                } else if (calculateButton.equals(OooAndRevenueRAndNDSObshay)) {
                } else if (calculateButton.equals(OooAndRevenueRAndNDFL)) {
                } else if (calculateButton.equals(OooAndNDSObshayRAndNDNDFL)) {
                } else if (calculateButton.equals(UsnAndRevenueR)) {
                } else if (calculateButton.equals(UsnAndIncome)) {
                } else if (calculateButton.equals(UsnAndNDSObshay)) {
                } else if (calculateButton.equals(UsnAndNDFL)) {
                } else if (calculateButton.equals(UsnAndIncomeAndRevenueR)) {
                } else if (calculateButton.equals(UsnAndIncomeAndNDSObshay)) {
                } else if (calculateButton.equals(UsnAndIncomeAndNDFL)) {
                } else if (calculateButton.equals(UsnAndIncomeAndRevenueRAndNDSObshayAndNDFL)) {
                } else if (calculateButton.equals(UsnAndRevenueRAndNDSObshay)) {
                } else if (calculateButton.equals(UsnAndRevenueRAndNDFL)) {
                } else if (calculateButton.equals(UsnAndNDSObshayRAndNDNDFL)) {
                }



               /* if (osn.isSelected() && revenueR.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nчистая прибыль: " + znageniaServiceOSN.revenueR(znagenia);
                } else if (osn.isSelected() && iNCOME.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nincome: " + znageniaServiceOSN.iNCOME(znagenia);
                } else if (osn.isSelected() && NDSObshay.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nnds " + znageniaServiceOSN.NDSObshay(znagenia);
                } else if (osn.isSelected() && NDFL.isSelected()) {
                    name = "ИП на OСН";
                    result = " \nndfl: " + znageniaServiceOSN.NDFL(znagenia);
                } else if (osn.isSelected() && iNCOME.isSelected() && revenueR.isSelected()) {
                    name = "ИП на OСН";
                    result = "чистая прибыль:" + "\n" +
                            "income: ";
                } else if (ooo.isSelected()) {
                    name = "ooo";
                } else {
                    name = "ИП на УСН";
                }*/


                JOptionPane.showMessageDialog(null, result, name,
                        JOptionPane.PLAIN_MESSAGE);


            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ошибка ввода данных!");
            }

        }
    }
}
