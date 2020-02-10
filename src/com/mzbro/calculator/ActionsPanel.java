package com.mzbro.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsPanel extends JPanel {
    private OperationButton allClearcButton;
    private OperationButton clearButton;
    private OperationButton memClearButton;
    private OperationButton memRecallButton;
    private OperationButton memStoreButton;
    private OperationButton memPlusButton;


    public ActionsPanel(CalculatorPanel calculatorPanel) {

        allClearcButton = new OperationButton("AC");
        allClearcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorPanel.resetAC();
            }
        });;
        clearButton = new OperationButton("C");
        memClearButton = new OperationButton("MC");
        memRecallButton = new OperationButton("MR");
        memStoreButton = new OperationButton("MS");
        memPlusButton = new OperationButton("M+");
        configurePanel();
    }

    private void configurePanel() {
        setLayout(new FlowLayout());
        add(allClearcButton);
        add(clearButton);
        add(memClearButton);
        add(memRecallButton);
        add(memStoreButton);
        add(memPlusButton);
    }
}
