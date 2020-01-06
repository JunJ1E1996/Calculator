
package com.houarizegai.calculator;

import java.awt.Cursor;
import java.awt.Font;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;

public class Calculator {

    private JFrame window; // This is Main Window
    //private JTextField inText;  // Input Text
    private JButton btnAdd, btnPoint, btn0, btnEqual, choixColor;
    private char opt = ' ';             // Storage Operator
    private boolean go = true,          //  Opt != (=)
            addWrite = true;    
    private double val = 0; // Storage Values For Calculate
    private boolean bool = false;
    
    
    InText inText = new InText(); // ADD A JTextField
    /*
        Mx Calculator: 
        X = Row
        Y = Column
    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   C  <-   %   /   |   y[1]
        |   7   8   9   *   |   y[2]
        |   4   5   6   -   |   y[3]
        |   1   2   3   +   |   y[4]
        |   .   0     =     |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */
    
    /*    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   0   1   1   3   |   y[1]
        |   4   5   6   7   |   y[2]
        |   8   9   10  11  |   y[3]
        |   12  13  14  15  |   y[4]
        |   16  17    18    |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */

    Calculator() {
        window = new JFrame("Calculator");
        window.setSize(410,600); // Height And Width Of Window
        window.setLocationRelativeTo(null); // Move Window To Center
        
        Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
        
        choixColor = new JButton();
        choixColor.setBounds(200, 30, 140, 18);
        choixColor.setText("Toggle colors");
        choixColor.setBackground(Color.GREEN.darker());
        choixColor.setForeground(Color.WHITE);
        choixColor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //choixColor.addActionListener(event -> themeColor());
        window.add(choixColor);

        int wBtn = 80;// Width Button
        // Height Button
        int hBtn = 70;
        int marginX = 20;
        int marginY = 60;
        
        int[] x = {marginX, marginX + 90, 200, 290};
        int[] y = {marginY, marginY + 100, marginY + 180, marginY + 260, marginY + 340, marginY + 420};

        //InText inText = new InText(); // ADD A JTextField
        
        window.add(Create_Button.Field);
        
        Calc calc = new Calc();  // THIS WORK TO CALCULATE BEING A CLASS
        
        BtnC btnC = new BtnC();    // create button C
        btnC.btn.addActionListener(event -> {
            repaintFont();
            Create_Button.Field.setText("0");
            opt = ' ';
            val = 0;
        });
        window.add(btnC.btn);
        
        BtnBack btnBack = new BtnBack();    // create button btnBack       
             
        btnBack.btn.addActionListener(event -> {
            repaintFont();
            
            String str = inText.Field.getText();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < (str.length() - 1); i++) {
                str2.append(str.charAt(i));
            }
            if (str2.toString().equals("")) {
                inText.Field.setText("0");
            } else {
                inText.Field.setText(str2.toString());
            }
        });
        window.add(btnBack.btn);
        
