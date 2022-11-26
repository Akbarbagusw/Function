/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class BuAullNo5 {
    public static void main(String[] args) {
        int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai"));
        
        if (nilai >= 96 && nilai <= 100) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat A"+"\nMendapat kriteria sangat baik");
        }else if (nilai >= 91 && nilai <=95) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat A-"+"\nMendapat kriteria sangat baik");
        }else if (nilai >= 86 && nilai <=90) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat B+"+"\nMendapat kriteria baik");
        }else if (nilai >= 81 && nilai <=85) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat B"+"\nMendapat kriteria baik");
        }else if (nilai >= 75 && nilai <=80) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat B-"+"\nMendapat kriteria baik");
        }else if (nilai >= 70 && nilai <=74) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat C+"+"\nMendapat kriteria cukup");
        }else if (nilai >= 65 && nilai <=69) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat C"+"\nMendapat kriteria cukup");
        }else if (nilai >= 60 && nilai <=64) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat C-"+"\nMendapat kriteria cukup");
        }else if (nilai >= 55 && nilai <=59) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat D+"+"\nMendapat kriteria kurang");
        }else if (nilai >= 0 && nilai <=54) {
            JOptionPane.showMessageDialog(null, "Nilai Anda :"+nilai+"\nMendapat predikat D"+"\nMendapat kriteria kurang");    
        }
    }
}
