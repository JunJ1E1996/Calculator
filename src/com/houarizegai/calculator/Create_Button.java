package com.houarizegai.calculator;

import java.awt.Font;

import javax.swing.JTextField;

public interface Create_Button {
	Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
	int wBtn = 80;// Width Button
    // Height Button
    int hBtn = 70;
    int marginX = 20;
    int marginY = 60;
    int[] x = {marginX, marginX + 90, 200, 290};
    int[] y = {marginY, marginY + 100, marginY + 180, marginY + 260, marginY + 340, marginY + 420};
    
    JTextField Field = new JTextField("0");
}
