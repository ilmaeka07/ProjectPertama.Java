
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Percabangan {
    public static void main(String[] args) {
        Scanner masukan= new Scanner(System.in);
        System.out.println("Masukan Angka = ");
        int angka = masukan.nextInt();
       if (angka%2==0) {
           if (angka>10) {
               System.out.println("Bilangan Genap dan");
               System.out.println("Merupakan bilangan puluhan");
           }
       } else {
           System.out.println("Angka " + angka + "adalah");
           System.out.println("Bilangan Ganjil");
       }
       
//       
//        String hasil;
//        hasil = angka%2==0 ? "Bilangan Genap":"Bilangan Ganjil";
//        System.out.println(hasil);
    }
    
}
    
