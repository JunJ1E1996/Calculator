package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class BtnMul implements Create_Button{
	
	JButton btn = new JButton("*");
	
	BtnMul(){
		btn.setBounds(x[3],y[2],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
