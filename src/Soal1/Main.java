package Soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
 
            System.out.print("Masukkan bilangan ril: ");
            double bilangan = input.nextDouble();
            
            int depanKoma = (int) bilangan;
            int belakangKoma = (int) ((bilangan - depanKoma) * 100); 
            
            if (depanKoma % 3 == 0 && belakangKoma % 3 == 0) {
                System.out.println("Angka didepan koma dan angka dibelakang koma adalah kelipatan 3.");
            } else {
                System.out.println("Angka didepan koma dan angka dibelakang koma bukan kelipatan 3.");
            }
        }
    }
}
