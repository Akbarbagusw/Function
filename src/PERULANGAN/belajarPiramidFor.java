
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class belajarPiramidFor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan tinggi piramid:");
        int tinggi = input.nextInt();
        
        for (int i = 1; i <=tinggi; i++) {
            for (int j = i; j <=tinggi; j++) {
                System.out.print(" ");
            }
            for (int b = 0; b <=(i*2)-2; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
