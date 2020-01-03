package com.houarizegai.calculator; // THIS CLASS JUST USE TO CALCULATE 

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
