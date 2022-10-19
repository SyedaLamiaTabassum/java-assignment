/*2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3*/
package Function_Array;

import java.util.Scanner;

public class Number_of_notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  notes []  = {1000,500,200,100,50,20,10,5,2,1};

        System.out.println("enter money amount:");
        int amount = sc.nextInt();

        for (int i=0; i<notes.length; i++)
        {
            while (amount >= notes[i])
            {
                int temp = amount/notes[i];
                amount = amount% notes[i];
                System.out.println("total number of "+ notes[i] + "tk notes" +temp);
                break;
            }
        }
    }
}
