/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class HotelUKL {
    public static void main(String[] args) {
        String lokasi = JOptionPane.showInputDialog("Lokasi Hotel: ");
        String nama = JOptionPane.showInputDialog("Nama Hotel: ");
        String jenis = JOptionPane.showInputDialog("Jenis Kamar: ");
        int orang = Integer.parseInt(JOptionPane.showInputDialog("Jumlah orang: "));
        
        int sahid1 = 388000;
        int lafayette1 = 894000;
        int saphir1 = 1000000;
        int sahid2 = 673000;
        int lafayette2 = 1340000;
        int saphir2 = 1345000;
        
        int ibis1 = 400000;
        int golden1 = 330000;
        int holiday1 = 1200000;
        int ibis2 = 764000;
        int golden2 = 459000;
        int holiday2 = 1876000;
        
        int jumlah1 = orang * sahid1;
        int jumlah2 = orang * lafayette1;
        int jumlah3 = orang * saphir1;
        int jumlah4 = orang * sahid2;
        int jumlah5 = orang * lafayette2;
        int jumlah6 = orang * saphir2;
        
        int jumlah7 = orang * ibis1;
        int jumlah8 = orang * golden1;
        int jumlah9 = orang * holiday1;
        int jumlah10 = orang * ibis2;
        int jumlah11 = orang * golden2;
        int jumlah12 = orang * holiday2;
           String biaya = null;
        if (lokasi.equalsIgnoreCase("Yogyakarta") && nama.equalsIgnoreCase("Sahid") && jenis.equalsIgnoreCase("superior")) {
                    biaya = "Rp." +jumlah1;
                } else if (lokasi.equalsIgnoreCase("yogyakarta") && nama.equalsIgnoreCase("sahid") && jenis.equalsIgnoreCase("deluxe")) {
                    biaya = "Rp." +jumlah4;
                }
        if (lokasi.equalsIgnoreCase("Yogyakarta") && nama.equalsIgnoreCase("lafayette") && jenis.equalsIgnoreCase("superior")) {
                    biaya = "Rp." +jumlah2;
                } else if (lokasi.equalsIgnoreCase("yogyakarta") && nama.equalsIgnoreCase("lafayette") && jenis.equalsIgnoreCase("deluxe")) {
                    biaya = "Rp." +jumlah5;
                }
        if (lokasi.equalsIgnoreCase("Yogyakarta") && nama.equalsIgnoreCase("New saphir") && jenis.equalsIgnoreCase("superior")) {
                    biaya = "Rp." +jumlah3;
                } else if (lokasi.equalsIgnoreCase("yogyakarta") && nama.equalsIgnoreCase("new saphir") && jenis.equalsIgnoreCase("deluxe")) {
                    biaya = "Rp." +jumlah6;
                }
        if (lokasi.equalsIgnoreCase("bali") && nama.equalsIgnoreCase("ibis") && jenis.equalsIgnoreCase("superior")) {
                    biaya = "Rp." +jumlah7;
                } else if (lokasi.equalsIgnoreCase("bali") && nama.equalsIgnoreCase("ibis") && jenis.equalsIgnoreCase("deluxe")) {
                    biaya = "Rp." +jumlah10;
                }
        if (lokasi.equalsIgnoreCase("bali") && nama.equalsIgnoreCase("golden") && jenis.equalsIgnoreCase("superior")) {
                    biaya = "Rp." +jumlah8;
                } else if (lokasi.equalsIgnoreCase("bali") && nama.equalsIgnoreCase("golden") && jenis.equalsIgnoreCase("deluxe")) {
                    biaya = "Rp." +jumlah11;
                }
        if (lokasi.equalsIgnoreCase("bali") && nama.equalsIgnoreCase("holiday") && jenis.equalsIgnoreCase("superior")) {
                    biaya = "Rp." +jumlah9;
                } else if (lokasi.equalsIgnoreCase("bali") && nama.equalsIgnoreCase("holiday") && jenis.equalsIgnoreCase("deluxe")) {
                    biaya = "Rp." +jumlah12;
                }
                
        
        JOptionPane.showMessageDialog(null, "Lokasi hotel: " +lokasi+ "\nNama hotel: " +nama+ "\nJenis kamar: " +jenis+ "\nTotal biaya: " +biaya);
    }
 
}
