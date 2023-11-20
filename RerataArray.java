import static java.lang.System.out;
import java.util.Scanner;

public class RerataArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int limit;
		int[] array = new int[10];
		double jumlah, rerata;
		
		out.println("\n\t Mencari Rerata dengan Menggunakan Array\n");
		out.print(" Inputkan batas nilai : ");
		limit = sc.nextInt();
		
		for(int i = 1; i <= limit; i++){
			out.print(" Nilai ke-" + i + " : ");
			array[i] = sc.nextInt();
		}
		
		out.println("\n Masukkan data nilai");
		for(int j = 1; j <= limit; j++){
			out.print(" " + array[j] + ",");
		}
		
		jumlah = 0;
		for(int k = 1; k <= limit; k++){
			jumlah = jumlah + array[k];
		}
		rerata = jumlah / limit;
		out.println("\n\n Nilai Reratanya adalah: " + rerata);
	}
}