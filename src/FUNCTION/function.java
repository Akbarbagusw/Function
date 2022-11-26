
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class function {
    public static void LuasLingkaran(double jari){
           double luas=3.14*jari*jari;
           System.out.println("luas lingkaran "+luas);
       }
public static double luaslingkaran2(double jari){
    double luas=3.14*jari*jari;
    return luas;
}
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nilai jari-jari: ");
int jari = input.nextInt();
        LuasLingkaran(jari);
        System.out.println("luas: "+luaslingkaran2(jari));
    }
}
