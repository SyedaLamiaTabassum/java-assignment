/*4. Write a program to check balance and withdraw money from ATM booth using if else or switch case*/
package If_else_loop;

import java.util.Scanner;

public class assignment01_prob04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("choose option:");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("check balance");
                double balance = Math.random();
                double max = 10000;
                double min = 100;
                System.out.println("your balance is: "+ Math.floor(balance*(max-min)+min));
                break;
            case 2:
                System.out.println("withdraw money");

                System.out.println("Enter amount of money: ");
                double money = input.nextDouble();
                System.out.println("amount withdrawn: " + money);
                break;
            default:
                System.out.println("you have chosen none");
                break;

        }
    }
}
