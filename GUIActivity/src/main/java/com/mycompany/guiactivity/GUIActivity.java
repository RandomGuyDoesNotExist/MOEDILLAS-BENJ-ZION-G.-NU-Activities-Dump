/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiactivity;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class GUIActivity {

    public static void main(String[] args) {
        
     JFrame frame = new JFrame(); 
  //  JPanel panel = new JPanel();
    frame.setSize(500,750);
    frame.setResizable(false);
    frame.getContentPane().setBackground(new java.awt.Color(255, 192, 203));
   // panel.add(new JButton("HI"));
   // frame.getContentPane().add(panel);
   frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel nameText, ageText, hairText, rateText, hoursText, salaryText, birthText = null;
    JTextField name = null, age = null, hair = null, rate = null, hours = null,birth = null;
    
    
    nameText = new JLabel("Enter your name :");
    ageText = new JLabel("Enter your age :");
    hairText = new JLabel("Enter your hair color :");
    rateText = new JLabel("Enter rate :");
    hoursText = new JLabel("Enter hours worked :");
    birth.setText("Enter your birthyear :");
    
    
    JButton button = new JButton("ENTER");
         

         nameText.setBounds(30,40,150,20);
         name.setText("Name here"); 

         ageText.setBounds(30,40,150,20);
         
          nameText.setForeground(Color.green);
         ageText.setForeground(Color.green);
         hairText.setForeground(Color.green);
         rateText.setForeground(Color.green);
         hoursText.setForeground(Color.green);
         birthText.setForeground(Color.green);
        
  
    
        frame.add(nameText); frame.add(name); frame.add(ageText); 
         frame.add(age);frame.add(hairText); frame.add(hair);
         frame.add(rateText); frame.add(rate);  frame.add(hoursText); 
         frame.add(hours); frame.add(birthText); frame.add(birth);     
         
         frame.pack();
         
         
         
         
    }
}
