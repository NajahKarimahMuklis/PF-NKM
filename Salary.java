import java.util.Scanner;

public class Salary {
	public static void main(String[] abc){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n Masukkan Nama Pegawai \t\t: ");
		String nama = sc.nextLine();
		System.out.print("\n Masukkan Golongan (A/B/C/D) \t: ");
		char gol = sc.next().charAt(0);
		
		double gajiPokok = 0;
		
		switch(gol){
			case 'A':
				gajiPokok = 400000;
				break;
			case 'B':
				gajiPokok = 500000;
				break;
			case 'C':
				gajiPokok = 750000;
				break;
			case 'D':
				gajiPokok = 900000;
				break;
			default:
				System.out.println("\n Input tidak valid.");
		}	

		double tunjangan = 0.3 * gajiPokok;
		double tax = 0.05 * (gajiPokok + tunjangan);
		double gajiBersih = gajiPokok + tunjangan - tax;
		
		System.out.println("\n=========  GAJI PEGAWAI =========");
		System.out.println(" Nama Pegawai \t: " + nama);
		System.out.println(" Golongan \t: " + gol);
		System.out.println(" Gaji Pokok \t: Rp" + gajiPokok);
		System.out.println(" Tunjangan \t: Rp" + tunjangan);
		System.out.println(" Pajak \t\t: Rp" + tax);
		System.out.println(" Gaji Bersih \t: Rp" + gajiBersih);
		
	}
	
}