/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class JalanTOL {
    public static void main(String[] args) {
         String asal = JOptionPane.showInputDialog("Masukkan asal anda: ");
         String tujuan = JOptionPane.showInputDialog("Masukkan tujuan anda: ");
         String golongan = JOptionPane.showInputDialog("Golangan1: sedan, jip, pick up, bus, truk kecil. \nGolongan2: truk dua gandar");
         String karcisTol=null;
        if (asal.equalsIgnoreCase("Waru") && tujuan.equalsIgnoreCase("sidoarjo") && golongan.equalsIgnoreCase("golongan1")) {
                    karcisTol = "Rp.6000";
                } else if (asal.equalsIgnoreCase("Waru") && tujuan.equalsIgnoreCase("sidoarjo") && golongan.equalsIgnoreCase("golongan2")) {
                    karcisTol = "Rp.9000";
                } 
        if (asal.equalsIgnoreCase("Waru") && tujuan.equalsIgnoreCase("porong") && golongan.equalsIgnoreCase("golongan1")) {
                    karcisTol = "Rp.9000";
                } else if (asal.equalsIgnoreCase("Waru") && tujuan.equalsIgnoreCase("porong") && golongan.equalsIgnoreCase("golongan2")) {
                    karcisTol = "Rp.14000";
                }
        if (asal.equalsIgnoreCase("Sidoarjo") && tujuan.equalsIgnoreCase("waru") && golongan.equalsIgnoreCase("golongan1")) {
                    karcisTol = "Rp.6000";
                } else if (asal.equalsIgnoreCase("sidoarjo") && tujuan.equalsIgnoreCase("waru") && golongan.equalsIgnoreCase("golongan2")) {
                    karcisTol = "Rp.9000";
                }
        if (asal.equalsIgnoreCase("Sidoarjo") && tujuan.equalsIgnoreCase("porong") && golongan.equalsIgnoreCase("golongan1")) {
                    karcisTol = "Rp.5500";
                } else if (asal.equalsIgnoreCase("sidoarjo") && tujuan.equalsIgnoreCase("porong") && golongan.equalsIgnoreCase("golongan2")) {
                    karcisTol = "Rp.8500";
                }
        if (asal.equalsIgnoreCase("porong") && tujuan.equalsIgnoreCase("sidoarjo") && golongan.equalsIgnoreCase("golongan1")) {
                    karcisTol = "Rp.5500";
                } else if (asal.equalsIgnoreCase("porong") && tujuan.equalsIgnoreCase("sidoarjo") && golongan.equalsIgnoreCase("golongan2")) {
                    karcisTol = "Rp.8500";
                }
        if (asal.equalsIgnoreCase("porong") && tujuan.equalsIgnoreCase("waru") && golongan.equalsIgnoreCase("golongan1")) {
                    karcisTol = "Rp.9000";
                } else if (asal.equalsIgnoreCase("porong") && tujuan.equalsIgnoreCase("waru") && golongan.equalsIgnoreCase("golongan2")) {
                    karcisTol = "Rp.14000";
                }
        
                    JOptionPane.showMessageDialog(null, "Asal anda: "+asal+ "\ntujuan anda: "+tujuan+ "\ntarif karcis: " +karcisTol);
                
    
    
}
    }
