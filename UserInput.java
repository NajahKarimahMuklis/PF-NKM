import  java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double tip = bill * 15 / 100; // 15% of the bill

        System.out.println(tip);
        
    }
}