/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author apahayooo!!!
 */
public class functionP2 {
    public static void max(int a,int b, int c) {
        int maks;
        System.out.println("nilai tertinggi");
        maks = Math.max (a, b);
        if (c>maks){
        maks = c;
    }
        System.out.println(maks);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,c = 0;
        
        System.out.println("Masukkan nilai a: ");
        a=input.nextInt();
        
        System.out.println("Masukkan nilai b: ");
        b=input.nextInt();
        
        System.out.println("Masukkan nilai c: ");
        c=input.nextInt();
        
        max(a, b, c);
    }
    
}
