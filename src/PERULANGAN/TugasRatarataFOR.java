/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class TugasRatarataFOR {
    public static void main(String[] args) {
        int JumlahNilai = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah nilai:"));
        int totalNilai = 1;
        for (int i = 0; i <JumlahNilai; i++) {
            int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai:"));
            totalNilai +=nilai;
            
        }
        int Ratarata = totalNilai/JumlahNilai;
        JOptionPane.showMessageDialog(null, "Rata-rata:" +Ratarata);
        
    }
}
