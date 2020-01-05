package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn9 implements Create_Button{
	
	JButton btn = new JButton("9");
	
	Btn9(){
		
		btn.setBounds(x[2],y[2],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
