import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String color = sc.nextLine();

        int box;

        switch (color) {
            case "red":
               box = 1;
                break;
            case "green":
                box = 2;
                break;
            case "black":
                box = 3;
                break;        
			default:
				box = -1; // For unknown colors
				break;
        }
		
		if (box != -1) {
			System.out.println(box);
		} else {
			System.out.println("Unknown Color");
		}

    }
}