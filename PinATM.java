import java.util.Scanner;

public class PinATM {
    public static void main(String[] args) {
        String pin = "1609";
        int count = 0, guessLimit = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang di ATM");

        while (count < guessLimit) {
            System.out.print("MASUKKAN PIN ATM ANDA: ");
            String p = sc.nextLine();

            if (p.equals(pin)) {
                System.out.println("....SELAMAT DATANG DI MENU PENARIKAN CEPAT....");
                break;
            } else {
                System.out.println("PIN YANG ANDA MASUKKAN SALAH.");
				count++;
            }
        }
        if (count >= guessLimit) {
            System.out.println("MAAF, AKUN ANDA DIBLOKIR UNTUK 12 JAM KE DEPAN");
        }
    }
}