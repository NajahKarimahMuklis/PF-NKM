import static java.lang.System.out;
public class KelompokkanGanjilGenap {
    public static void main(String[] args) {
        
        int[] bilangan = new int[25];
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }

        out.println("\nBilangan Ganjil\t\tBilangan Genap");
        out.println("--------------- \t -------------");

        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 != 0 ) {
                out.print(bilangan[i] + "\t\t\t");
            } else {
                out.println(bilangan[i]);
            }
        }
    }
}