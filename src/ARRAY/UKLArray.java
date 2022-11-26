/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
import javax.swing.JOptionPane;
public class UKLArray {
    public static void main(String[] args) {
        String pilihan=JOptionPane.showInputDialog("Masukkan nama: ");
        
        String nama [][]= {{"akbar","izzat","inad","disca"},{"evan","ridho","raffy","altav"}};
        int nisn [][]= {{1234,5678,9012,3456},{7890,2345,6789,0123}};
        String kelas[][]= {{"XRPL 1","XRPL 2","XRPL 3","XRPL 4"},{"XRPL 5","XRPL 6","XRPL 7","XRPL 8"}};
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                     
                    if(nama [i][j]. equalsIgnoreCase(pilihan)){
                        System.out.println("================");
                        System.out.println("Nama: "+nama [i][j]);
                        System.out.println("NISN: "+nisn [i][j]);
                        System.out.println("Kelas: "+kelas [i][j]);
                    break;
                    }
                }
                
            }
            


        
        }
      
        }
    }

