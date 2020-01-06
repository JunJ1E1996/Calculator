package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn3 implements Create_Button{
	
	JButton btn = new JButton("3");
	
	Btn3(){
		 btn.setBounds(x[2], y[4], wBtn, hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
