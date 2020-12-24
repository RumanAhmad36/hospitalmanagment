/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.sql.SQLException ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class fordoctor {
    
    PreparedStatement statement;
    ResultSet set;
    Connection connection;
    int row,id;
    String name,degree,timing,address,specialization,gender,blood_group,city,phone_no,martial_status,joining_date,leaving_date;
    
     JFrame jf;
     
int i;
    String ar[]={"id","name","degree","timing","address","specialization","gender","blood_group","city","phone_no","martial_status","joining_date","leaving_date"};
    String ar1[][];
            
    JTable jt;
    JScrollPane sp;
    
    public fordoctor()
    {
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");


            statement=connection.prepareStatement("select count(id) from data ");
            set=statement.executeQuery();
            
            set.next();
            row=set.getInt(1);
            
            ar1=new String[row][13];
              
            statement=connection.prepareStatement("select * from data");
            set=statement.executeQuery();
            
            while(set.next())
            {
                id=set.getInt(1);
              name=set.getString(2);
               degree=set.getString(3);
               timing=set.getString(4);
               address=set.getString(5);
               specialization=set.getString(6);
               gender=set.getString(7);
               blood_group=set.getString(8);
             city=set.getString(9);
               phone_no=set.getString(10);
                 martial_status=set.getString(11);  
                   joining_date=set.getString(12);
                     leaving_date=set.getString(13);
                    
             
             
             
             
             
             
               ar1[i][0]=String.valueOf(id);
               ar1[i][1]=name;
               ar1[i][2]=degree;
               ar1[i][3]=timing;
               ar1[i][4]=address;
               ar1[i][5]=specialization;
               ar1[i][6]=gender;
               ar1[i][7]=blood_group;
                 ar1[i][8]=city;
                   ar1[i][9]=phone_no;
                     ar1[i][10]=martial_status;
                       ar1[i][11]=joining_date;
                         ar1[i][12]=leaving_date;
                         
            
              
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
      
        jf.setSize(500,500);
      
        jf.setTitle("ruman");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
          jf.setVisible(true);
        
    }
    public static void main(String args[])
    {
      fordoctor j=new fordoctor();
    }
}
    

