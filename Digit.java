import static java.lang.System.out;
import java.util.Scanner;

public class Digit{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double ringgitMys, rupiahIna;
		
		out.println("\n\t ---- Mengkonversikan dari Ringgit Malaysia ke Rupiah Indonesia ----\n");
		
		out.print("\t Masukkan nilai uang: ");
		ringgitMys = sc.nextDouble();
		
		rupiahIna = ringgitMys * 3309.32;
		
		
		out.print(" \n\t Hasil konversi: Rp" + rupiahIna + "\n");
		
	}
}