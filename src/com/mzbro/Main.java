package com.mzbro;

import com.mzbro.calculator.CalculatorPanel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        CalculatorPanel calc = new CalculatorPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 250));
        frame.getContentPane().add(BorderLayout.CENTER, calc);
        frame.setVisible(true);
    }
}
