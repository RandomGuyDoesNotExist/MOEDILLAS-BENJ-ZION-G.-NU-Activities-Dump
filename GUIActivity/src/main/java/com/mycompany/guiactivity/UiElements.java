/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiactivity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import java.awt.event.*;
/**
 *
 * @author ADMIN
 */
public class UiElements extends JFrame {
    JLabel nameText, ageText, hairText, rateText, hoursText, salaryText, birthText, output, nameOutput,ageOutput,hairOutput,birthyearOutput,photoText,photoText2;
    JTextField name, age, hair, rate, hours,birth;
  
    public static void main(String[] args){
        new UiElements(); 
    }
   public UiElements(){
       JLabel a = new JLabel();
         ImageIcon image = new ImageIcon("mariano.png");
         a.setIcon(image); 
         a.setText("ENTER YOUR PERSONAL INFORMATION");
         a.setBounds(0, 5, 400, 15);
         a.setFont(new Font("Times New Roman", Font.BOLD,15));
         a.setBackground(new java.awt.Color(243, 58, 106));
         
         
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(243, 58, 106));
        panel.add(a);
        panel.setBounds(0, 19, 25000,20);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(new java.awt.Color(74, 4, 4));
        panel2.setBounds(25, 30, 380,200);
        //255, 245, 238
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GUI ACTIVITY - BENJ MOEDILLAS - ITE 105");
        setResizable(true);
        setLayout(null);
        setSize(500,300);
        getContentPane().setBackground(new java.awt.Color(255, 245, 238));
        setVisible(true);
        
        
        
        
                 nameText = new JLabel("Enter your name :");
                 ageText = new JLabel("Enter your age :");
                 hairText = new JLabel("Enter your hair color :");
                 rateText = new JLabel("Enter rate :");
                 hoursText = new JLabel("Enter hours worked :");
                 birthText = new JLabel("Enter your birthyear :"); 
                 salaryText = new JLabel("Results");
                 
                 output = new JLabel();
                 nameOutput = new JLabel();
                 ageOutput = new JLabel();
                 hairOutput = new JLabel();
                 birthyearOutput = new JLabel();
                 photoText = new JLabel(new ImageIcon("C:\\Users\\ADMIN\\OneDrive - National University\\Documents\\NetBeansProjects\\GUIActivity\\src\\main\\resources\\lance2.jpg"));
                 photoText2 = new JLabel(new ImageIcon("C:\\Users\\ADMIN\\OneDrive - National University\\Documents\\NetBeansProjects\\GUIActivity\\src\\main\\resources\\chi3.jpg"));
                 
                 name = new JTextField();
                 age = new JTextField();
                 hair = new JTextField();
                 rate = new JTextField();
                 hours = new JTextField();
                 birth = new JTextField();
                 
         JButton button = new JButton("ENTER");
         button.setBackground(new java.awt.Color(81, 65, 79));
         button.setForeground(new java.awt.Color(243, 58, 106));
         button.setFont(new Font("Arial",Font.BOLD,18));
         button.setBounds(220, 165, 100, 50);
         button.setBorder(BorderFactory.createEmptyBorder());
         button.setFocusable(false);
         
         
         nameText.setBounds(30,40,150,20);
         nameText.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         name.setText("Name here"); 
         name.setBackground(new java.awt.Color(255, 182, 193));
         name.setBounds(220,40,150,20);
         name.setBorder(BorderFactory.createEmptyBorder());
             
         ageText.setBounds(30,60,150,20);
         ageText.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         age.setText("Age here");
         age.setBackground(new java.awt.Color(255, 182, 193));
         age.setBounds(220,60,150,20);   
         age.setBorder(BorderFactory.createEmptyBorder());
         
         hairText.setBounds(30,80,160,20);
         hairText.setFont(new Font("Brittanic Bold", Font.BOLD,14));
         hair.setText("Hair color here");
         hair.setBackground(new java.awt.Color(255, 182, 193));
         hair.setBounds(220,80,150,20);    
         hair.setBorder(BorderFactory.createEmptyBorder());
         
          rateText.setBounds(30,100,150,20);
          rateText.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         rate.setText("Rate here");        
         rate.setBackground(new java.awt.Color(255, 182, 193));
         rate.setBounds(220,100,150,20);
         rate.setBorder(BorderFactory.createEmptyBorder());
         
