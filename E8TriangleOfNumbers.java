package W1BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class E8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= n; row++) {
            for (int time = 1; time <= row; time++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
