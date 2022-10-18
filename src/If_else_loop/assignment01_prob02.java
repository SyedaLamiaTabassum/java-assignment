/*2. Write a program to calculate GPA and find grade
 */


package If_else_loop;

import java.util.Scanner;

public class assignment01_prob02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade ;
        double sum = 0.00;
        double avg ;
        System.out.println("enter number of courses: ");
        int course = sc.nextInt();
        for (int i=1; i<=course;i++)
        {
            System.out.println("enter grade: ");
            grade = sc.nextDouble();
            sum = sum+ grade;
        }
        avg = sum/course;
        System.out.println("GPA IS: "+ avg);
        if (avg>=3.7 && avg<=4)
        {
            System.out.println("grade is A");
        }
        else if (avg>=3.3 && avg<3.7) {
            System.out.println("grade is B+");
        }else if (avg>=3 && avg<3.3) {
            System.out.println("grade is B");
        }
        else if (avg>=2.7 && avg<3) {
            System.out.println("grade is B-");
        }
        else if (avg>=2.3 && avg<2.7) {
            System.out.println("grade is C+");
        }
        else if (avg>=2 && avg<2.3) {
            System.out.println("grade is C");
        }
        else if (avg>=1.7 && avg<2) {
            System.out.println("grade is C-");
        }
        else if (avg>=1.3 && avg<1.7) {
            System.out.println("grade is D+");
        }
        else if (avg>=1 && avg<1.3) {
            System.out.println("grade is D");
        }
        else if (avg>=0.7 && avg<1) {
            System.out.println("grade is D-");
        }
        else
        {
            System.out.println("grade is F");
        }
    }
}
