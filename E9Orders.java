package W1BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E9Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0;

        for (int i = 1; i <= input; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = (pricePerCapsule * (days * capsulesCount));

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);

            totalPrice += orderPrice;


        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
