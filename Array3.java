import static java.lang.System.out;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int[] item = new int[5];
	int[] price = {2500, 3000, 4000, 5000, 6000};
	int itemBelanja, totalPrice, sum;
	
	out.println("\t\n Input jumlah barang belanja\n");
	
	for(int a = 0; a < 5; a++){
		out.print(" Jumlah belanja item-" + a + " Rp " + price[a] + ": ");
		item[a] = sc.nextInt();
	}
	
	out.println("\n Daftar Belanja dan Harga:");
	
	for(int b = 0; b < 5; b++){
		totalPrice = price[b] * item[b];
		out.println(" Harga barang ke-" + b + ", " + price[b] + ", " + item[b] + " item: " + totalPrice);		
	}
	
	itemBelanja = 0;
		for(int c = 0; c < 5; c++){	
		itemBelanja = itemBelanja + item[c];
		}	
	
	sum = 0;
		for(int d = 0; d < 5; d++){
			sum = sum + price[d]*item[d];
		}
	out.println("\n\n TOTAL ITEM BELANJA\t: " + itemBelanja);
	out.println(" TOTAL BELANJA \t\t: Rp " + sum );
	}
}