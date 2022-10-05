
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class KonversiNilai {
    public static void main(String[] args) {
        String nim, nama, prodi, matkul, grade = null;
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("=====Masukan Data=====");
        System.out.println("Masukkan NIM = ");
        nim = masukan.nextLine();
        System.out.println("Masukkan Nama = ");
        nama = masukan.nextLine();
        System.out.println("Matakuliah = ");
        matkul = masukan.nextLine();
        System.out.println("Masukkan Nilai Angka = ");
        nilai = masukan.nextInt();
        System.out.println("=====Hasil Pengolahan Data=====");
//      ====MENGAMBIL PRODI DARI NIM substring 1====
//        prodi = nim.substring(3);
//        System.out.println(prodi);

//      ====MENGAMBIL PRODI DARI NIM substring 2====
//        prodi = nim.substring(3,5);
//        if (prodi.equals("52")) {
//            System.out.println("Program Studi = S-1 Teknologi Informasi");
//        } else if (prodi.equals("51")) {
//            System.out.println("Program Studi = S-1 Sistem Informasi");
//        } else if (prodi.equals("31")) {
//            System.out.println("Program Studi = D-3 Sistem Informasi");
//        } else {
//            System.out.println("Program Studi Tidak Tersedia");
//        }

//        ====PENGGUNAAN SWITCH CASE====
//          prodi = nim.substring(3,5);
//        switch (prodi) {
//            case "52" :
//                System.out.println("Program Studi = S-1 Teknologi Informasi");
//                break;
//            case "51" :
//                System.out.println("Program Studi = S-1 Sistem Informasi");
//                break;
//            case "31" :
//                System.out.println("Program Studi = D-3 Sistem Informasi");
//                break;
//            default :
//                System.out.println("Program Studi Tidak Tersedia");
//                break;
//        }
        
//        ====PENGGUNAAN SWITCH CASE TERBARU====
        prodi = nim.substring(3,5);
        switch (prodi) {
            case "52" -> System.out.println("Program Studi = S-1 Teknologi Informasi");
            case "51" -> System.out.println("Program Studi = S-1 Sistem Informasi");
            case "31" -> System.out.println("Program Studi = D-3 Sistem Informasi");
            default -> System.out.println("Program Studi Tidak Tersedia"); 
        }
        
        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "A-";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "B-";
        } else if (nilai >= 65) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "C-";
        } else if (nilai >= 55) {
            grade = "D";
        } else if (nilai >= 50) {
            grade = "D-";
        }
        System.out.println("Namamu : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + prodi);
        System.out.println("Matakuliah : " + matkul);
        System.out.println("Nilaimu Adalah : " + nilai);
        System.out.println("grademu Adalah : " + grade);
    }
    
}
