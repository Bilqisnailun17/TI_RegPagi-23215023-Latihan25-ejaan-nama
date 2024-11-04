/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
import java.util.Scanner;
public class latihan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama dari user
        System.out.print("Masukkan nama depan anda untuk dieja: ");
        String nama = scanner.nextLine();

        // Menampilkan hasil ejaan
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }

        scanner.close();
    }
}


