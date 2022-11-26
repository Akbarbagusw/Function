/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class matriks {
    public static void main(String[] args) {
       // for (int i = 0; i < 2; i++) {
          //  for (int j = 0; j < 3; j++) {//baris
            
        //        System.out.print("*");//kolom
          //  }
           // System.out.println();
      
           // }
           
           int awal=20;
           int beda=5;
           
           int total=0;
           
           for (int i = 0; i < 5; i++) {
               for (int j = 0; j <6; j++) {
                   awal+=beda;
                   System.out.print(awal+"\t");
                   total+=awal;
               }
               System.out.println();
           }
            
        System.out.println("total deret: "+total);
    }    
}
