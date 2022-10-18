/*5. Write a program to sum of numbers which only divisible by 5 from 1 to 100*/
package If_else_loop;

public class assignment01_prob05 {
    public static void main(String[] args) {
        int sum =0;
        int numb =100;
        for(int i=1;i<=numb;i++)
        {
            if (i%5==0)
            {
               sum+= i;
            }
        }
        System.out.println("Sum: " +sum);
    }
}
