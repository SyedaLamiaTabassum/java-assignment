/*5. Take 5 numbers from users in an array.
 Then find out the average number, how many even and how many odd numbers
 using these functions: average(), countEvenNumbers(), countOddNumbers()*/
package Function_Array;

import java.util.Scanner;

public class Functions_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []num  = new int[5];
        System.out.println("enter numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("array elements are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        Functions_in_Array functions_in_array = new Functions_in_Array();
        functions_in_array.countOddNumber(num);
        functions_in_array.countEvenNumber(num);
        functions_in_array.average(num);
    }
    public void countOddNumber (int [] num)
    {
        int oddCounter = 0;
        for(int i=0; i<num.length; i++)
        {
            if(num[i]%2 != 0)
            {
                oddCounter++;
            }
        }
        System.out.println("Total Number of Odd numbers are: "+ oddCounter);
    }
    public void countEvenNumber(int []num)
    {
        int evenCounter = 0;
        for(int i=0; i<num.length; i++)
        {
            if(num[i]%2 == 0)
            {
                evenCounter++;
            }
        }
        System.out.println("Total Number of Even numbers are: "+ evenCounter);
    }
    public void average(int []num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double avg = sum / num.length;
        System.out.println("average is " + avg);
    }

    }


