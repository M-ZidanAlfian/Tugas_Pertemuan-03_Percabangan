package Soal1;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        // Input bilangan riil
        try (Scanner input = new Scanner(System.in)) {
            // Input bilangan riil
            System.out.print("Masukkan sebuah bilangan riil: ");
            double bilangan = input.nextDouble();
            
            // Membagi bilangan menjadi bagian depan dan belakang koma
            int depanKoma = (int) bilangan;
            int belakangKoma = (int) ((bilangan - depanKoma) * 100); // Mengambil 2 digit belakang koma
            
            // Penambahan pengecekan apakah angka di depan koma dan di belakang koma
            // merupakan kelipatan 3
            boolean depanKomaKelipatan3 = depanKoma % 3 == 0;
            boolean belakangKomaKelipatan3 = belakangKoma % 3 == 0;
            
            // Pengecekan apakah angka di depan koma kelipatan 3 dan angka di belakang koma bukan kelipatan 3
            if (depanKomaKelipatan3 && !belakangKomaKelipatan3) {
                System.out.println("Angka di depan koma kelipatan 3 dan angka di belakang koma bukan kelipatan 3.");
            }
            // Pengecekan apakah angka di belakang koma kelipatan 3 dan angka di depan koma bukan kelipatan 3
            else if (!depanKomaKelipatan3 && belakangKomaKelipatan3) {
                System.out.println("Angka di depan koma bukan kelipatan 3 dan angka di belakang koma kelipatan 3.");
            }
            // Pengecekan apakah angka di depan koma dan di belakang koma keduanya kelipatan 3
            else if (depanKomaKelipatan3 && belakangKomaKelipatan3) {
                System.out.println("Angka di depan koma dan di belakang koma keduanya kelipatan 3.");
            }
            // Jika tidak ada kondisi yang terpenuhi, maka keduanya bukan kelipatan 3
            else {
                System.out.println("Angka di depan koma dan di belakang koma bukan kelipatan 3.");
            }
        }
    }
}
