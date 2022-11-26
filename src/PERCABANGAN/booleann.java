/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class booleann {
    public static void main(String[] args) {
        String nama1 = JOptionPane.showInputDialog("Masukkan nama siswa 1: ");
        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur siswa"+nama1));
        String nama2 = JOptionPane.showInputDialog("Masukkan nama siswa 2: ");
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur siswa"+nama2));
        
        boolean pembanding1 = nilai1 > nilai2;
                
                if (pembanding1=true) {
                    JOptionPane.showMessageDialog(null,nama1+" lebih kecil dari "+nama2);
                    }else{
                    JOptionPane.showMessageDialog(null,nama1+" lebih besar dari "+nama2);
                }
                }

    }

