
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */

public class MatriksPenjumlahan {
    public static void main(String[] args) {
    
     /*
        Matriks A=
        7   8   3
        6   7   8
        2   3   5
        8   7   3
        
        Matriks B
        6   6   6
        9   9   9
        7   6   5
        0   0   0
        
        Matriks A+B
        */   
        
    int i, j,m, n;
    int matriks1[][] = new int[10][10];
    int matriks2[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris matriks: ");
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks: ");
    n = scan.nextInt();
    System.out.println("Masukkan elemen matriks pertama: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks1[i][j] = scan.nextInt();
      }
    }
    System.out.println("Masukkan elemen matriks kedua: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks2[i][j] = scan.nextInt();
      }
    }
    System.out.println("Hasil penjumlahan matriks: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        hasil[i][j] = matriks1[i][j] + matriks2[i][j];
        System.out.print(hasil[i][j] + "\t");
      }
      System.out.println();
    }
    }
}
