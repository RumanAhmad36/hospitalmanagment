/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JPanel;

public class TableExample {
    JFrame jf;
    JPanel p;
   JTable jt;
   
    public TableExample()
    {
    jf=new JFrame();
    p=new JPanel(null);

     String columns[]={"id","name","salary"};
     
     jt=new JTable();
    jt.setBounds(30,40,200,300);
    JScrollPane sp=new JScrollPane(jt);
    p.add(sp);
    jf.add(p);
    
    jf.setSize(300,400);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    
}
public static void main(String args[])
{
JTable jt =new JTable();
}
}