package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn2 implements Create_Button{
	
	JButton btn = new JButton("2");
	
	Btn2(){
		btn.setBounds(x[1],y[4],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
