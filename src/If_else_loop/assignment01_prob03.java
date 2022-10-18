/*3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241*/
package If_else_loop;

import java.util.Scanner;

public class assignment01_prob03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        double num1= sc.nextDouble();
        System.out.println("enter another number:");
        double num2= sc.nextDouble();
        if (Math.abs(num1-num2)<=0.01)
        {
            System.out.println("they are equal");
        }
        else
        {
            System.out.println("they are not equal");
        }
    }
}
