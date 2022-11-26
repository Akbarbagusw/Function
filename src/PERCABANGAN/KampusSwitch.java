/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class KampusSwitch {
    public static void main(String[] args) {
     String nama = JOptionPane.showInputDialog("Masukkan nama mahasiswa: ");
     String jalurMasuk = JOptionPane.showInputDialog("Masukkan jalur masuk: ");
     int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pendapatan ortu anda: "));
     String KategoriPendapatan = null;
     
     if(pendapatan < 2000000){
       KategoriPendapatan = "A";
   }else if (pendapatan > 2000000 && pendapatan < 10000000){
       KategoriPendapatan = "B";
   }else if (pendapatan > 10000000){
       KategoriPendapatan = "C";
   }
     
     switch (jalurMasuk){
         case "SBMPTN" :
             switch (KategoriPendapatan){
                 case "A" :
                 JOptionPane.showMessageDialog(null, "DSP= 5 juta \nSPP= 500 rb ");
                 break;
                 case "B" :
                 JOptionPane.showMessageDialog(null, "DSP= 15 juta\nSPP= 1 juta");
                 break;
                 case "C" :
                 JOptionPane.showMessageDialog(null, "DSP= 30 juta\nSPP= 2 juta");
                 break;
             }  
             break;
             case "SNMPTN" :
             switch (KategoriPendapatan){
                 case "A" :
                 JOptionPane.showMessageDialog(null, "DSP= 7 juta\nSPP= 500 rb ");
                 break;
                 case "B" :
                 JOptionPane.showMessageDialog(null, "DSP= 17 juta\nSPP= 1 juta");
                 break;
                 case "C" :
                 JOptionPane.showMessageDialog(null, "DSP= 35 juta\nSPP= 2 juta");
                 break;
             }
             break;
                 case "MANDIRI" :
                 switch (KategoriPendapatan){
                 case "A" :
                 JOptionPane.showMessageDialog(null, "DSP= 10 juta\nSPP= 1 juta ");
                 break;
                 case "B" :
                 JOptionPane.showMessageDialog(null, "DSP= 25 juta\nSPP= 2 juta");
                 break;
                 case "C" :
                 JOptionPane.showMessageDialog(null, "DSP= 50 juta\nSPP= 3 juta");
                 break;
             }
             
     }
        
    }
    
}
