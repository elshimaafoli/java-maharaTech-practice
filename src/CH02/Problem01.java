/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH02;

import java.util.Scanner;

/**
 *
 * @author Chymaa
 *
 */
public class Problem01 {
    // Receives an input and checks for its value and prints it back.

    static void checkValue(int num) {
        if (num > 0) {
            System.out.println("this value is number and it's positive");
        } else if (num < 0) {
            System.out.println("this value is number and it's Negative");
        } else {
            System.out.println("this value is number and it equals zero");
        }
    }

    static void checkValue(double num) {
        if (num > 0) {
            System.out.println("You entered a positive decimal: " + num);
        } else if (num < 0) {
            System.out.println("You entered a negative decimal: " + num);
        } else {
            System.out.println("you entered zero");
        }
    }

    static void checkValue(String value) {
        if (value.isEmpty()) {
            System.out.println("there is nothing");
        } else if (value.matches("-?\\d+")) {
            checkValue(Integer.parseInt(value));
        } else if (value.matches("-?\\d+\\.\\d+")) {
            checkValue(Double.parseDouble(value));
        } else {
            System.out.println("you entered a text:" + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter anything words or numbers: ");
        checkValue(scanner.nextLine());
        scanner.close();
    }
}
