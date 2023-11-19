import java.util.Scanner;

public class Number2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Silakan masukkan kode negara = " );
        String kodeNegara = sc.nextLine();

        if (kodeNegara.equals("ES")) {
            System.out.println("KODE ES = Spain");
        } else if (kodeNegara.equals("TN")) {
            System.out.println("KODE TN = Tunisia");
        } else if (kodeNegara.equals("ID")) {
            System.out.println("KODE ID = Indonesia");
        } else if (kodeNegara.equals("MM")) {
            System.out.println("KODE MM = Myanmar");
        } else if (kodeNegara.equals("IN")) {
            System.out.println("KODE IN = India");
        } else {
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }
    }
}