        BtnMod btnMod = new BtnMod(); // create button BtnMod
        btnMod.btn.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.Field.getText()))
                if (go) {
                    val = calc.compute(val, inText.Field.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.Field.setText(String.valueOf((int) val));
                    } else {
                        inText.Field.setText(String.valueOf(val));
                    }
                    opt = '%';
                    go = false;
                    addWrite = false;
                }
        });
        window.add(btnMod.btn);
        
        BtnDiv btnDiv = new BtnDiv(); // create button BtnDiv
      
        btnDiv.btn.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.Field.getText()))
                if (go) {
                    val = calc.compute(val, inText.Field.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.Field.setText(String.valueOf((int) val));
                    } else {
                        inText.Field.setText(String.valueOf(val));
                    }
                    opt = '/';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '/';
                }
        });
        window.add(btnDiv.btn);
        
       Btn7 btn7 = new Btn7(); // create button Btn7
        
        btn7.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("7");
                } else {
                    inText.Field.setText(inText.Field.getText() + "7");
                }
            } else {
                inText.Field.setText("7");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn7.btn);
        
        Btn8 btn8 = new Btn8();  // create button Btn8
    
        btn8.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("8");
                } else {
                    inText.Field.setText(inText.Field.getText() + "8");
                }
            } else {
                inText.Field.setText("8");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn8.btn);
        
        Btn9 btn9 = new Btn9(); // create button Btn9
        
        btn9.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("9");
                } else {
                    inText.Field.setText(inText.Field.getText() + "9");
                }
            } else {
                inText.Field.setText("9");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn9.btn);
        
        BtnMul btnMul = new BtnMul(); // create button BtnMul
        
        btnMul.btn.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.Field.getText()))
                if (go) {
                    val = calc.compute(val, inText.Field.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.Field.setText(String.valueOf((int) val));
                    } else {
                        inText.Field.setText(String.valueOf(val));
                    }
                    opt = '*';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '*';
                }
        });
        window.add(btnMul.btn);
        
        Btn4 btn4 = new Btn4(); //  create button Btn4

        btn4.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("4");
                } else {
                    inText.Field.setText(inText.Field.getText() + "4");
                }
            } else {
                inText.Field.setText("4");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn4.btn);
        
        Btn5 btn5 = new Btn5(); //  create button Btn5
        
        btn5.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("5");
                } else {
                    inText.Field.setText(inText.Field.getText() + "5");
                }
            } else {
                inText.Field.setText("5");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn5.btn);
        
        Btn6 btn6 = new Btn6();  //  create button Btn6
        
        btn6.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("6");
                } else {
                    inText.Field.setText(inText.Field.getText() + "6");
                }
            } else {
                inText.Field.setText("6");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn6.btn);
        
        BtnSub btnSub = new BtnSub(); // create button BtnSub
       
        btnSub.btn.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.Field.getText()))
                if (go) {
                    val = calc.compute(val, inText.Field.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.Field.setText(String.valueOf((int) val));
                    } else {
                        inText.Field.setText(String.valueOf(val));
                    }

                    opt = '-';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '-';
                }
        });
        window.add(btnSub.btn);
        
        Btn1 btn1 = new Btn1(); // create button Btn1
       
        btn1.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("1");
                } else {
                    inText.Field.setText(inText.Field.getText() + "1");
                }
            } else {
                inText.Field.setText("1");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn1.btn);
        
        Btn2 btn2 = new Btn2();  // create button Btn2
        
        btn2.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("2");
                } else {
                    inText.Field.setText(inText.Field.getText() + "2");
                }
            } else {
                inText.Field.setText("2");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn2.btn);
        
        Btn3 btn3 = new Btn3(); // create button Btn3
       
        btn3.btn.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("3");
                } else {
                    inText.Field.setText(inText.Field.getText() + "3");
                }
            } else {
                inText.Field.setText("3");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn3.btn);
        
        BtnAdd btnAdd = new BtnAdd(); // create button BtnAdd
        
        btnAdd.btn.addActionListener(event -> { 
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.Field.getText()))
                if (go) {
                    val = calc.compute(val, inText.Field.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.Field.setText(String.valueOf((int) val));
                    } else {
                        inText.Field.setText(String.valueOf(val));
                    }
                    opt = '+';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '+';
                }
        });
        window.add(btnAdd.btn);
        
        btnPoint = new JButton(".");
        btnPoint.setBounds(x[0],y[5],wBtn,hBtn);
        btnPoint.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        btnPoint.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPoint.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                inText.Field.setText(inText.Field.getText() + ".");
            } else {
                inText.Field.setText("0.");
                addWrite = true;
            }
            go = true;
        });
        window.add(btnPoint);
        
        btn0 = new JButton("0");
        btn0.setBounds(x[1],y[5],wBtn,hBtn);
        btn0.setFont(btnFont);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.Field.getText())) {
                    inText.Field.setText("0");
                } else {
                    inText.Field.setText(inText.Field.getText() + "0");
                }
            } else {
                inText.Field.setText("0");
                addWrite = true;
            }
            go = true;
        });
        window.add(btn0);
        
        btnEqual = new JButton("=");
        btnEqual.setBounds(x[2],y[5],2*wBtn+10,hBtn);
        btnEqual.setFont(btnFont);
        btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEqual.addActionListener(event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.Field.getText()))
                if (go) {
                    val = calc.compute(val, inText.Field.getText(), opt);  //               1
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.Field.setText(String.valueOf((int) val));
                    } else {
                        inText.Field.setText(String.valueOf(val));
                    }
                    opt = '=';
                    addWrite = false;
                }
        });
        window.add(btnEqual);
        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If Click into The Red Button => End The Processus
        window.setVisible(true);
    }


    private void repaintFont() {
        inText.Field.setFont(inText.Field.getFont().deriveFont(Font.PLAIN));
    }

    /*private void themeColor() {

        if (bool) {
            choixColor.setText("Toggle colors");
            choixColor.setBackground(Color.GREEN.darker());
            choixColor.setForeground(Color.WHITE);
            btnC.setBackground(null);
            btnBack.setBackground(null);
            btnMod.setBackground(null);
            btnDiv.setBackground(null);
            btnMul.setBackground(null);
            btnSub.setBackground(null);
            btnAdd.setBackground(null);
            btnEqual.setBackground(null);
            btn0.setBackground(null);
            btn1.setBackground(null);
            btn2.setBackground(null);
            btn3.setBackground(null);
            btn4.setBackground(null);
            btn5.setBackground(null);
            btn6.setBackground(null);
            btn7.setBackground(null);
            btn8.setBackground(null);
            btn9.setBackground(null);
            btnPoint.setBackground(null);

            btnC.setForeground(Color.BLACK);
            btnBack.setForeground(Color.BLACK);
            btnMod.setForeground(Color.BLACK);
            btnDiv.setForeground(Color.BLACK);
            btnMul.setForeground(Color.BLACK);
            btnSub.setForeground(Color.BLACK);
            btnAdd.setForeground(Color.BLACK);
            btnEqual.setForeground(Color.BLACK);

            bool = false;
        } 
        else {
            choixColor.setText("Untoggle colors");
            choixColor.setBackground(null);
            choixColor.setForeground(Color.BLACK);
            btnC.setBackground(Color.RED);
            btnBack.setBackground(Color.ORANGE);
            btnMod.setBackground(Color.GREEN);
            btnDiv.setBackground(Color.PINK);
            btnMul.setBackground(Color.PINK);
            btnSub.setBackground(Color.PINK);
            btnAdd.setBackground(Color.PINK);
            btnEqual.setBackground(Color.BLUE);
            btn0.setBackground(Color.WHITE);
            btn1.setBackground(Color.WHITE);
            btn2.setBackground(Color.WHITE);
            btn3.setBackground(Color.WHITE);
            btn4.setBackground(Color.WHITE);
            btn5.setBackground(Color.WHITE);
            btn6.setBackground(Color.WHITE);
            btn7.setBackground(Color.WHITE);
            btn8.setBackground(Color.WHITE);
            btn9.setBackground(Color.WHITE);
            btnPoint.setBackground(Color.WHITE);

            btnC.setForeground(Color.WHITE);
            btnBack.setForeground(Color.WHITE);

            btnMod.setForeground(Color.WHITE);
            btnDiv.setForeground(Color.WHITE);
            btnMul.setForeground(Color.WHITE);
            btnSub.setForeground(Color.WHITE);
            btnAdd.setForeground(Color.WHITE);
            btnEqual.setForeground(Color.WHITE);
            bool = true;
        }
    }*/
    
    
}