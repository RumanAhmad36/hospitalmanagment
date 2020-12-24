/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

        
        public class formedicine implements ActionListener
        {
         Image im,im2;
         BufferedImage bi,bi2;
         
     JFrame fr;
    JPanel p;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    int id;
    String medicine_name;
    String amount;
    String avilablity;
    String total_amount;
    String pending_amount;
    String medicine_used_for;
    String Manufacture_date;
    String Expire_date;
    String price;
    
    Connection connection;
    PreparedStatement statement;
    ResultSet set;
    Font font;
    public formedicine()
    {
        font=new Font("Ariel", Font.BOLD, 17);
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
        
         
        try {
            bi = ImageIO.read(new File("C:\\Users\\ruman\\Desktop\\jj.jpg"));
            im = bi.getScaledInstance(900, 900, Image.SCALE_SMOOTH);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
   
        fr=new JFrame();
        p=new JPanel(null)
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(im, 0, 0, null);
            }
        };
        
        
        
        
        
        
        
        
        
        fr=new JFrame();
        p=new JPanel(null)
        
        {
            
            @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(im, 0, 0, null);
            }
        };
        
         l1=new JLabel("MEDICAL STORE");
        l2=new JLabel("ID");
        l3=new JLabel("MEDICINE NAME");
    
        l8=new JLabel("AVAILABLITY");
      
        l9=new JLabel("TOTAL AMOUNT");
        l10=new JLabel("PENDING AMOUNT");
        l11=new JLabel("my icon");
         
          l4=new JLabel("MEDICINE USED FOR");
          l5=new JLabel("MANUFACTURE DATE");
          l6=new JLabel("EXPIRE DATE");
          l7=new JLabel("PRICE");
        f1=new JTextField();
        f2=new JTextField();
        f3=new JTextField();
     
        f4=new JTextField();
        f5=new JTextField();
        f6=new JTextField();
        f7=new JTextField();
        f8=new JTextField();
        f9=new JTextField();
        
        JLabel l1=new JLabel("MEDICAL STORE ");
