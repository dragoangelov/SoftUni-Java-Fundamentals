package W1BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadset = countLostGames / 2;
        int countMouse = countLostGames / 3;
        int countKeyboard = countLostGames / 6;
        int countDisplay = countLostGames /12;

        double totalPrice = (countHeadset * priceHeadset) + (countMouse * priceMouse)
                + (countKeyboard * priceKeyboard) + (countDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
