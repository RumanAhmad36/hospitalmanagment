/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class tableformedicine {
    
   PreparedStatement statement;
   Connection connection;
   ResultSet set;
   int id;
   String medicine_name,medicine_used_for,Manufacture_date,Expire_date,price,avilablity,total_amount;
   
   
  JFrame jf;

    String ar[]={"id","medicine_name","medicine_used_for","Manufacture_date","Expire_date","price","avilablity","total_amount"};
    String ar1[][];

    int row=0;
    int i=0;
    
    JTable jt;
    JScrollPane sp;
    
    public tableformedicine()
    {
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
              connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");


            statement=connection.prepareStatement("select count(id) from info ");
            set=statement.executeQuery();
            
            set.next();
            row=set.getInt(1);
            
            ar1=new String[row][8];
              
            statement=connection.prepareStatement("select * from info");
            set=statement.executeQuery();
            
            while(set.next())
            {
                id=set.getInt(1);
              medicine_name=set.getString(2);
               medicine_used_for=set.getString(3);
               Manufacture_date=set.getString(4);
               Expire_date=set.getString(5);
               price=set.getString(6);
               avilablity=set.getString(7);
               total_amount=set.getString(8);
             
               ar1[i][0]=String.valueOf(id);
               ar1[i][1]=medicine_name;
               ar1[i][2]=medicine_used_for;
               ar1[i][3]=Manufacture_date;
               ar1[i][4]=Expire_date;
               ar1[i][5]=price;
               ar1[i][6]=avilablity;
               ar1[i][7]=total_amount;
            
              
               i++;
                }
        }
        catch(ClassNotFoundException e)

        {
            e.printStackTrace();;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
              
            jf=new JFrame();
        
        jt=new JTable(ar1,ar);
        sp=new JScrollPane(jt);
        jf.add(sp);
      
        jf.setSize(800,800);
      
        jf.setTitle("ruman");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
          jf.setVisible(true);
        
    }
    public static void main(String args[])
    {
        tableformedicine t=new tableformedicine();
    }
}
