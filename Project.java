import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : " );
        String nama = sc.nextLine();

        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Persegi Panjang");
        System.out.print("Pilih nomor rumus : ");

        int a = sc.nextInt();
        if (a == 1) {
            System.out.print("Alas : " );
            int alas = sc.nextInt();
            System.out.print("Tinggi : " );
            int tinggi = sc.nextInt();
            double luas = 0.5 * alas * tinggi;
            System.out.println("Halo " + nama + ". Luas Segitiga yang anda cari adalah " + luas);

        } else if (a == 2) {
            System.out.print("Panjang : " );
            int panjang = sc.nextInt();
            System.out.print("Lebar : " );
            int lebar = sc.nextInt();
            double Luas = panjang * lebar;
            System.out.println("Halo " + nama + ". Luas Segitiga yang anda cari adalah " + Luas);
        }
    }
}