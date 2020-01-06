package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class InText implements Create_Button{
	
	JTextField Field = new JTextField("0");
	
	InText(){
		Field.setBounds(x[0],y[0],350,70);
		Field.setEditable(false);
		Field.setBackground(Color.WHITE);
		Field.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
	}
	
	
}
