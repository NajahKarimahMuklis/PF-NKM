import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);


        int choice;

        // Check if the input is an integer
        if (sc.hasNextInt()) {
            choice = sc.nextInt();

            // Check if the choice is within the valid range
            if (choice >= 0 && choice < menu.length) {
                String Drink = menu[choice];
                System.out.println(Drink);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid input. Please, enter a valid integer");
        }    
        
        sc.close();
        
    }

}