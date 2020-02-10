package com.mzbro.calculator;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationsPanel extends JPanel {

    private OperationButton plusButton;
    private OperationButton minusButton;
    private OperationButton multiplyButton;
    private OperationButton divideButton;
    private OperationButton equalsButton;
    private OperationsEnum currentOperation;

    OperationsPanel(OperationsEnum operation) {
        currentOperation = operation;
        plusButton = new OperationButton("+");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              currentOperation = OperationsEnum.PLUS;
            }
        });

        minusButton = new OperationButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentOperation = OperationsEnum.MINUS;
            }
        });
        multiplyButton = new OperationButton("*");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentOperation = OperationsEnum.MULTIPLY;
            }
        });
        divideButton = new OperationButton("/");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentOperation = OperationsEnum.DIVIDE;
            }
        });
        equalsButton = new OperationButton("=");
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                currentOperation = OperationsEnum.PLUS;
            }
        });;
        configureLayout();
    }

    private void configureLayout() {
        setLayout(new GridBagLayout());

        add(plusButton, new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        add(minusButton, new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        add(multiplyButton, new GridBagConstraints(0, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        add(divideButton, new GridBagConstraints(0, 3, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        add(equalsButton, new GridBagConstraints(1, 0, 1, 4, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
    }
}
