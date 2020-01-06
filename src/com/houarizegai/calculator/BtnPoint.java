package com.houarizegai.calculator;

import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;

public class BtnPoint implements Create_Button{
	
	JButton btn = new JButton(".");
	
	BtnPoint(){
		 btn.setBounds(x[0],y[5],wBtn,hBtn);
	     btn.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
	     btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}
