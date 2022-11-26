
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class TugasBAullperulangan {
    public static void main(String[] args) {
       int nilai1;
       int nilai2;
       int kelipatan;
       int total=0;
     
       nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal:"));
       nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai akhir:"));
       kelipatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kelipatan"));
    
        for (int i = nilai1; i <=nilai2; i+=kelipatan) {
            System.out.println(i);
        total += i;
        }
        JOptionPane.showMessageDialog(null,"total:"+total);
        
        
    }
}
