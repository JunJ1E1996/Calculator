package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn8 implements Create_Button{
	
	JButton btn = new JButton("8");
	
	Btn8(){
		
		btn.setBounds(x[1],y[2],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
