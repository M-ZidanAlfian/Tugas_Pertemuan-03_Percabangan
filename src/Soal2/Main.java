package Soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("Masukkan bilangan pertama: ");
            int bil1 = scanner.nextInt();
            
            System.out.print("Masukkan bilangan kedua: ");
            int bil2 = scanner.nextInt();
            
            System.out.print("Masukkan operator aritmatika: ");
            char operator = scanner.next().charAt(0);
            switch (operator) {
                case '+' -> System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " =  " + (bil1 + bil2));
                case '-' -> System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " = " + (bil1 - bil2));
                case '*' -> System.out.println("Hasil perkalian " + bil1 + " dan " + bil2 + " = " + (bil1 * bil2));
                case '/' -> {
                    if (bil2 != 0)
                        System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " = " + ((double) bil1 / bil2));
                    else
                        System.out.println("Pembagian dengan nol tidak valid.");
                }
                case '%' -> {
                    if (bil2 != 0)
                        System.out.println("Hasil modulo " + bil1 + " dan " + bil2 + " adalah = " + (bil1 % bil2));
                    else
                        System.out.println("Modulo dengan nol tidak valid.");
                }
                default -> System.out.println("Operator aritmatika tidak valid.");
            }
        }
    }
}