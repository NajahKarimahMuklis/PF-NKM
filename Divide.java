import static java.lang.System.out;

public class Divide {
	public static void main(String[] args) {
		int[] bilangan = new int[20];
		for (int a = 0; a < bilangan.length; a++){
			bilangan[a] = a + 1;
		}
		
		out.println("Bilangan Ganjil\t\tBilangan Genap");
		out.println("---------------\t ---------------");
		
		for (int a = 0; a < bilangan.length; a++){
			if(bilangan[a] % 2 == 0){
				out.print(bilangan[a] + "\t\t");
			} else {
				out.println(bilangan[a]);
			}
			
		}
	}
}