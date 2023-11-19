import  java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int temperatureinCelcius = sc.nextInt(); 

        if(temperatureinCelcius>=100) {
        System.out.println("Boiling");
        } else {
        System.out.println("Not Boiling");
        }
    }
}