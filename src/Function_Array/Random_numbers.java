/*7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)*/
package Function_Array;


import java.util.Scanner;

public class Random_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int [20];
        int upper = 100;
        int lower = 0;
        for (int i =1; i<n.length; i++ )
        {
            int a= (int) (Math.random()*(upper-lower)+lower);
            int b= (int)Math.floor(a);
            n[i-1]=b;
        }
        Random_numbers random_numbers = new Random_numbers();
        random_numbers.findDuplicate(n);
        System.out.println("Max value :"+random_numbers.findMax(n));
        System.out.println("Min value :"+random_numbers.findMin(n));
    }
    public void findDuplicate(int []n)
    {
        for(int i=0; i<n.length; i++)
        {
            for( int j=i+1; j<n.length; j++)
            {
                if(n[i] == n[j])
                {
                    System.out.println("Found duplicate for "+ n[i]);
                }
            }
        }
    }
    public int findMax(int [] n)
    {
        int max = n[0];
        for (int i=0;i<n.length;i++)
        {
            if (n[i]>= max)
            {
                max= n[i];
            }
        }
        return max;
    }
    public int findMin(int []n)
    {
        int min = n[0];
        for (int i=0;i<n.length;i++)
        {
            if (n[i]<= min)
            {
                min= n[i];
            }
        }
        return min;

    }

}