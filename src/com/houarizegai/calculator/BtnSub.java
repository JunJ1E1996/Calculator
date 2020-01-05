package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;

public class BtnSub  implements Create_Button{
	
	JButton btn = new JButton("-");
	
	BtnSub(){
		 btn.setBounds(x[3],y[3],wBtn,hBtn);
	     btn.setFont(btnFont);
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
