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
        Bazar_list bazarList = new Bazar_list();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a product name: ");
        String p = sc.next();
        String message = bazarList.searchItem(p);
        int TotalPrice = bazarList.totalSum();
        if (message == "No item found")
        {
            System.out.println(message);
        }
        else
        {
            System.out.println("price of " + p + " is " + message );
        }
        System.out.println("total price is "+ TotalPrice);
    }
    public int totalSum()
    {
        HashMap list = list();
        int total = 0;
        Object [] priceArray = list.values().toArray();

        for (int i=0; i<priceArray.length; i++)
        {
            total+=Integer.parseInt(priceArray[i].toString()); //object type array cast to int for the case of numerical text //
        }
        return total;
    }

    public String searchItem(String p )
    {
        HashMap list = list();
        if (list.containsKey(p))
        {
            String price = list.get(p).toString();
            return price;
        }
        else
        {
            return "No item found";
        }
    }

    public HashMap list()
    {
        HashMap list = new HashMap();
        list.put("rice",350);
        list.put("potato",100);
        list.put("onion",35);
        list.put("flour",150);
        list.put("battery",50);
        return list;
    }
}
