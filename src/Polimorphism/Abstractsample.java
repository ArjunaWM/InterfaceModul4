/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphism;

/**
 *
 * @author ARJUNA
 */
public class Abstractsample {
    public static void main(String[] args) {
        
        bangunDatar obj = new bujurSangkar(10);
        
        System.out.println("luas bujur sangkar dengan sisi 10 = " + obj.hitungLuas());
        System.out.println("Kelilingnya = " + obj.hitungKeliling());
        System.out.println("\n");
        
        bangunDatar obj1 = new Lingkaran(7);
        System.out.println("Luas Lingkaran dengan jari-jari 7 = " + obj1.hitungLuas());
        System.out.println("Kelilingnya = " + obj1.hitungKeliling());
    }
    
}
