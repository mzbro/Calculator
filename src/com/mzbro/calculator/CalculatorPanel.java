package com.mzbro.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {

    private JTextField screen;
    private ActionsPanel actionsPanel;
    private DigitsPanel digitsPanel;
    private OperationsPanel operationsPanel;
    OperationsEnum operationsEnum;
    private String v1;
    private String v2;

    public CalculatorPanel() {
        screen = new JTextField();
        v1 = "";
        v2 = "";
        actionsPanel = new ActionsPanel(this);
        operationsEnum = OperationsEnum.UNDEFINED;
        digitsPanel = new DigitsPanel(operationsEnum, v1, v2);
        operationsPanel = new OperationsPanel(operationsEnum);

        configureLayout();
    }

    public void resetAC() {
        v1 = "";
        v2 = "";
        operationsEnum = OperationsEnum.UNDEFINED;
    }

    private void configureLayout() {
        setLayout(new GridBagLayout());

        add(screen, new GridBagConstraints(0, 0, 2, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(actionsPanel, new GridBagConstraints(0, 1, 2, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsPanel, new GridBagConstraints(0, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(operationsPanel, new GridBagConstraints(1, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
    }
}
