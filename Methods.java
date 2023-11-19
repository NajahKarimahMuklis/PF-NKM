import java.util.Scanner;

public class Program {

    public static void bot() {
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextInt();

        if (UserInput == 1) {
            System.out.println("Order confirmed");
        } else if (UserInput == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }

        sc.close();

    }
    
    public static void main(String[] args) {
        bot();
    }
}