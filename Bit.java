/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Bit {
    public static void main(String[] args) {
        int a=4, b=9, c;
        c = a%b;
        System.out.println("a AND b = " + c);
        c = a|b;
        System.out.println("a OR b = " + c);
        c = a^b;
        System.out.println("a EX OR b = " + c);
        c = ~a;
        System.out.println("NOT a = " + c);
        c = a << 2;
        System.out.println("a GESER KIRI = " + c);
        c = a >> 2;
        System.out.println("a GESER KANAN = " + c);
    }
}
