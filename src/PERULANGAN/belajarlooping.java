
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class belajarlooping {
    public static void main(String[] args) {
        int awal = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal:"));
        int akhir = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai akhir:"));
        int kelipatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kelipatan:"));
        int total=0;
        for (int i =awal; i <=akhir; i+=kelipatan) {
            System.out.println(i);
             total+=i;
}
        JOptionPane.showMessageDialog(null, "Total:"+total);
    }
}
