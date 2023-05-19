package W1BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double price = 0;

        switch (groupType) {
            case "Students":
                if (weekDay.equals("Friday")) {
                    price = 8.45;
                } else if (weekDay.equals("Saturday")) {
                    price = 9.80;
                } else if (weekDay.equals("Sunday")) {
                    price = 10.46;
                }

                break;
            case "Business":
                if (weekDay.equals("Friday")) {
                    price = 10.90;
                } else if (weekDay.equals("Saturday")) {
                    price = 15.60;
                } else if (weekDay.equals("Sunday")) {
                    price = 16;
                }

                break;
            case "Regular":
                if (weekDay.equals("Friday")) {
                    price = 15;
                } else if (weekDay.equals("Saturday")) {
                    price = 20;
                } else if (weekDay.equals("Sunday")) {
                    price = 22.50;
                }

                break;
        }
        double totalPrice = countPeople * price;

        if (groupType.equals("Students") && countPeople >=30) {
            totalPrice = totalPrice * 0.85;
        } else if (groupType.equals("Business") && countPeople >= 100) {
            totalPrice = totalPrice - (price * 10);
        } else if (groupType.equals("Regular") && countPeople >= 10 && countPeople <=20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
