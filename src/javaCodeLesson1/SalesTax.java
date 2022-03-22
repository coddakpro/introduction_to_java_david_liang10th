package javaCodeLesson1;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("sales tax is $" + (int)(tax * 100) / 100);

        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
    }
}
