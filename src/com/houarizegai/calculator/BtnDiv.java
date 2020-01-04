package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class BtnDiv implements Create_Button{
	
	JButton btn = new JButton("/");
	
	BtnDiv(){
		btn.setBounds(x[3],y[1],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
