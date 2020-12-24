/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class another extends JFrame 
{
    JFrame fr;
     public another()
    {
      fr=new JFrame();
        String columns[] = new String[] {
            "Id", "Name", "degree", "timing",
        };
         
       
       Object data[][] = new Object[][] {
            {1, "John","phd","9:00-12:00" },
            {2, "Rambo","mbbs" ,"1:00-4:00" },
            {3, "Zorro","graduation" ,"5:00-9:00" },
            {4,"dr.ben","pharma","8:00-6:00"}
        };
      
        JTable table = new JTable(data, columns);
         
     
        fr.add(new JScrollPane(table));
         
       fr.setTitle("DOCTOR");
        fr.setSize(500,500);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
      
      fr.setVisible(true);
    }
     
    public static void main(String[] args)
    {
     another n=new another();
    
}
}