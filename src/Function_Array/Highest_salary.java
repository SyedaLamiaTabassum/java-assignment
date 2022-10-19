/*3. Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary
*/
package Function_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Highest_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of employees: ");
        int employees = sc.nextInt();
        int employee [] = new int [employees];
        for (int i=1; i<= employee.length;i++)
        {
            System.out.println("Enter salary of employee" + i+ ":");
            int salary = sc.nextInt();
            employee [i-1] = salary;
        }
        Arrays.sort(employee);
        System.out.println("which highest salary would you like to see?");
        int serial = sc.nextInt();
        System.out.println(employee[serial-1]);
    }


}
