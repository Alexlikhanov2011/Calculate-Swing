package com.example.calkulator.calculator2;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Calculator {
    private static JTextField textField;
    private static JTextField textField2;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Калькулятор");
        JPanel panel = new JPanel(new GridLayout(5, 6));
        textField = new JTextField();
        textField2 = new JTextField();
        // создание шрифта
        Font mainFont = new Font("Times New Roman", Font.BOLD, 20);
        textField.setFont(mainFont);
        textField2.setFont(mainFont);
        // создание размера панели
        frame.setSize(350, 300);
        // задаем параметр закрытия
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // устанавливаем положение если не применить появится в левом верхнем углу
        frame.setLocationRelativeTo(null);
        // Разрешаем растягивание
        frame.setResizable(true);
        // разрешаем отображение
        frame.setVisible(true);
        // добавляем с помощью адд расположение нашего текстового поля
        frame.getContentPane().add(BorderLayout.NORTH, textField);
        frame.getContentPane().add(panel);


        JButton number_system = new JButton("&");
        panel.add(number_system);

    }
}
