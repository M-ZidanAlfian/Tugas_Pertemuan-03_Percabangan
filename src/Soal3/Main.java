package soal3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Masukkan jam mulai: ");
            int jamMulai = scanner.nextInt();
            System.out.print("Masukkan menit mulai: ");
            int menitMulai = scanner.nextInt();
            
            System.out.print("Masukkan jam selesai: ");
            int jamSelesai = scanner.nextInt();
            System.out.print("Masukkan menit selesai: ");
            int menitSelesai = scanner.nextInt();
            
            int waktuMulai = jamMulai * 60 + menitMulai;
            int waktuSelesai = jamSelesai * 60 + menitSelesai;
            int selisihWaktu = waktuSelesai - waktuMulai;
            
            int lamaJam = selisihWaktu / 60;
            int lamaMenit = selisihWaktu % 60;
            
            System.out.println("Lama menit: " + selisihWaktu +" menit ");
            System.out.println("Lama waktu antara jam mulai dan jam selesai : " + lamaJam + " jam  " + lamaMenit + " menit.");
        }
    }
}
