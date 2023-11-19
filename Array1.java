import static java.lang.System.out;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jumlahData;
		int[] array = new int[6];
		double jumlah, rerata;
		
		out.print("\n Jumlah Data: ");
		jumlahData = sc.nextInt();
		out.println("\t\n Inputkan data berikut:\n");
		
		
		for(int i = 0; i < jumlahData; i++){
			out.print(" Data ke-" + i + ": ");
			array[i] = sc.nextInt();
		}

		out.println("\n Menampilkan data: ");
		for(int j = 0; j < jumlahData; j++){
			if(array[j] % 2 == 0){
				out.println();
				out.println(" " + array[j] + " --> Angka Genap");
			}else{
				out.println(" " + array[j] + " --> Angka Ganjil");

			}
		}
		jumlah = 0;
		for(int k = 0; k < jumlahData; k++){
			jumlah = jumlah + array[k];
		}
		
		rerata = jumlah / jumlahData;
		out.println("\n\n TOTAL PENJUMLAHAN: " + jumlah);
		out.println(" RATA-RATA: " + rerata);
	}
}
