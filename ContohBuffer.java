/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Acer
 */
public class ContohBuffer {
    public static void main(String[] args) throws IOException {
        String nama;
        int usia;
        InputStreamReader isr  = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Masukkan nama : ");
        nama = br.readLine();
        System.out.println("Masukkan usia : ");
        usia = Integer.parseInt(br.readLine());
//        usia = br.read();
        System.out.println("Namaku adalah : " + nama);
        System.out.println("Usiaku adalah : " + usia);
        
    }
    
}
