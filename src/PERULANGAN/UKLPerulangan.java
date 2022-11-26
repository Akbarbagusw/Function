/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class UKLPerulangan {
    public static void main(String[] args) {
 int awal=3;
 int beda=6;
 int s=0;
 
        for (int i = 2; i < 10; i++) {
            awal+=beda;
            if(i>=4 && i<=9){
            System.out.println(awal+",");
        s=s+awal;
            }
        }
        System.out.println("total "+s);
    }
}