/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class UklpArif1 {
    public static void main(String[] args) {//metod main
        String nama = JOptionPane.showInputDialog("Masukkan nama: ");
        String alamat = JOptionPane.showInputDialog("Masukkan alamat: ");
        String jenis = JOptionPane.showInputDialog("Masukkan jenis hotel: ");
        String hari = JOptionPane.showInputDialog("Masukkan jenis hari: ");
        int malam = Integer.parseInt(JOptionPane.showInputDialog("berapa malam: "));
        
        int weekday1 = 495000;
        int weekend1 = 575000;
        int holiday1 = 915000;
        int weekday2 = 580000;
        int weekend2 = 750000;
        int holiday2 = 4500000;
        int weekday3 = 700000;
        int weekend3 = 915000;
        int holiday3 = 1800000;
        
        int jumlah1 = malam * weekday1;
        int jumlah2 = malam * weekend1;
        int jumlah3 = malam * holiday1;
        int jumlah4 = malam * weekday2;
        int jumlah5 = malam * weekend2;
        int jumlah6 = malam * holiday2;
        int jumlah7 = malam * weekday3;
        int jumlah8 = malam * weekend3;
        int jumlah9 = malam * holiday3;
        String biaya = null;
        
        if (jenis.equalsIgnoreCase("deluxe") && hari.equalsIgnoreCase("weekday")) {
                    biaya = "Rp." +jumlah1;
                } else if (jenis.equalsIgnoreCase("deluxe") && hari.equalsIgnoreCase("weekend")) {
                    biaya = "Rp." +jumlah2;
                } else if (jenis.equalsIgnoreCase("deluxe") && hari.equalsIgnoreCase("holiday")) {
                    biaya = "Rp." +jumlah3;
                }    
        
        if (jenis.equalsIgnoreCase("superdeluxe") && hari.equalsIgnoreCase("weekday")) {
                    biaya = "Rp." +jumlah4;
                } else if (jenis.equalsIgnoreCase("superdeluxe") && hari.equalsIgnoreCase("weekend")) {
                    biaya = "Rp." +jumlah5;
                } else if (jenis.equalsIgnoreCase("superdeluxe") && hari.equalsIgnoreCase("holiday")) {
                    biaya = "Rp." +jumlah6;
                }   
        if (jenis.equalsIgnoreCase("executive") && hari.equalsIgnoreCase("weekday")) {
                    biaya = "Rp." +jumlah7;
                } else if (jenis.equalsIgnoreCase("executive") && hari.equalsIgnoreCase("weekend")) {
                    biaya = "Rp." +jumlah8;
                } else if (jenis.equalsIgnoreCase("executive") && hari.equalsIgnoreCase("holiday")) {
                    biaya = "Rp." +jumlah9;
                }   
                   JOptionPane.showMessageDialog(null, "Nama anda:" +nama+ "\nAlamat anda:" +alamat+ "\nJenis Hotel anda:" +jenis+ "\nJenis hari:" +hari+ "" +malam+ "\nTotal:" +biaya);
    }
}
