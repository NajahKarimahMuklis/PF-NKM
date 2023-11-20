import java.util.Scanner;

public class Weather{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String temp = sc.nextLine();

		switch(temp){
		case "30":
			System.out.println("Panas");
			break;
		case "24":
			System.out.println("Normal");
			break;
		case "20":	
			System.out.println("Dingin");
			break;	
		}	
	}
}