/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NIM : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public class EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan Nama Depan anda = ");
        String nama = scan.nextLine();
        System.out.println("Ejaan untuk "+ nama+ " adalah : ");
        char[] srtArr = nama.toCharArray();
        for (int i = 0 ; i < nama.length(); i++){
            int j = 1;
            System.out.println("Huruf ke-"+j+ " : " + srtArr[i]);
        }
    }
    
}
