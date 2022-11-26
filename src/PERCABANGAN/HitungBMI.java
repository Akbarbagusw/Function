/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;

public class HitungBMI {

    public static void main(String[] args) {
        //Rumus: Berat (kg) / (tinggi (m)*tinggi (m))
        String nama = JOptionPane.showInputDialog("Masukan nama anda: ");
        double berat = Double.parseDouble(JOptionPane.showInputDialog("Masukan Berat anda: (kg) "));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("masukan tinggi (m): "));
        double bmi = berat / (tinggi * tinggi);
        JOptionPane.showMessageDialog(null, "BMI " + nama + " adalah: " + bmi);
    }
}
