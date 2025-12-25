/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CH02;

import java.util.Scanner;

/**
 *
 * @author Chymaa
 */
public class Problem02 {

    /*
    - Receives two inputs a number and a string and prints the string.
    Control Statements Examples on different lines according to the given number.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text ehich u wanna repeat: ");
        String text = scanner.nextLine();
        System.out.print("Enter number:  ");
        int num = scanner.nextInt();
        for (; num > 0; num--) {
            System.out.println(text);
        }
    }

}
