package com.houarizegai.calculator;

import javax.swing.JButton;
import java.awt.Cursor;

public class BtnBack implements Create_Button{

	JButton btn = new JButton("<--");
	BtnBack()
	{
		 btn.setBounds(x[1],y[1],wBtn,hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
