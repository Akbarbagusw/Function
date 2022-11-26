/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class TugasBuAullASSET {
    public static void main(String[] args) {
        int laptop = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Laptop"));
        int Harddisk = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah Harddisk"));
        int Mouse = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah mouse"));

        int hargalaptop = 10000000;
        int hargaHarddisk = 1500000;
        int hargaMouse = 150000;

        int jumlah1 = laptop * hargalaptop;
        int jumlah2 = Harddisk * hargaHarddisk;
        int jumlah3 = Mouse * hargaMouse;

        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan pilihan 1/2:"));
        
        boolean pembanding1 = jumlah1 > jumlah2;

        switch (pilihan) {
            case 1:
                int totalAsset = jumlah1 + jumlah2 + jumlah3;
                JOptionPane.showMessageDialog(null, "totalAsset adalah : " + totalAsset);
                break;
            case 2:
 
                if (laptop > Harddisk) {
                    JOptionPane.showMessageDialog(null, "Yang paling banyak adalah laptop   "  );
                    
                }else if (laptop > Mouse) {
                    JOptionPane.showMessageDialog(null, "Yang paling banyak adalah laptop  " );
                    
                }else if (Harddisk > laptop){
                    JOptionPane.showMessageDialog(null, "Yang paling banyak adalah harddisk   ");
                
                }else if (Harddisk > Mouse) {
                    JOptionPane.showMessageDialog(null, "Yang paling banyak adalah harddisk   " );
                    
                }else if (Mouse > laptop) {
                    JOptionPane.showMessageDialog(null, "Yang paling banyak adalah mouse   " );
                    
                }else if (Mouse > Harddisk){
                    JOptionPane.showMessageDialog(null, "Yang paling banyak adalah mouse  : " );
                }

               
                         
    }
        
        
        
        
    }
}
