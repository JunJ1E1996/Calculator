package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class BtnMod implements Create_Button{
	
	JButton btn = new JButton("%");
	
	BtnMod(){
		btn.setBounds(x[2],y[1],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
