package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn1 implements Create_Button{
	
	JButton btn = new JButton("1");
	
	Btn1(){
		btn.setBounds(x[0],y[4],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
}
