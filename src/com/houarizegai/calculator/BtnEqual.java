package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class BtnEqual implements Create_Button{

	JButton btn = new JButton("=");
	
	BtnEqual(){
		 btn.setBounds(x[2],y[5],2*wBtn+10,hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