//        Border border =BorderFactory.createLineBorder(Color.CYAN,5);
  //      l1.setBorder(border);
    
  
       // l1.setOpaque(true);
       // l1.setBackground(Color.CYAN);
       // p. add(l1);
                        
        
        Color c=new Color(168,63,105);
        btn1=new JButton("SAVE");
        btn1.setBackground(c);
        btn1.setForeground(Color.WHITE);
        btn2=new JButton("SEARCH");
        btn2.setBackground(c);
         btn2.setForeground(Color.WHITE);
        btn3=new JButton("UPDATE");
         btn3.setBackground(c);
          btn3.setForeground(Color.WHITE);
        btn4=new JButton("CLEAR");
         btn4.setBackground(c);
          btn4.setForeground(Color.WHITE);
        btn5=new JButton("SHOW ALL");
         btn5.setBackground(c);
          btn5.setForeground(Color.WHITE);
        btn6=new JButton("BACK");
         btn6.setBackground(c);
          btn6.setForeground(Color.WHITE);
        btn7=new JButton("LOGOUT");
         btn7.setBackground(c);
         btn7.setForeground(Color.WHITE);
         
           l1.setBounds(340,60,300,30);
           Color d=new Color(70,66,168);
           l1.setForeground(d);
            l1.setFont( new Font("Ariel", Font.BOLD, 30));
    
            l2.setFont(font);
            l3.setFont(font);
            l4.setFont(font);
            l5.setFont(font);
            l6.setFont(font);
            l7.setFont(font);
            l8.setFont(font);
            l9.setFont(font);
        l2.setBounds(120,180,140,40);
        l2.setForeground(d);
        l3.setBounds(120,220,140,40);
        l3.setForeground(d);
        l4.setBounds(120,270,190,40);
        l4.setForeground(d);
        l5.setBounds(120,320,190,40);
        l5.setForeground(d);
      l6.setBounds(120,370,190,40);
      l6.setForeground(d);
        l7.setBounds(120,420,100,40);
     l7.setForeground(d);
        l8.setBounds(120,470,190,40);
        l8.setForeground(d);
        l9.setBounds(120,520,190,40);
        l9.setForeground(d);
        l11.setBounds(120,50,200,100);
        
        f1.setBounds(350,170,140,40);
     f2.setBounds(350,220,140,40);
     f3.setBounds(350,270,140,40);
     f4.setBounds(350,320,140,40);
     f5.setBounds(350,370,140,40);
          f6.setBounds(350,420,140,40);
         f7.setBounds(350,470,140,40);
              f8.setBounds(350,520,140,40);  
            
               
               
             
   
     
          
    
        btn1.setBounds(140,590,100,40);
        btn2.setBounds(140,660,100,40);
        btn3.setBounds(290,590,100,40);
        btn4.setBounds(290,660,100,40);
        btn5.setBounds(410,660,100,40);
        btn6.setBounds(10,50,80,30);
        btn7.setBounds(750,50,100,30);
        
         
                                  
        try {
            bi2 = ImageIO.read(new File("C:\\Users\\ruman\\Desktop\\med.jpg"));
            im2 = bi2.getScaledInstance(l11.getWidth(), l11.getHeight(), Image.SCALE_SMOOTH);
            
            ImageIcon icon = new ImageIcon(im2);
            l11.setIcon(icon);
            
        } catch (IOException ex) {
            Logger.getLogger(Hospitalmanagment.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        fr.add(p);
        p.add(l1);
        p.add(l4);
        p.add(l5);
        p.add(l2);
        p.add(l3);
        p.add(l7);
        p.add(l8);
        p.add(l9);
     
        p.add(l11);
        p.add(f1);
        p.add(f2);
        p.add(f3);

        p.add(f4);
        p.add(f5);
        p.add(f6);
        p.add(f7);
        p.add(f8);
     
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(l6);
        p.add(l7);
        p.add(l8);
        p.add(l9);
        p.add(l10);
        
         p.setBackground(Color.WHITE);
        
        fr.setSize(900,900);
        fr.setVisible(true);
         fr.setResizable(false);
        fr.setTitle("form of patient");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
    }
    public static void main(String args[])
    {
 formedicine m=new formedicine();
        
      
    }
    public void actionPerformed(ActionEvent ae)

    {
       String mes= ae.getActionCommand();
    
       if(mes.equals("SAVE"))
       {
           id=Integer.parseInt(f1.getText());
           medicine_name=f2.getText();
       medicine_used_for=f3.getText();
          Manufacture_date=f4.getText();
         Expire_date=f5.getText();
        price=f6.getText();
        avilablity=f7.getText();
        total_amount=f8.getText();
        
       
       try
       {
           statement=connection.prepareStatement("insert into info values (?,?,?,?,?,?,?,?)");
           statement.setInt(1, id);
           statement.setString(2,medicine_name);
           statement.setString(3,medicine_used_for);
           statement.setString(4, Manufacture_date);
           statement.setString(5,Expire_date);
           statement.setString(6,price);
           statement.setString(7,avilablity);
           statement.setString(8,total_amount);
           statement.executeUpdate();
       }
       
       catch(SQLException e){
           e.printStackTrace();
       }
       
       }
    
        else if(mes.equals("SEARCH"))
                { 
            id=Integer.parseInt(f1.getText());
            
            try
            {
            statement=connection.prepareStatement("select * from info where id=?");
            statement.setInt(1,id);
            set=statement.executeQuery();
               
                if(set.next())
            {
                id=set.getInt(1);
               medicine_name=set.getString(2);
             medicine_used_for=set.getString(3);
              Manufacture_date=set.getString(4);
            Expire_date=set.getString(5);
              price=set.getString(6);
              avilablity=set.getString(7);
              total_amount=set.getString(8);
            
           f1.setText(String.valueOf(id));
            f2.setText (medicine_name);
            f3.setText(medicine_used_for);
            f4.setText(Manufacture_date);
            f5.setText(Expire_date);
            f6.setText(price);
            f7.setText(avilablity);
            f8.setText(total_amount);
          
  }
                }
               catch(SQLException e)
               {
               e.printStackTrace();
               }
                      
               }
        else if(mes.equals("UPDATE"))
                {
                id=Integer.parseInt(f1.getText());
      medicine_name=f2.getText();
      medicine_used_for=f3.getText();
   Manufacture_date=f4.getText();
       Expire_date=f5.getText();
       price=f6.getText();
       avilablity=f7.getText();
       total_amount=f8.getText();
       
       try
                {
                statement=connection.prepareStatement("update info set medicine_name=?,medicine_used_for=?,Manufacture_date=?,Expire_date=?,price=?,avilablity=?,total_amount=? where id=?");
           statement.setString(1,medicine_name);
           statement.setString(2,medicine_used_for);
           statement.setString(3,Manufacture_date);
           statement.setString(4,Expire_date);
           statement.setString(5,price);
         statement.setString(6,avilablity);
         statement.setString(7,total_amount);
         
          statement.setInt(8,id);
           statement.executeUpdate();
                }
                catch(SQLException e)
                        {
                           e.printStackTrace(); 
                        }
                }
        else if(mes.equals("CLEAR"))
                {
              f1.setText(String.valueOf(""));
f2.setText("");
f3.setText("");
f4.setText("");
f5.setText("");
f6.setText("");
f7.setText("");
f8.setText("");


                }
       
        else if(mes.equals("SHOW ALL"))
        {
             tableformedicine t=new tableformedicine();
        }
        else if(mes.equals("BACK"))
                {
                 data1 d=new data1();   
                            fr.dispose();
         
                }
          else if(mes.equals("LOGOUT"))
                {
               Hospitalmanagment hm=new Hospitalmanagment();  
                }
    }
    }
        
        
        
    
        
        
    

