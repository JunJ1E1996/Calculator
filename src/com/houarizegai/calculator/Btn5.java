package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn5 implements Create_Button{
	
	JButton btn = new JButton("5");
	
	Btn5(){
		 btn.setBounds(x[1],y[3],wBtn,hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
}
