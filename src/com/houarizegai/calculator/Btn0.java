package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn0 implements Create_Button{
	
	JButton btn = new JButton("0");
	
	Btn0(){
		btn.setBounds(x[1],y[5],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
