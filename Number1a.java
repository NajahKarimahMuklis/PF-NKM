import java.util.Scanner;

public class Number1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Silakan masukkan nilai yang akan dikonversi = " );
        char nilaiHuruf = sc.next().charAt(0);

        if (nilaiHuruf == 'A') {
            System.out.println("Konversi " + nilaiHuruf + " = 4.0");
        } else if (nilaiHuruf == 'B') {
            System.out.println("Konversi " + nilaiHuruf + " = 3.0");
        } else if (nilaiHuruf == 'C') {
            System.out.println("Konversi " + nilaiHuruf + " = 2.0");
        } else if (nilaiHuruf == 'D') {
            System.out.println("Konversi " + nilaiHuruf + " = 1.0");
        } else if (nilaiHuruf == 'E') {
            System.out.println("Konversi " + nilaiHuruf + " = 0");
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
        }
    }
}
