
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apahayooo!!!
 */
public class BelajarArray {
    public static void main(String[] args) {
        String []teman=new String[5];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < teman.length; i++) {
            System.out.println("teman ke-"+i+": ");
            teman[i]= scan.nextLine();
        }
        System.out.println("------------------");
        for (String t : teman) {
            System.out.println(t);
        }
    }
}
