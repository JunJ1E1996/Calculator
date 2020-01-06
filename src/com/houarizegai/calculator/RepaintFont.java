package com.houarizegai.calculator;

import java.awt.Font;

public class RepaintFont implements Create_Button{
	
	public void repaint() {
		 Field.setFont(Field.getFont().deriveFont(Font.PLAIN));
	}
}
