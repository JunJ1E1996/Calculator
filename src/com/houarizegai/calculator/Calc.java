package com.houarizegai.calculator; // THIS CLASS JUST USE TO CALCULATE 

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;

public class Calc {
	
	// inText = new JTextField();
	
	public double compute(double x, String input, char opt) {
		
		// inText.setFont(inText.getFont().deriveFont(Font.BOLD));
		double y = Double.parseDouble(input);
		if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        }
        // inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
		return y;
	}
}
