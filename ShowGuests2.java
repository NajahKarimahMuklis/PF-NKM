import static java.lang.System.out;

public class ShowGuests {
	
	public static void main(String args[]) {
		int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
		out.println("Tentukan jenis angka di bawah ini!");
		out.println("Genap\tGanjil");
		
		for(int roomNum = 0; roomNum < 10; roomNum++) {
			 out.print(roomNum);
			 out.print("\t");
			 out.println(guests[roomNum]);
		}

	}	
}