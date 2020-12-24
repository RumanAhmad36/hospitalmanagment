/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

   
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;



public class data1 implements ActionListener{
    JFrame fr;
    JPanel p;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField f2,f3,f4,f5,f6,f7,f8,f12,f9,f10,f11;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    JRadioButton rb1,rb2,rb3,rb4;
    JComboBox cb1;
    int id;
    String name,degree,timing,address,specialization,gender,blood_group,city,phone_no,martial_status,joining_date,leaving_date;
    
  Connection connection;
    PreparedStatement statement;
    ResultSet set;
    
    Font font;
    BufferedImage bi,b2;
    Image im;
    JMenuBar mb;
    JMenu m1,m2;
  ButtonGroup bg,bg2;
    
    
    public data1()
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
            bi = ImageIO.read(new File("C:\\Users\\ruman\\Pictures\\hm.jpg"));
            im = bi.getScaledInstance(900, 900, Image.SCALE_SMOOTH);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
   
        
         
        fr=new JFrame();
        p=new JPanel(null)
        {
            
             protected void paintComponent(Graphics g)
            {
                g.drawImage(im, 0, 0, null);
            }
        };
        
        
      
         
         
          l1=new JLabel("DOCTORS PORTAL");
          
          
        l2=new JLabel("ID");
        l3=new JLabel("NAME");
        l4=new JLabel("DEGREE");
        l5=new JLabel("TIMING");
     l6=new JLabel("ADDRESS");
     l7=new JLabel("SPECIALIZATION");
      l8=new JLabel("LEAVING DATE");
     l9=new JLabel("PH_NO");
     l10=new JLabel("JOINING_DATE");
      l11=new JLabel("CITY");
      
     l12=new JLabel("GENDER");
     
     l13=new JLabel("MARTIAL_STATUS");
    l14=new  JLabel("BLOOD_GROUP");
    l15=new JLabel("my icon");
      
      
      
     cb1=new JComboBox();
     cb1.addItem("o+");
     cb1.addItem("A");
     cb1.addItem("A+");
     cb1.addItem("A-");
     cb1.addItem("B");
     cb1.addItem("B+");
     cb1.addItem("B-");
     cb1.addItem("AB+");
     
   
        f2=new JTextField();
        f3=new JTextField();
        f4=new JTextField();
       f5=new JTextField();
        f6=new JTextField();
         f7=new JTextField();
         f8=new JTextField();
     f9=new JTextField();
            f10=new JTextField();
             f11=new JTextField();
              
           
            
                rb1=new JRadioButton("MALE");
                rb2=new JRadioButton("FEMALE");
                rb3=new JRadioButton("SINGLE");
                rb4=new JRadioButton("MARRIED");
        
