import java.util.HashMap;

public class contain {
    public static void main(String[] args) {
        //String a = "hello world";
        //String h = "hello";
       // boolean res = h.contains(a);
         //String nval = a.replace("world","java");
        //System.out.println(nval);

        HashMap bazarList = new HashMap();
        bazarList.put("Honey",330);
        bazarList.put("Mustard Oil",115);
        bazarList.put("Ghee",534);
        bazarList.put("Orange",220);
        Object[] priceArray = bazarList.values().toArray();
        for (int i=0;i< priceArray.length;i++){
            System.out.println(priceArray[i]);
        }


    }

}
