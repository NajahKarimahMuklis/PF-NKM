import static java.lang.System.out;

public class Mean{
	public static void main(String[] args){
		int a = 23;
		int b = 45;
		int c = 22;
		int d = 23;
		int e = 77;
		
		int jumlah = a + b + c + d + e;
		out.println("Jumlah Nilai: " + jumlah);
		double mean = jumlah / 5;
		out.println("Maka, mean-nya adalah: " + mean);
	}
}