package com.houarizegai.calculator;

import java.awt.Cursor;
import java.awt.Font;
import java.util.regex.Pattern;

import javax.swing.JButton;

public class BtnSub implements Create_Button{
	
	
	JButton btn = new JButton("-");
	
	BtnSub(){
		 btn.setBounds(x[3],y[3],wBtn,hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	            
	          
	}
	void repaintFont() {
        Field.setFont(Field.getFont().deriveFont(Font.PLAIN));
    }
}
