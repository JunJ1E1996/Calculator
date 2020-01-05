package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn7 implements Create_Button{
	 
	JButton btn = new JButton("7");
	
	Btn7(){
		btn.setBounds(x[0],y[2],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
