/*9. Write a program to sum of user input until users input ‘q’ from keyboard*/
package If_else_loop;

import java.util.Scanner;

public class assignment01_prob09 {
    public static void main(String[] args) {
        int sum=0;
        char ch;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Input a number");
            sum+=input.nextInt();
            System.out.println(sum);
            System.out.println(" continue?");
            ch=input.next().charAt(0);
        }
        while (ch!='q');

    }

}

