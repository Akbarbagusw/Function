/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class MenuMakanan {
    public static void main(String[] args) {
      String nama = JOptionPane.showInputDialog("Masukkan Nama Pemesan: ");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat Pemesan: ");
        int pesanan = Integer.parseInt(JOptionPane.showInputDialog("Pesanan Yang Kamu Pilih:\n1. Makanan\n2. Minuman\n3. Makanan dan Minuman"));
        String pesananmu = null;
        String pesanankm = null;

        switch (pesanan) {
            case 1:
                String menu1 = JOptionPane.showInputDialog("Pilihan Menu Makanan:\n- Nasi\n- Telur\n- Bumbu\n- Ayam\n- Mie\n- Air\n- Sambal\n\n Menu Makanan 1: ");
                String menu2 = JOptionPane.showInputDialog("Pilihan Menu Makanan:\n- Nasi\n- Telur\n- Bumbu\n- Ayam\n- Mie\n- Air\n- Sambal\n\n Menu Makanan 2: ");
                String menu3 = JOptionPane.showInputDialog("Pilihan Menu Makanan:\n- Nasi\n- Telur\n- Bumbu\n- Ayam\n- Mie\n- Air\n- Sambal\n\n Menu Makanan 3: ");
                if (menu1.equalsIgnoreCase("Nasi") && menu2.equalsIgnoreCase("Telur") && menu3.equalsIgnoreCase("Bumbu")) {
                    pesananmu = "Nasi Goreng";
                } else if (menu1.equalsIgnoreCase("Ayam") && menu2.equalsIgnoreCase("Mie") && menu3.equalsIgnoreCase("Air")) {
                    pesananmu = "Mie Ayam";
                } else if (menu1.equalsIgnoreCase("Ayam") && menu2.equalsIgnoreCase("Sambal") && menu3.equalsIgnoreCase("Nasi")) {
                    pesananmu = "Ayam Geprek";
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, pesanan anda tidak valid.");
                    
                }
                break;

            case 2:
                String minum1 = JOptionPane.showInputDialog("Pilihan Menu Minuman:\n- Air\n- Es/Gula\n- Alpukat\n- Teh\n- Susu\n- Coklat\n\n Menu Minuman 1: ");
                String minum2 = JOptionPane.showInputDialog("Pilihan Menu Minuman:\n- Air\n- Es/Gula\n- Alpukat\n- Teh\n- Susu\n- Coklat\n\n Menu Minuman 2: ");
                String minum3 = JOptionPane.showInputDialog("Pilihan Menu Minuman:\n- Air\n- Es/Gula\n- Alpukat\n- Teh\n- Susu\n- Coklat\n\n Menu Minuman 3: ");
                if (minum1.equalsIgnoreCase("Air") && minum2.equalsIgnoreCase("Es/Gula") && minum3.equalsIgnoreCase("Alpukat")) {
                    pesanankm = "Jus Alpukat";
                } else if (minum1.equalsIgnoreCase("Air") && minum2.equalsIgnoreCase("Es/Gula") && minum3.equalsIgnoreCase("Teh")) {
                    pesanankm = "Es Teh";
                } else if (minum1.equalsIgnoreCase("Air") && minum2.equalsIgnoreCase("Susu") && minum3.equalsIgnoreCase("Coklat")) {
                    pesanankm = "Milkshake";
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, pesanan anda tidak valid.");
                    
                }
                break;

            case 3:
                String menu_1 = JOptionPane.showInputDialog("Pilihan Menu Makanan:\n- Nasi\n- Telur\n- Bumbu\n- Ayam\n- Mie\n- Air\n- Sambal\n\n Menu Makanan 1: ");
                String menu_2 = JOptionPane.showInputDialog("Pilihan Menu Makanan:\n- Nasi\n- Telur\n- Bumbu\n- Ayam\n- Mie\n- Air\n- Sambal\n\n Menu Makanan 2: ");
                String menu_3 = JOptionPane.showInputDialog("Pilihan Menu Makanan:\n- Nasi\n- Telur\n- Bumbu\n- Ayam\n- Mie\n- Air\n- Sambal\n\n Menu Makanan 3: ");
                if (menu_1.equalsIgnoreCase("Nasi") && menu_2.equalsIgnoreCase("Telur") && menu_3.equalsIgnoreCase("Bumbu")) {
                    pesananmu = "Nasi Goreng";
                } else if (menu_1.equalsIgnoreCase("Ayam") && menu_2.equalsIgnoreCase("Mie") && menu_3.equalsIgnoreCase("Air")) {
                    pesananmu = "Mie Ayam";
                } else if (menu_1.equalsIgnoreCase("Ayam") && menu_2.equalsIgnoreCase("Sambal") && menu_3.equalsIgnoreCase("Nasi")) {
                    pesananmu = "Ayam Geprek";
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, pesanan anda tidak valid.");
                    
                }

                String minum_1 = JOptionPane.showInputDialog("Pilihan Menu Minuman:\n- Air\n- Es/Gula\n- Alpukat\n- Teh\n- Susu\n- Coklat\n\n Menu Minuman 1: ");
                String minum_2 = JOptionPane.showInputDialog("Pilihan Menu Minuman:\n- Air\n- Es/Gula\n- Alpukat\n- Teh\n- Susu\n- Coklat\n\n Menu Minuman 2: ");
                String minum_3 = JOptionPane.showInputDialog("Pilihan Menu Minuman:\n- Air\n- Es/Gula\n- Alpukat\n- Teh\n- Susu\n- Coklat\n\n Menu Minuman 3: ");
                if (minum_1.equalsIgnoreCase("Air") && minum_2.equalsIgnoreCase("Es/Gula") && minum_3.equalsIgnoreCase("Alpukat")) {
                    pesanankm = "Jus Alpukat";
                } else if (minum_1.equalsIgnoreCase("Air") && minum_2.equalsIgnoreCase("Es/Gula") && minum_3.equalsIgnoreCase("Teh")) {
                    pesanankm = "Es Teh";
                } else if (minum_1.equalsIgnoreCase("Air") && minum_2.equalsIgnoreCase("Susu") && minum_3.equalsIgnoreCase("Coklat")) {
                    pesanankm = "Milkshake";
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, pesanan anda tidak valid.");
                    
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Maaf, Pesanan anda tidak valid.");
        }

        JOptionPane.showMessageDialog(null, "Nama Pemesan: " + nama + "\nAlamat Pemesan: " + alamat + "\n\nMenu Yang Kamu Pilih Adalah\nMakanan: " + pesananmu + "\nMinuman: " + pesanankm);
    }
}
        
        
        
        
    
            

        
        
        
    
    

