/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class Hospitalmanagment implements ActionListener {
    JFrame jf;
    JPanel p;
    JTextField f1,f2;
    JLabel l1,l2,l3;
    JButton btn1,btn2;
    ButtonGroup bg;
 
   
    String loginid,password,type,forgot_password;
   JRadioButton rb1,rb2,rb3;
    
   Connection connection;
   PreparedStatement statement;
   ResultSet set;
   Font font;
   String login_id;
    BufferedImage bi;
    Image im;
    
    public Hospitalmanagment()
    {
        font=new Font("Ariel", Font.BOLD, 19);
        try
        {
                 
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
        
        jf=new JFrame();
        
        l1=new JLabel("login id");

        
         l2=new JLabel("password");
        
        l3=new JLabel("HOSPITAL MANAGMENT SYSTEM");
        
        Color c=new Color(28,35,39);
         l3.setForeground(c);
        
         
         
        try {
            bi = ImageIO.read(new File("C:\\Users\\ruman\\Desktop\\zz.png"));
            im = bi.getScaledInstance(900, 900, Image.SCALE_SMOOTH);
            
        } 
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
   //
   
//        l3.setIcon(icon);
        p=new JPanel(null)
        {
            
            protected void paintComponent(Graphics g)
            {
               g.drawImage(im, 0, 0, null);
            
        }
                };
        f1=new JTextField();
        f2=new JTextField();
        rb1=new JRadioButton("ADMIN");
        rb2=new JRadioButton("DOCTOR");
        rb3=new JRadioButton("CHEMIST");
      
       bg=new ButtonGroup();
       bg.add(rb1);
       bg.add(rb2);
       bg.add(rb3);
    
        
        btn1=new JButton("FORGOT PASSWORD");
        
        
        
        
        btn2=new JButton("LOGIN");
        jf.setSize(700,700);
        jf.setResizable(false);
    jf.setTitle("hospital managment");
   
   
     Color l=new Color(171,230,137);
    // rb1.setFont(font);
     //rb2.setFont(font);
     //rb3.setFont(font);
     
     rb1.setOpaque(false);
     
     rb2.setOpaque(false);
     rb3.setOpaque(false);
    rb1.setForeground(c);
    rb1.setBackground(l);
    rb2.setForeground(c);
    rb2.setBackground(l);
    rb3.setForeground(c);
    rb3.setBackground(l);
    rb1.setFont(new Font("Ariel", Font.BOLD, 15));
    rb2.setFont(new Font("Ariel",Font.BOLD,15));
     rb3.setFont(new Font("Ariel",Font.BOLD,15));
     l1.setBounds(80,140,100,30);
     l1.setFont(font);
     l2.setFont(font);
     l1.setForeground(c);
    l2.setBounds(80,200,100,30);
    l2.setForeground(c);
    l3.setBounds(60,50,400,50);
    l3.setForeground(c);
     f1.setBounds(180,140,140,30);
    f2.setBounds(180,200,140,30);
    rb1.setBounds(70,250,80,80);
   
    rb2.setBounds(160,250,120,80);
    rb3.setBounds(250,250,120,80);
   btn1.setBounds(50,400,160,40);
   Color d=new Color(235,106,91);
  btn1.setBackground(d);
   btn2.setBackground(d);
   btn1.setForeground(Color.WHITE);
   btn2.setForeground(Color.WHITE);
   btn2.setBounds(250,400,160,40);
   p.add(btn1);
   p.add(btn2);

      //  BufferedImage bi;
       // try {
         //   bi = ImageIO.read(new File("C:\\Users\\ruman\\Pictures\\Login.jpg"));
           // Image im = bi.getScaledInstance(l2.getWidth(), l2.getHeight(), Image.SCALE_SMOOTH);
            
       // ImageIcon icon = new ImageIcon(im);
       // l2.setIcon(icon);
       // } catch (IOException ex) {
        //    Logger.getLogger(Hospitalmanagment.class.getName()).log(Level.SEVERE, null, ex);
  //      }
   
       
        
    l3.setFont( new Font("Ariel", Font.BOLD, 20));
    
    
   p.add(rb3);
   jf.add(p);
   p.add(f1);
   p.add(f2);
   p.add(rb2);
   p.add(rb1);
   p.add(l1);
   p.add(l2);
   p.add(l3);
   Color k=new Color(171,230,137);
   p.setBackground(k);
   btn1.addActionListener(this);
   btn2.addActionListener(this);
    
    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String args[])
            
    {
        Hospitalmanagment hm=new Hospitalmanagment();
    }
       
    public void actionPerformed(ActionEvent ae)
    {
        String mes=ae.getActionCommand();
      
      if(mes.equals("LOGIN"))
        {
             login_id=f1.getText();
             password=f2.getText();
             
             
             if(rb1.isSelected())
             {
                type="admin";
             }
             else if(rb2.isSelected())
             {
                 type="doctor";
             }
             else if(rb3.isSelected())
             {
                 type="chemist";
             }
        
        
             try
            {
            statement=connection.prepareStatement("select * from account where  login_id=? and password=? and type=?");
            statement.setString(1,login_id);
            statement.setString(2,password);
            statement.setString(3,type);
            set=statement.executeQuery();
               
                if(set.next())
            {
                if(type.equals("admin"))
                {
                    patientList p = new patientList();
                    jf.dispose();
                }
                else if(type.equals("doctor"))
                {
                    data1 d=new data1();
                    jf.dispose();
                }
                else if(type.equals("chemist"))
                {
                    formedicine m=new formedicine();
                    jf.dispose();
                }
            }
                else
               {
                {
                    JOptionPane.showMessageDialog(jf, "invalid username or password");
                }
                }
            }
               catch(SQLException e)
                       {
               e.printStackTrace();
            }
        }
      else if(mes.equals("FORGOT PASSWORD"))
      {
         question q=new question();
         jf.dispose();
        
    
      }
            
               }
                    
        }
            
             
   
        
      
    
    

