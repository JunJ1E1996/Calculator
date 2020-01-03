package com.houarizegai.calculator;

import javax.swing.JButton;
import java.awt.Cursor;


public class BtnC implements Create_Button{
	
	JButton btn = new JButton("C");
	
	public BtnC()
	{
		btn.setBounds(x[0],y[1],wBtn,hBtn);
        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