                Color c=new Color(31,201,99);
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
        
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        bg2=new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);
        
        
        
        
        
        
        l2.setFont(font);
         l3.setFont(font);
         l4.setFont(font);
         l5.setFont(font);
         l6.setFont(font);
         l7.setFont(font);
         l8.setFont(font);
         l9.setFont(font);
         l10.setFont(font);
         l11.setFont(font);
         l12.setFont(font);
         l13.setFont(font);
         l14.setFont(font);
         
           l1.setFont( new Font("Ariel", Font.BOLD, 30));
        l1.setBounds(320,40,300,40);
        Color d=new Color(201,110,31);
       l1.setForeground(d);
        
    
       l2.setBounds(90,160,100,40);
        l2.setForeground(d);

        l3.setBounds(90,210,100,40);
         l3.setForeground(d);
        l4.setBounds(90,260,100,40);
         l4.setForeground(d);
        l5.setBounds(90,310,100,40);
         l5.setForeground(d);
        l6.setBounds(90,360,100,40);
         l6.setForeground(d);
       l7.setBounds(90,410,150,40);
       l7.setForeground(d);
      l8.setBounds(90,460,150,40);
       l8.setForeground(d);
              l9.setBounds(400,160,100,40);
               l9.setForeground(d);
                 l10.setBounds(400,210,170,40);
                  l10.setForeground(d);
                l11.setBounds(400,260,100,40);
            l11.setForeground(d);
           
           
           
                       l12.setBounds(400,310,100,40);
                        l12.setForeground(d);
                          l13.setBounds(400,410,150,40);
                           l13.setForeground(d);
                             l14.setBounds(400,510,150,40);
                              l14.setForeground(d);
                              l15.setBounds(130,40,170,90);
                              
        BufferedImage bi;
        try {
            bi = ImageIO.read(new File("C:\\Users\\ruman\\Pictures\\med.jpg"));
            Image im = bi.getScaledInstance(l15.getWidth(), l15.getHeight(), Image.SCALE_SMOOTH);
            
        ImageIcon icon = new ImageIcon(im);
        l15.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Hospitalmanagment.class.getName()).log(Level.SEVERE, null, ex);
        }
   
                              
                              
        
        f2.setBounds(230,160,100,40);
        f3.setBounds(230,210,100,40);
        f4.setBounds(230,260,100,40);
        f5.setBounds(230,310,100,40);
        f6.setBounds(230,360,100,40);
 f7.setBounds(230,410,100,40);
  f8.setBounds(230,460,100,40);
    f9.setBounds(550,160,100,40);
     f10.setBounds(550,210,100,40);
      f11.setBounds(550,260,100,40);
     
      
        
 
 rb1.setBounds(550,320,100,40);
  rb1.setBackground(d);
  rb1.setForeground(Color.WHITE);
 rb2.setBounds(550,370,100,40);
 rb2.setForeground(Color.WHITE);
  rb2.setBackground(d);
   rb3.setBounds(550,420,100,40);
    rb3.setBackground(d);
    rb3.setForeground(Color.WHITE);
     rb4.setBounds(550,470,100,40);
      rb4.setBackground(d);
      rb4.setForeground(Color.WHITE);
    cb1.setBounds(550,520,100,40);
     cb1.setBackground(d);
     cb1.setBackground(c);
     
    
    
    
      

btn1.setBounds(100,600,120,30);

