/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class UKL {
    public static void main(String[] args) {
        String jenis = JOptionPane.showInputDialog("Maskapai:     Asal:     Tujuan:           Harga:\n1.Batik        Jakarta    Surabaya        779.000\n2.Citilink     Jakarta    Surabaya        842.066\n3.Lionair     Jakarta    Surabaya        938.430\n4.Batik        Jakarta     Yogyakarta     720.280\n5.Citilink     Jakarta     Yogyakarta     853.040\n6.Lionair     Jakarta     Yogyakarta     871.000");
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah orang: "));
        
        int BatikJASU = 779700;
        int CitiJASU = 842066;
        int LionJASU = 938430;
        
        int LionJAYO = 720280;
        int CitiJAYO = 853040;
        int BatikJAYO = 871880;
        
        int batik1 = jumlah * BatikJASU;
        int citi1 = jumlah * CitiJASU;
        int lion1 = jumlah * LionJASU;
        
        int batik2 = jumlah * BatikJAYO;
        int citi2 = jumlah * BatikJAYO;
        int lion2 = jumlah * BatikJAYO;
        
        
        int totaltiket = batik2;
        JOptionPane.showMessageDialog(null, "Total yang harus anda bayar: " +totaltiket);
    }
    
}