          hoursText.setBounds(30,120,150,20);
          hoursText.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         hours.setText("Hours worked here");       
         hours.setBackground(new java.awt.Color(255, 182, 193));
         hours.setBounds(220,120,150,20); 
         hours.setBorder(BorderFactory.createEmptyBorder());
         
         birthText.setBounds(30,140,150,20);
         birthText.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         birth.setText("Birth year here");     
         birth.setBackground(new java.awt.Color(255, 182, 193));
         birth.setBounds(220,140,150,20);
         birth.setBorder(BorderFactory.createEmptyBorder());
         
         
         //OUTPUT BOUNDS SET UP
         output.setBounds(150, 220, 1000, 50);
         nameOutput.setBounds(150, 235, 1000, 50);
         ageOutput.setBounds(150, 250, 1000, 50);
         hairOutput.setBounds(150, 265, 1000, 50);
         birthyearOutput.setBounds(150, 280, 1000, 50);
         photoText.setBounds(150,320,164,246);
         photoText2.setBounds(100,320,600,600);
         
         // color foreground 
         //LABEL
         nameText.setForeground(new java.awt.Color(243, 58, 106));
         ageText.setForeground(new java.awt.Color(243, 58, 106));
         hairText.setForeground(new java.awt.Color(243, 58, 106));
         rateText.setForeground(new java.awt.Color(243, 58, 106));
         hoursText.setForeground(new java.awt.Color(243, 58, 106));
         birthText.setForeground(new java.awt.Color(243, 58, 106));
         // TEXTFIELD
         name.setForeground(new java.awt.Color(243, 58, 106));
         age.setForeground(new java.awt.Color(243, 58, 106));
         hair.setForeground(new java.awt.Color(243, 58, 106));
         rate.setForeground(new java.awt.Color(243, 58, 106));
         hours.setForeground(new java.awt.Color(243, 58, 106));
         birth.setForeground(new java.awt.Color(243, 58, 106));
         
         // OUTPUT LABELS
         output.setForeground(new java.awt.Color(243, 58, 106));
         nameOutput.setForeground(new java.awt.Color(243, 58, 106));
         ageOutput.setForeground(new java.awt.Color(243, 58, 106));
         hairOutput.setForeground(new java.awt.Color(243, 58, 106));
         birthyearOutput.setForeground(new java.awt.Color(243, 58, 106));
         
         // OUTPUT LABEL FONT
         
         output.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         nameOutput.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         ageOutput.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         hairOutput.setFont(new Font("Brittanic Bold", Font.BOLD,15));
         birthyearOutput.setFont(new Font("Brittanic Bold", Font.BOLD,15));
             
         //add to frame
         add(nameText); add(name); add(ageText); 
         add(age);add(hairText); add(hair);
         add(rateText); add(rate);  add(hoursText); 
         add(hours); add(birthText); add(birth);    
         add(button); add(panel); add(a);  add(output); add(nameOutput); add(ageOutput);
         add(hairOutput); add(birthyearOutput); 
         //add(panel2);
        // pack();
        
        // ACTION
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String nameInput = name.getText();
               String ageInput = age.getText();
               String hairInput = hair.getText();
               int birthYearInput = Integer.parseInt(birth.getText());
               
               int rate2 = Integer.parseInt(rate.getText()); 
               int hours2 = Integer.parseInt(hours.getText());
               int total = rate2 * hours2;
               setSize(500,635);
               
                    
               switch(nameInput){
                   case "Lance": remove(photoText2);
                                add(photoText);
                   break;
                   case "Lance Bailon": remove(photoText2);
                                add(photoText);
                   break;
                   case "Chi": setSize(800,1000); remove(photoText);
                                add(photoText2);
                   break;
                   case "Chi Atienza":setSize(800,980); remove(photoText);
                                add(photoText2);
                   break;
                   default: setSize(500,470); remove(photoText); remove(photoText2);
               }
               
             //  output.setText("YOUR SALARY IS: $" + (hours2 + rate2));
               output.setText("YOUR SALARY IS: $" + total);
               nameOutput.setText("Name : "+ nameInput);
               ageOutput.setText("Age : " + ageInput);
               hairOutput.setText("Hair Color : "+ hairInput);
               birthyearOutput.setText("Birthyear : "+birthYearInput);
               
               revalidate();
               repaint();


            }
        });
        
        
        
    }
    
}