btn2.setBounds(100,670,120,30);
btn3.setBounds(240,600,120,30);
btn4.setBounds(240,670,120,30);
btn5.setBounds(370,670,120,30);
       btn6.setBounds(10,40,80,40); 
       btn7.setBounds(690,40,100,40);

       
       
       Color k=new Color(109,119,210);
  p.setBackground(k);
 
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        p.add(l6);
        p.add(l7);
        p.add(l8);
        p.add(l9);
        p.add(l10);
        p.add(l11);
        p.add(l12);
        p.add(l13);
        p.add(l14);
        p.add(l15);
    
        p.add(f2);
        p.add(f3);
        p.add(f4);
        p.add(f5);
        p.add(f6);
        p.add(f7);
         p.add(f8);
           p.add(f9);
        p.add(f10);
        p.add(f11);
    
        
        
       p.add(rb1);
       p.add(rb2);
       p.add(rb3);
       p.add(rb4);
       p.add(cb1);
       
      
      
     
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
      p.add(btn6);
      p.add(btn7);
     
       
        
           fr.add(p);
        
        fr.setSize(900,900);
        fr.setResizable(false);
        fr.setVisible(true);
      
        fr.setTitle("form");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        cb1.addActionListener(this);
        
        
        
    }
    public static void main(String args[])
    {
   data1 d=new data1();
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String mes=ae.getActionCommand();
        if(mes.equals("SAVE"))
        {
            id=Integer.parseInt(f2.getText());
            String name=f3.getText();
            String degree=f4.getText();
            String timing=f5.getText();
            String address=f6.getText();
            String specialization=f7.getText();
            String leaving_date=f8.getText();
            String phone_no=f9.getText();
              String joining_date=f10.getText();
                String city=f11.getText();
                
                
        if(rb1.isSelected())
        {
            gender=rb1.getText();
        }
        else if(rb2.isSelected())
        {
            gender=rb2.getText();
        }
        if(rb3.isSelected())
        {
           martial_status=rb3.getText();
        }
        else if(rb4.isSelected())
        {
          martial_status=rb4.getText();
        }
      
           blood_group=cb1.getSelectedItem().toString();
            
            try
            {
             statement=connection.prepareStatement("insert into data values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                statement.setInt(1,id);
           statement.setString(2,name);
           statement.setString(3,degree);
           statement.setString(4,timing);
           statement.setString(5,address);
            statement.setString(6,specialization);
             statement.setString(7,leaving_date);
              statement.setString(8,phone_no);
               statement.setString(9,joining_date);
                statement.setString(10,city);
                 statement.setString(11,gender);
                  statement.setString(12,martial_status);
                   statement.setString(13,blood_group);
                   
           statement.executeUpdate();
            }
            
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            
        }
        else if(mes.equals("SEARCH"))
        {
              id=Integer.parseInt(f2.getText());
            
            try
            {
            statement=connection.prepareStatement("select * from data where id=?");
            statement.setInt(1,id);
            set=statement.executeQuery();
               
                if(set.next())
            {
                id=set.getInt(1);
               name=set.getString(2);
             degree=set.getString(3);
               timing=set.getString(4);
             address=set.getString(5);
              specialization=set.getString(6);
             leaving_date=set.getString(7);
              phone_no=set.getString(8);
              joining_date=set.getString(9);
              city=set.getString(10);
              gender=set.getString(11);
            martial_status=set.getString(12);
              blood_group=set.getString(13);
              
            
           f2.setText(String.valueOf(id));
            f3.setText (name);
            f4.setText(degree);
            f5.setText(timing);
            f6.setText(address);
             f7.setText(specialization);
              f8.setText(leaving_date);
               f9.setText(phone_no);
                f10.setText(joining_date);
                 f11.setText(city);
                  
            if(gender.equals("MALE"))
            {
                rb1.setSelected(true);
            }
            else if(gender.equals("FEMALE"))
            {
                rb2.setSelected(true);
            }
            if(martial_status.equals("SINGLE"))
            {
                rb3.setSelected(true);
            }
            else if(martial_status.equals("MARRIED"))
            {
                rb4.setSelected(true);
            }
          
            
            
            
  }
                }
               catch(SQLException e)
               {
               e.printStackTrace();
               }
        }
        else if(mes.equals("UPDATE"))
        {
             id=Integer.parseInt(f2.getText());
     name=f3.getText();
       degree=f4.getText();
   timing=f5.getText();
       address=f6.getText();
       specialization=f7.getText();
          leaving_date=f8.getText();
            phone_no=f9.getText();
               joining_date=f10.getText();
                 city=f11.getText();
                
        if(rb1.isSelected())
        {
            gender=rb1.getText();
        }
        else if(rb2.isSelected())
        {
            gender=rb2.getText();
        }
        if(rb3.isSelected())
        {
            martial_status=rb3.getText();
        }
        else if(rb4.isSelected())
        {
            martial_status=rb4.getText();
        }
        
        
        
        
        
        
                     
                 
       try
                {
                statement=connection.prepareStatement("update data set name=?,degree=?,timing=?,address=?,specialization=?,leaving_date=?,phone_no=?,joining_date=?,city=?,gender=?,martial_status=?,blood_group=? where id=?");
           statement.setString(1,name);
           statement.setString(2,degree);
           statement.setString(3,timing);
           statement.setString(4,address);
             statement.setString(5,specialization);
               statement.setString(6,leaving_date);
                 statement.setString(7,phone_no);
                   statement.setString(8,joining_date);
                     statement.setString(9,city);
                       statement.setString(10,gender);
                         statement.setString(11,martial_status);
                           statement.setString(12,blood_group);
                          
          statement.setInt(13,id);
           statement.executeUpdate();
                }
                catch(SQLException e)
                        {
                           e.printStackTrace(); 
                        }
                }
        else if(mes.equals("CLEAR"))
                {
              f2.setText(String.valueOf(""));
f3.setText("");
f4.setText("");
f5.setText("");
f6.setText("");
f7.setText("");
f8.setText("");
f9.setText("");
f10.setText("");
f11.setText("");
                }
else if(mes.equals("SHOW ALL"))
        {
        fordoctor j=new fordoctor();
        }
else if(mes.equals("BACK"))
{
      patientList p=new patientList();
      fr.dispose();
}
else if(mes.equals("LOGOUT"))
{
      Hospitalmanagment hm=new Hospitalmanagment();
 
}

                }
    }
        
        
        
    