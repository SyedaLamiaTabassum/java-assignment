/*1. Write a program to check if inputted letter is small or capital*/

package If_else_loop;

import java.util.Scanner;

public class assignment01_prob01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a letter: ");
        char letter = input.next().charAt(0);
        if (letter >='A'&& letter<='Z')
        {
            System.out.println("Capital");
        }
        else
        {
            System.out.println("small");
        }
    }
}
