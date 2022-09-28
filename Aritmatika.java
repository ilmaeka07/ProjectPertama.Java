
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Aritmatika {
    public static void main(String[] args) {
        int jam, sisajam, menit, detik, masukan;
        Scanner input = new Scanner(System.in);
        System.out.println("KONVERSI WAKTU");
        System.out.println("==============");
        System.out.println("Masukkan angka dalam satuan detik : ");
        masukan = input.nextInt();
        jam = masukan / 3600;
        sisajam = masukan%3600;
        menit = (sisajam) / 60;
        detik = sisajam%60;
        System.out.println("Hasil Konversi");
        System.out.println(jam + "jam" + "=" + menit + "menit" + "=" + detik + "sisajam");
    }
    
}
    
