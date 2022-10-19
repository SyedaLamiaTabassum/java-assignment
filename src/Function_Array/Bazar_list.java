/*
4. Create your todays bazar list/pocket expenditure which includes the item name and price.
 Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
  If found no item, then print message as "No item found" and
   another function named totalSum() which will return total price of items.*/
package Function_Array;

import java.util.HashMap;
import java.util.Scanner;

public class Bazar_list {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("rice",350);
        hashMap.put("potato",100);
        hashMap.put("onion",35);
        hashMap.put("flour",150);
        hashMap.put("battery",50);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a product name: ");
        String p = sc.next();
        System.out.println(hashMap.get(p));
    }
    public String searchItem(String p )
    {
     String  product = );
     return product;
    }
}
