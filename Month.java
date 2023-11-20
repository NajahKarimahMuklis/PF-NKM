import static java.lang.System.out;
import java.util.Scanner;

public class Month {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	out.println("Guess month!");
	int month = sc.nextInt();
	
	switch(month) {
	case 1:
	 out.println("November");
	 break;
	case 2:
	 out.println("February");
	 break;
	case 3:
	 out.println("January");
	 break;
	case 4:
	 out.println("April");
	 break;
	 }
	 out.println("That's all. Thanks!");
	 }
}