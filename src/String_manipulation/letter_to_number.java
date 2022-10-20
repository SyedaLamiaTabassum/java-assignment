package String_manipulation;

public class letter_to_number {
    public static void main(String[] args) {
        String str = "chattogram";
        String first =  String.valueOf(str.charAt(0)).toUpperCase();
        String last = String.valueOf(str.charAt(str.length()-1)).toUpperCase();
        int length = str.length()-2;
        System.out.println(first+length+last);
    }


}
