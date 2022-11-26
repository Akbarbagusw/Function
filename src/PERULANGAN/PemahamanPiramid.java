/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class PemahamanPiramid {
    public static void main(String[] args) {
        for (int a = 1; a <=3; a++) {
            for (int b = 3; b <=a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <=a; c++) {
                System.out.print("*");
            }
            for (int d = 1; d <= a - 1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
