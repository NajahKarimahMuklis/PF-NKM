import java.util.Scanner;

public class Number2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Silakan masukkan kode negara = " );
        String kodeNegara = sc.nextLine();

        switch (kodeNegara) {
            case "ES":
                System.out.println("KODE ES = Spain");
                break;
            case "TN":
                System.out.println("KODE TN = Tunisia");
                break;
            case "ID":
                System.out.println("KODE ID = Indonesia");
                break;
            case "MM":
                System.out.println("KODE MM = Myanmar");
                break;
            case "IN":
                System.out.println("KODE IN = India");
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                break;
        }
    }
}
