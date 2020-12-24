/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;





public class question  implements ActionListener {
    
    JTextField tf1,tf2,tf3,tf4;
    JButton btn1,btn2;
    JLabel l1,l2,l3,l4,l5;
    JComboBox cb1;
    JPanel p;
    JFrame jf;
     String login_id,question,answer,mes,s,new_password,confirm_password,password;
     Connection connection;
     PreparedStatement statement;
     ResultSet set;
     BufferedImage bi;
     Image im;
    Font font;
    
    public question(){
        
        
        try
        {
               font = new Font("Ariel", Font.BOLD, 17);
                 
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        tf1=new JTextField();
         tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        btn1=new JButton("VERIFY");
        btn2=new JButton("UPDATE PASSWORD");
        
        
         
        try {
            bi = ImageIO.read(new File("C:\\Users\\ruman\\Desktop\\great.jpg"));
            im = bi.getScaledInstance(900, 900, Image.SCALE_SMOOTH);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
      
        p=new JPanel(null)
        {
          @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(im, 0, 0, null);
            }
        };
        
       
        l1=new JLabel("SECRET_QUESTION");
        l2=new JLabel("ENTER NEW PASSWORD");
        l3=new JLabel("CONFIRM NEW PASSWORD");
        l4=new JLabel("ENTER LOGIN ID");
        l5=new JLabel("ANSWER");
        
       
        cb1=new JComboBox();
     
        cb1.addItem("your favourite color");
        cb1.addItem("your first school");
         cb1.addItem("Your pet name");
        // cb1.setBackground(Color.DARK_GRAY);
       Color d=new Color(80,106,64);
       cb1.setBackground(d);
        
        jf=new JFrame();
        l4.setBounds(20,30,300,80);
        l5.setBounds(20,130,300,80);
        
        l1.setBounds(20,90,200,40);
        tf4.setBounds(260,40,180,40);
        tf1.setBounds(260,140,200,40);
        btn1.setBounds(260,200,140,40);
          Color c=new Color(204,229,255);
        btn1.setBackground(c);
        btn1.setForeground(Color.WHITE);
                
        l2.setBounds(20,250,240,40);
        l3.setBounds(20,300,240,40);
        tf2.setBounds(260,250,150,40);
        tf3.setBounds(260,300,150,40);
        btn2.setBounds(260,350,180,40);
      
        btn2.setBackground(c);
        btn2.setForeground(Color.WHITE);
     
        cb1.setBounds(260,90,200,40);
        cb1.setForeground(Color.WHITE);
       
       
        
         font = new Font("Ariel", Font.BOLD, 17);
         cb1.setFont(font);
         btn1.setFont(font);
        
        
        
         Color l=new Color(171,230,137);
         l1.setForeground(l);
         
            l4.setForeground(c);
             l5.setForeground(c);
         l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
         l4.setFont(font);
          l5.setFont(font);
        
        p.add(btn1);
        p.add(btn2);
        p.add(tf2);
        p.add(tf3);
        p.add(tf1);
        p.add(tf4);
        p.add(l4);
        p.add(l5);
        
        p.add(l1);
        p.add(l2);
        p.add(l3);
        jf.add(p);
        p.add(cb1);
        
        l2.setVisible(false);
        l3.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        btn2.setVisible(false);
        
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
         cb1.addActionListener(this);
     
        
        
              }
    public static void main(String rags[]){
        question q=new question();
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String mes=ae.getActionCommand();
        
          if(mes.equals("VERIFY"))
        {
            login_id=tf4.getText();
            answer=tf1.getText();
            question=cb1.getSelectedItem().toString();
            
          try
          {
             statement=connection.prepareStatement("select * from account where  login_id=? and question=? and answer=?");
            statement.setString(1,login_id);
            statement.setString(2, question);
            statement.setString(3,answer);
            set=statement.executeQuery();
            
            if(set.next())
            {
                l2.setVisible(true);
                l3.setVisible(true);
                tf2.setVisible(true);
                tf3.setVisible(true);
                btn2.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(jf, "not found");
            }
          }
          catch(SQLException e){
              e.printStackTrace();
              
         
        }
        }
        
          else if(mes.equals("UPDATE PASSWORD"))
        {
            login_id=tf4.getText();
            
            new_password=tf2.getText();
            confirm_password=tf3.getText();
                    
             try
             {
                 statement=connection.prepareStatement("update account set password=? where login_id=?");
                 statement.setString(1,new_password);
                 statement.setString(2,login_id);
                 int i=statement.executeUpdate();
             
                 if(i>0)
                 {
                     JOptionPane.showMessageDialog(jf, "password updated");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(jf, "not updated");
                 }
             }
             catch(SQLException e)
             {
                 e.printStackTrace();
             }
                    
                    
        }
          
           
        

          
             
    }
    }

    
    
    

