import java.util.Scanner;

public class Number1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Silakan masukkan nilai yang akan dikonversi = " );
        char nilaiHuruf = sc.next().charAt(0);

        switch (nilaiHuruf) {
            case 'A':
                System.out.println("Konversi " + nilaiHuruf + " = 4.0");
                break;
            case 'B':
                System.out.println("Konversi " + nilaiHuruf + " = 3.0");
                break;
            case 'C':
                System.out.println("Konversi " + nilaiHuruf + " = 2.0");
                break;
            case 'D':
                System.out.println("Konversi " + nilaiHuruf + " = 1.0");
                break;
            case 'E':
                System.out.println("Konversi " + nilaiHuruf + " = 0");
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                break;
        }
    }
}
