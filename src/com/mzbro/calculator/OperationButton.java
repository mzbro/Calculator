package com.mzbro.calculator;

import javax.swing.JButton;
import java.awt.*;

public class OperationButton extends JButton {

    OperationButton(String operation) {
        setText(operation);
    }
}