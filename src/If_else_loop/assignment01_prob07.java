/*7. Write a program to print prime numbers from 2 to n*/
package If_else_loop;

import java.util.Scanner;

public class assignment01_prob07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int y = sc.nextInt();
        int prime = 0;
        int counter= 1;
        for (int i=2; i<=y; i++){
            int factor=0;
            for (counter=1; counter<i; counter++)
            {
                if (i%counter==0)
                {
                    factor = factor+1;
                }
            }
            if (factor==1)
            {
                prime = prime + 1;
                System.out.println(i);
            }
        }





    }

}

