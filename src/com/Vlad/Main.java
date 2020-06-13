package com.Vlad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        while (count < 11) {
            System.out.println("Enter a number #" + count);
            boolean flag = scanner.hasNextInt();
            if (flag) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                System.out.println("Invalid input, numbers only");
                scanner.close();
                }
        }
        System.out.println("The sum of entered numbers is: " + sum);
        scanner.close();
    }
}
