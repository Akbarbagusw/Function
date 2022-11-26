/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class uklnaura {
    public static void main(String[] args) {
        String tujuan = JOptionPane.showInputDialog("Masukkan tujuan anda:");
        String jenis = JOptionPane.showInputDialog("Masukkan jenis kereta:");
        String kelas = JOptionPane.showInputDialog("Masukkan jenis kelas:");
        int orang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah orang:"));
        
        switch (tujuan){
            case "bandung":
                switch (jenis){
                    case "argo parahyangan":
                    switch (kelas){
                        case "ekonomi":
                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 95000);
                    break;
                                case"eksekutif":
                                JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 145000);
                    }      
                }
                    
                        case "surabaya":
                                                                                                        switch (jenis){
                                case "airlangga":
                                    switch (kelas){
                                        case "ekonomi":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 104000);
                                        break;
                                        case "bisnis":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 280000);
                                        break;
                                        case "eksekutif":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 685000);
                                    break;
                                    }
                            }
                    switch (jenis){
                        case "jayabaya":
                            switch (kelas){
                                case "ekonomi":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 290000);
                                        break;
                                        case "bisnis":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 350000);
                                        break;
                                        case "eksekutif":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 540000);
                                    break;
                            }
                    }
                    switch (jenis){
                        case "kertajaya":
                            switch (kelas){
                                case "ekonomi":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 270000);
                                        break;
                                        case "bisnis":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 455000);
                                        break;
                                        case "eksekutif":
                                            JOptionPane.showMessageDialog(null, "tujuan anda: "+tujuan+"\njenis kereta anda: "+jenis+"\njenis kelas anda: "+kelas+"\ntotal biaya: Rp." +orang * 750000);
                                    break;
                            }
                    }
                    
                }
        }
        
    }
 

