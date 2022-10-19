/*1. Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element*/
package Function_Array;

import java.util.Scanner;

public class Check_numbers_exist_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {1,3,5,7,2,4,6,8};
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        int flag =0;
        for( int i=0; i< a.length; i++)
        {
            if (a[i]==input)
            {
                System.out.println("found in position " + i);
                flag++;
                break;
            }
        }
        if(flag!=1)
        {
            System.out.println("found no element");
        }
    }
}
