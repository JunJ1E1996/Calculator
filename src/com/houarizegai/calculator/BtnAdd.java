package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class BtnAdd implements Create_Button{
	
	JButton btn = new JButton("+");
	
	BtnAdd(){
		btn.setBounds(x[3], y[4], wBtn, hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
