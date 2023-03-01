package proben;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = scanner.nextInt();
        int secondNumber = 3;

        int result = number % secondNumber;

        if (result == 0) {
            System.out.println("the number is divisible by 3");
        } else {
            System.out.println("the number is not divisible by 3");
        }


    }
}
