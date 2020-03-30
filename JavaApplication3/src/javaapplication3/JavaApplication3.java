
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi giriniz ");
        int yas = scanner.nextInt();
        
        scanner.nextLine(); //Dummy input
        System.out.println("Adiniz giriniz ");
        String isim = scanner.nextLine();
        
        System.out.println("Yas " + yas);
        System.out.println("Adiniz " + isim);
        
        System.out.println("3 adet sayi giriniz (ister bosluk ister enter) ");
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        
        System.out.println("Yas 1 = " + yas1 + " yas 2 = " + yas2 + " yas 3 = " + yas3);
        /* dummy giris ve bosluk birakarakta giris */
        
    }
    
}
