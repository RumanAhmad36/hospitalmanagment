/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.swing.JRadioButton;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;



import javax.swing.JButton;
import javax.swing.JRadioButton;

public class patientList  implements ActionListener {
     JFrame fr;
    JPanel p;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
    JTextField f1,f2,f3,f4,f5,f6,f7,f10,f11,f12,f13,f14,f15,f16;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
    
   
     
    Image i;
    int id;
    String patient_name,age,city,date,ph_no,ward_no,bed_no;
    String Disease;
    String admit_date;
    String States;
    String Release_date;
    String Room_Type;
    String Condition,gender,martial_status;
    
    PreparedStatement statement;
    Connection connection;
    ResultSet set;
    
    String s;
    
    ButtonGroup bg,bg2,bg3,bg4;

    BufferedImage bi;
    Image im;

    BufferedImage bi2;
    Image im2;
    
    Font font;
    
    public patientList ()
    {
        font = new Font("Ariel", Font.BOLD, 17);
        
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
            @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(im, 0, 0, null);
            }
        };
        l1=new JLabel("ID");
        l2=new JLabel("PATIENT NAME");
        l3=new JLabel("DISEASE");
        l4=new JLabel("ADMIT DATE");
        l5=new JLabel("RELEASE DATE");
        l6=new JLabel("STATES");
        l7=new JLabel("ROOM TYPE");
        l8=new JLabel("CONDITION");
        l9=new JLabel("PATIENT PORTAL");
    
        l9.setFont( new Font("Ariel", Font.BOLD, 30));
        l10=new JLabel("AGE");
        l11=new JLabel("city");
        l12=new JLabel("DATE");
        l13=new JLabel("PH_NO");
        l14=new JLabel("WARD_NO");
        l15=new JLabel("BED_NO");
        l16=new JLabel("GENDER");
        l17=new JLabel("MARTIAL_STATUS");
        l18=new JLabel("my icon");
        
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);
         l6.setFont(font);
          l7.setFont(font);
           l8.setFont(font);
           
             l10.setFont(font);
              l11.setFont(font);
               l12.setFont(font);
                l13.setFont(font);
                 l14.setFont(font);
                  l15.setFont(font);
          
                   l16.setFont(font);
                    l17.setFont(font);
        
        f1=new JTextField();
        f2=new JTextField();
        f3=new JTextField();
        f4=new JTextField();
        f5=new JTextField();
        f6=new JTextField();
        f7=new JTextField();
        f10=new JTextField();
        f11=new JTextField();
        f12=new JTextField();
        f13=new JTextField();
        f14=new JTextField();
        f15=new JTextField();
        
      
        rb1=new JRadioButton("AC");
        rb2=new JRadioButton("NON Ac");
        rb3=new JRadioButton("EMERGENCY");
        rb4=new JRadioButton("NON EMERGENCY");
          rb5=new JRadioButton("MALE");
        rb6=new JRadioButton("FEMALE");
         rb7=new JRadioButton("SINGLE");
        rb8=new JRadioButton("MARRIED");
        
        
        btn1=new JButton("SAVE");
         Color a = new Color(146, 4, 182);
        btn1.setBackground(a);
        btn1.setForeground(Color.WHITE);
        
        btn2=new JButton("SEARCH");
           btn2.setForeground(Color.WHITE);
          btn2.setBackground(a);
        btn3=new JButton("UPDATE");
          btn3.setForeground(Color.WHITE);
          btn3.setBackground(a);
        btn4=new JButton("CLEAR");
          btn4.setForeground(Color.WHITE);
          btn4.setBackground(a);
        btn5=new JButton("SHOW ALL");
          btn5.setForeground(Color.WHITE);
          btn5.setBackground(a);
        btn6=new JButton("BACK");
          btn6.setForeground(Color.WHITE);
         Color d= new Color(182, 4, 40);
          btn6.setBackground(d);
        btn7=new JButton("LOGOUT");
        //  btn7.setForeground(Color.WHITE);
      //    btn7.setBackground(d);
    
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        bg2=new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);
        
        bg3=new ButtonGroup();
        bg3.add(rb5);
        bg3.add(rb6);
        
        bg4=new ButtonGroup();
        bg4.add(rb7);
        bg4.add(rb8);
        
        rb7.setOpaque(false);
      
        l1.setBounds(30,200,100,40);
        l1.setForeground(d);
        l2.setBounds(30,250,140,40);
         l2.setForeground(d);
        l3.setBounds(30,300,100,40);
         l3.setForeground(d);
        l4.setBounds(30,350,100,40);
         l4.setForeground(d);
        l5.setBounds(30,400,140,40);
         l5.setForeground(d);
        l6.setBounds(30,450,100,40);
         l6.setForeground(d);
        l7.setBounds(30,500,100,40);
         l7.setForeground(d);
        l8.setBounds(430,500,100,40);
         l8.setForeground(d);
        l9.setBounds(370,50,330,100);
        l9.setForeground(a);
        l10.setBounds(430,200,100,40);
         l10.setForeground(d);
        l11.setBounds(430,250,100,40);
         l11.setForeground(d);
        l12.setBounds(430,300,100,40);
         l12.setForeground(d);
        l13.setBounds(430,350,100,40);
         l13.setForeground(d);
        l14.setBounds(430,400,100,40);
         l14.setForeground(d);
        l15.setBounds(430,450,100,40);
         l15.setForeground(d);
        l16.setBounds(30,600,100,40);
         l16.setForeground(d);
        l17.setBounds(430,600,140,40);
       l17.setForeground(d);
       l18.setBounds(150,50,180,100);
                               
        try {
            bi2 = ImageIO.read(new File("C:\\Users\\ruman\\Pictures\\port.jpg"));
            im2 = bi2.getScaledInstance(l18.getWidth(), l18.getHeight(), Image.SCALE_SMOOTH);
            
            ImageIcon icon = new ImageIcon(im2);
            l18.setIcon(icon);
            
        } catch (IOException ex) {
            Logger.getLogger(Hospitalmanagment.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        f1.setBounds(220,200,130,40);
        f2.setBounds(220,250,130,40);
        f3.setBounds(220,300,130,40);
        f4.setBounds(220,350,130,40);
        f5.setBounds(220,400,130,40);
        f6.setBounds(220,450,130,40);
        
        f10.setBounds(550,200,130,40);
        f11.setBounds(550,250,130,40);
        f12.setBounds(550,300,130,40);
        f13.setBounds(550,350,130,40);
        f14.setBounds(550,400,130,40);
        f15.setBounds(550,450,130,40);
       
        
        
         rb2.setFont(font);
          rb3.setFont(font);
           rb4.setFont(font);
            rb5.setFont(font);
             rb6.setFont(font);
              rb7.setFont(font);
               rb8.setFont(font);
           
        
        rb1.setBounds(220,500,100,40);
         rb1.setForeground(d);
         rb1.setOpaque(false);
          rb1.setFont(font);
         rb1.setBackground(Color.WHITE);
         
        rb2.setBounds(220,550,100,40);
          rb2.setOpaque(false);
    
        rb2.setBackground(Color.WHITE);
       rb2.setForeground(d);
        rb3.setBounds(550,500,150,40);
        rb3.setBackground(Color.WHITE);
          rb3.setOpaque(false);
         rb3.setForeground(d);
        rb4.setBounds(550,550,200,40);
        rb4.setBackground(Color.WHITE);
          rb4.setOpaque(false);
         rb4.setForeground(d);

         btn1.setBounds(180,720,100,50);

        
        btn2.setBounds(180,780,100,50);
        btn3.setBounds(300,720,100,50);
        btn4.setBounds(300,780,100,50);
        btn5.setBounds(420,780,100,50);
        btn6.setBounds(20,50,80,40);
        btn7.setBounds(750,50,80,60);
        
        
                 try {
            bi2 = ImageIO.read(new File("C:\\Users\\ruman\\Downloads\\log.png"));
            im2 = bi2.getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_SMOOTH);
            
            ImageIcon icon = new ImageIcon(im2);
            btn7.setIcon(icon);
            
        } catch (IOException ex) {
            Logger.getLogger(Hospitalmanagment.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
                 
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setFocusPainted(false);
        btn7.setOpaque(false);
        
        rb5.setBounds(220,600,100,40);
         rb5.setForeground(d);
         rb5.setBackground(Color.WHITE);
           rb5.setOpaque(false);
        rb6.setBounds(220,650,100,40);
         rb6.setForeground(d);
         rb6.setBackground(Color.WHITE);
           rb6.setOpaque(false);
        rb7.setBounds(550,600,100,40);
       rb7.setForeground(d);
       rb7.setBackground(Color.WHITE);
        rb8.setBounds(550,650,100,40);
        rb8.setBackground(Color.WHITE);
          rb8.setOpaque(false);
       rb8.setForeground(d);
       
        // Color c = new Color(200, 180, 232);
         Color c=new Color(204,255,229);
        p.setBackground(c);
     
    // JLabel l9=new JLabel("PATIENT PORTAL ");
//        Border border =BorderFactory.createLineBorder(Color.CYAN,5);
  //      l1.setBorder(border);
    
  
     // l9.setOpaque(true);
       // Color m=new Color(226,87,87);
        //l9.setBackground(m);
       // p. add(l9);
        
        
         l9.setFont( new Font("Ariel", Font.BOLD, 30));
        p.add(l1);
         p.add(l2);
        p.add(l3);
        p.add(l4);
         p.add(l5);
        p.add(l7);
        p.add(l8);
        p.add(l6);
        p.add(l10);
        p.add(l11);
        p.add(l12);
        p.add(l13);
        p.add(l14);
        p.add(l15);
        p.add(l16);
        p.add(l17);
    p.add(l18);
        p.add(l9);
       
        p.add(f1);
        p.add(f2);
        p.add(f3);
        p.add(f4);
        p.add(f5);
          p.add(f6);
        p.add(f10);
        p.add(f11);
        p.add(f12);
        p.add(f13);
        p.add(f14);
        p.add(f15);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        
       
      
        p.add(rb1);
        p.add(rb2);
        p.add(rb3);
        p.add(rb4);
        p.add(rb5);
        p.add(rb6);
        p.add(rb7);
        p.add(rb8);
      
       
       
      
        fr.add(p);
        
        fr.setSize(900,900);
        fr.setResizable(false);
        fr.setVisible(true);
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
        patientList p=new patientList();
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String mes=ae.getActionCommand();
         
    
      if(mes.equals("SAVE"))
      {
          id=Integer.parseInt(f1.getText());
         String patient_name=f2.getText();
        String Disease=f3.getText();
        String admit_date=f4.getText();
        String Release_date=f5.getText();
        String States=f6.getText();
        String age=f10.getText();
        String city=f11.getText();
        String date=f12.getText();
        String ph_no=f13.getText();
        String ward_no=f14.getText();
        String bed_no=f15.getText();
        
        
        
        if(rb1.isSelected())
        {
            Room_Type=rb1.getText();
        }
        else if(rb2.isSelected())
        {
            Room_Type=rb2.getText();
        }
        if(rb3.isSelected())
        {
            Condition=rb3.getText();
        }
        else if(rb4.isSelected())
        {
            Condition=rb4.getText();
        }
      
         if(rb5.isSelected())
         {
            gender=rb5.getText();
         }
         else if(rb6.isSelected())
         {
             gender=rb6.getText();
         }
         if(rb7.isSelected())
         {
             martial_status=rb7.getText();
             
         }
         else if(rb8.isSelected())
                 {
                     martial_status=rb8.getText();
                 }
    
    
    try
    {
   statement=connection.prepareStatement("insert into number values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
   statement.setInt(1, id);
statement.setString(2,patient_name);
statement.setString(3,Disease);
statement.setString(4,admit_date);
statement.setString(5,Release_date);
statement.setString(6,States);
statement.setString(7,Room_Type);
statement.setString(8,Condition);
statement.setString(9, age);
statement.setString(10,city);
statement.setString(11,date);
statement.setString(12,ph_no);
statement.setString(13,ward_no);
statement.setString(14,bed_no);
statement.setString(15,martial_status);
statement.setString(16,gender);


statement.executeUpdate();
    }
    
    catch(SQLException e)
    {
        e.printStackTrace();
    }
        
      } 
    
    else if(mes.equals("SEARCH"))
            { 
            id=Integer.parseInt(f1.getText());
            
            try
            {
            statement=connection.prepareStatement("select * from number where id=?");
            statement.setInt(1,id);
            set=statement.executeQuery();
            
            if(set.next())
            {
                id=set.getInt(1);
               patient_name=set.getString(2);
               Disease=set.getString(3);
               admit_date=set.getString(4);
               Release_date=set.getString(5);
               States=set.getString(6);
               Room_Type=set.getString(7);
               Condition=set.getString(8);
               gender=set.getString(9);
              martial_status=set.getString(10);
             age=set.getString(11);
              city=set.getString(12);
              date=set.getString(13);
              ph_no=set.getString(14);
              ward_no=set.getString(15);
               bed_no=set.getString(16);
               
               
               
                       
            
           f1.setText(String.valueOf(id));
            f2.setText (patient_name);
            f3.setText(Disease);
            f4.setText(admit_date);
            f5.setText(Release_date);
            f6.setText(States);
            f10.setText(age);
            f11.setText(city);
            f12.setText(date);
            f13.setText(ph_no);
            f14.setText(ward_no);
            f15.setText(bed_no);
            
            
            if(Room_Type.equals("AC"))
            {
                rb1.setSelected(true);
            }
            else if(Room_Type.equals("NON Ac"))
            {
                rb2.setSelected(true);
            }
            if(Condition.equals("EMERGENCY"))
            {
                rb3.setSelected(true);
            }
            else if(Condition.equals("NON EMERGENCY"))
            {
                rb4.setSelected(true);
            }
            if(gender.equals("MALE"))
            {
                rb5.setSelected(true);
            }
            else if(gender.equals("FEMALE"))
            {
                rb6.setSelected(true);
                
            }
            if(martial_status.equals("SINGLE"))
            {
                rb7.setSelected(true);
                
            }
            else if(martial_status.equals("MARRIED"))
            {
                rb8.setSelected(true);
            }
            
            }
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
f10.setText("");
f11.setText(" ");
f12.setText("");
f13.setText("");
f14.setText("");
f15.setText("");
   


}
   else if(mes.equals("UPDATE"))
   {
       id=Integer.parseInt(f1.getText());
       patient_name=f2.getText();
       Disease=f3.getText();
       admit_date=f4.getText();
       Release_date=f5.getText();
       States=f6.getText();
       age=f10.getText();
       city=f11.getText();
       date=f12.getText();
       ph_no=f13.getText();
       ward_no=f14.getText();
       bed_no=f15.getText();
       
        if(rb1.isSelected())
        {
            Room_Type=rb1.getText();
        }
        else if(rb2.isSelected())
        {
            Room_Type=rb2.getText();
        }
        if(rb3.isSelected())
        {
            Condition=rb3.getText();
        }
        else if(rb4.isSelected())
        {
            Condition=rb4.getText();
        }
      
         if(rb5.isSelected())
         {
            gender=rb5.getText();
         }
         else if(rb6.isSelected())
         {
             gender=rb6.getText();
         }
         if(rb7.isSelected())
         {
             martial_status=rb7.getText();
             
         }
         else if(rb8.isSelected())
                 {
                     martial_status=rb8.getText();
                 }
    
                   
       
       try
       {
           statement=connection.prepareStatement("update number set patient_name=?,disease=?,admit_date=?,Release_date=?,States=?,age=?,city=?,c_date=?,ph_no=?,ward_no=?,bed_no=?,Room_Type=?,pa_condition=?,gender=?,martial_status=? where id=?");
           statement.setString(1,patient_name);
           statement.setString(2,Disease);
           statement.setString(3,admit_date);
           statement.setString(4,Release_date);
           statement.setString(5,States);
           statement.setString(6,age);
           statement.setString(7,city);
           statement.setString(8,date);
           statement.setString(9,ph_no);
           statement.setString(10,ward_no);
           statement.setString(11,bed_no);
          
           statement.setString(12,Room_Type);
           statement.setString(13,Condition);
           statement.setString(14,gender);
           statement.setString(15,martial_status);
            statement.setInt(16,id);
           
                   
                   
                   
                   
                   
                   
           statement.executeUpdate();
           
       }
       catch(SQLException e)
               {
                   e.printStackTrace();
               }
       
   }
   else if(mes.equals("SHOW ALL"))
   {
        forpatient p=new forpatient();
   }
   else if(mes.equals("BACK"))
   {
        Hospitalmanagment hm=new Hospitalmanagment();
          fr.dispose();
   }
       else if(mes.equals("LOGOUT"))
   {
        Hospitalmanagment hm=new Hospitalmanagment();
      
   }
      
    }
}


