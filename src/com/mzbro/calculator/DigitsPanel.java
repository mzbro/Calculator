package com.mzbro.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitsPanel extends JPanel {
    private DigitButton[] digits;
    private DigitButton dotButton;

    private String m_v1;
    private String m_v2;

    DigitsPanel(OperationsEnum operation, String _v1, String _v2) {
        m_v1 = _v1;
        m_v2 = _v2;

        digits = new DigitButton[10];
        for (int i = 0; i < 10; ++i) {
            digits[i] = new DigitButton(Integer.toString(i));
            int finalI = i;
            digits[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (operation == OperationsEnum.UNDEFINED) {
                        m_v1 += Integer.toString(finalI);
                    } else {
                        m_v2 += Integer.toString(finalI);
                    }
                }
            });
        }
        dotButton = new DigitButton(".");

        configureLayout();
    }

    private void configureLayout() {
        setLayout(new GridBagLayout());

        // Tak dla fun'u
//        int row = 0;
//        for (int i = 0; i < 9; i++) {
//            add(digits[0], new GridBagConstraints(i %3, ((i % 3) == 0) ? row : ++row, 1, 1, 0.1, 0.1,
//                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
//                    new Insets(0, 0, 0, 0), 0, 0));
//        }

        add(digits[7], new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[8], new GridBagConstraints(1, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[9], new GridBagConstraints(2, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[4], new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[5], new GridBagConstraints(1, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[6], new GridBagConstraints(2, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[1], new GridBagConstraints(0, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[2], new GridBagConstraints(1, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[3], new GridBagConstraints(2, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digits[0], new GridBagConstraints(0, 4, 2, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(dotButton, new GridBagConstraints(2, 4, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
    }
}
