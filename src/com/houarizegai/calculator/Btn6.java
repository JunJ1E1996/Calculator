package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class Btn6 implements Create_Button{

	JButton btn = new JButton("6");
	
	Btn6(){
		btn.setBounds(x[2],y[3],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
}
