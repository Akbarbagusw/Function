/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class dereAritmatika {
    public static void main(String[] args) {
        //un = a+(n-1)b
        //jumluhsuku = n/2(a+Un)
         
        int awal= 10;
        int beda= 4;
        int susuke=10;
        int u=awal;
        int s=awal;
           System.out.println("Deret aritmatikanya adalah: ");
           for (int i = 2; i < susuke; i++) {
               u=u+beda;
               if (i >1 && i < 9){ 
                 System.out.print(u+",");
        
        s=s+u;
        }
           }
           s=s-u;
        System.out.println("Total deret aritmatika:" +s);
    }
}
