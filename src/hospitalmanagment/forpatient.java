/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class forpatient {
    PreparedStatement statement;
   Connection connection;
   ResultSet set;
   int id;
   String patient_name,disease,admit_date,release_date,states,room_type,condition,age,city,date,ph_no,ward_no,bed_no,gender,martial_status;
   
   
JFrame jf;

    String ar[]={"id","patient_name","disease","admit_date","release_date","states","room_type","condition","age","city","date","ph_no","ward_no","bed_no","gender","martial_status"};
    String ar1[][];

    int row=0;
    int i=0;
    
    JTable jt;
    JScrollPane sp;
    
    public forpatient()
    {
       jf=new JFrame();
       sp=new JScrollPane();
       jt=new JTable();
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
              connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
       

            statement=connection.prepareStatement("select count(id) from number ");
            set=statement.executeQuery();
            
            set.next();
            row=set.getInt(1);
            
            ar1=new String[row][16];
              
            statement=connection.prepareStatement("select * from number");
            set=statement.executeQuery();
            
            while(set.next())
            {
                id=set.getInt(1);
              patient_name=set.getString(2);
              disease=set.getString(3);
               admit_date=set.getString(4);
               release_date=set.getString(5);
             states =set.getString(6);
               room_type=set.getString(7);
               condition=set.getString(8);
               age=set.getString(9);
                   city=set.getString(10);
                     date=set.getString(11);
                       ph_no=set.getString(12);
                         ward_no=set.getString(13);
                           bed_no=set.getString(14);
                             gender=set.getString(15);
                               martial_status=set.getString(16);
             
               ar1[i][0]=String.valueOf(id);
               ar1[i][1]=patient_name;
               ar1[i][2]=disease;
               ar1[i][3]=admit_date;
               ar1[i][4]=release_date;
               ar1[i][5]=states;
               ar1[i][6]=room_type;
               ar1[i][7]=condition;
                ar1[i][8]=age;
                 ar1[i][9]=city;                 
                 ar1[i][10]=date;
               ar1[i][11]=ph_no;
                ar1[i][12]=ward_no;
                 ar1[i][13]=bed_no;
                  ar1[i][14]=gender;
                   ar1[i][15]=martial_status;
                   
            
              
               i++;
                }

        }
        catch(ClassNotFoundException e)

        {
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
      
        jt=new JTable(ar1,ar);
        sp=new JScrollPane(jt);
        jf.add(sp);
      
        jf.setSize(900,900);
      
        jf.setTitle("ruman");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
       
          jf.setVisible(true);
        
    }
    public static void main(String args[])
    {
        forpatient p=new forpatient();
        
    }
}
    

