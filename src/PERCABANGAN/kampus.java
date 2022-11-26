/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class kampus {
public static void main(String[] args) {
   String nama = JOptionPane.showInputDialog("Masukkan Nama Mahasiswa: ");
   String jalurMasuk = JOptionPane.showInputDialog("Masukkan Jalur Masuk: ");
   int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pendapatan Ortu: "));
   String KategoriPendapatan = null;
   
   if(pendapatan < 2000000){
       KategoriPendapatan = "A";
   }else if (pendapatan > 2000000 && pendapatan < 10000000){
       KategoriPendapatan = "B";
   }else if (pendapatan > 10000000){
       KategoriPendapatan = "C";
   }
   
   
   if(jalurMasuk.equalsIgnoreCase("SBMPTN")){
     if(KategoriPendapatan.equalsIgnoreCase("A")){
         JOptionPane.showMessageDialog(null,"DSP: 5 juta\n SPP: 500 rb");
     }else if(KategoriPendapatan.equalsIgnoreCase("B")){
         JOptionPane.showMessageDialog(null,"DSP: 15 juta\n SPP: 1 juta");
     }else if(KategoriPendapatan.equalsIgnoreCase("C")){
         JOptionPane.showMessageDialog(null,"DSP: 30 juta\n SPP: 2 juta");
     }}   
         
    if(jalurMasuk.equalsIgnoreCase("SNMPTN")){
     if(KategoriPendapatan.equalsIgnoreCase("A")){
         JOptionPane.showMessageDialog(null,"DSP: 7 juta\n SPP: 500 rb");
     }else if(KategoriPendapatan.equalsIgnoreCase("B")){
         JOptionPane.showMessageDialog(null,"DSP: 17 juta\n SPP: 1 juta");
     }else if(KategoriPendapatan.equalsIgnoreCase("C")){
         JOptionPane.showMessageDialog(null,"DSP: 35 juta\n SPP: 2 juta");
         
     }}
     
     if(jalurMasuk.equalsIgnoreCase("Mandiri")){
     if(KategoriPendapatan.equalsIgnoreCase("A")){
         JOptionPane.showMessageDialog(null,"DSP: 10 juta\n SPP: 1 juta");
     }else if(KategoriPendapatan.equalsIgnoreCase("B")){
         JOptionPane.showMessageDialog(null,"DSP: 25 juta\n SPP: 2 juta");
     }else if(KategoriPendapatan.equalsIgnoreCase("C")){
         JOptionPane.showMessageDialog(null,"DSP: 50 juta\n SPP: 3 juta");    
     }  
   }
    }
  
}
     
