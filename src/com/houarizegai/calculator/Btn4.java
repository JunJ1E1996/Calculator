package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn4 implements Create_Button{
	
	JButton btn = new JButton("4");
	Btn4(){
		 btn.setBounds(x[0],y[3],wBtn,hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
