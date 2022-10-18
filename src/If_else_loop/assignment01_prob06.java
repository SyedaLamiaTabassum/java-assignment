/*6. Write  a program to find the factorial of a given number*/
package If_else_loop;

import java.util.Scanner;

public class assignment01_prob06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact= 1;
        System.out.println("enter a number: ");
        int numb= input.nextInt();
        for(int i= numb;i>=1;i--)
        {
           fact = fact*i;
        }
        System.out.println("factorial is: " + fact);
        }
    }

