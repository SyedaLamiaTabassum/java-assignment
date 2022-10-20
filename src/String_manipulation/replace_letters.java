package String_manipulation;

public class replace_letters {
    public static void main(String[] args) {
        String str = "Ratul and Rahim lives in Rangpur";
        String word[] = str.split(" ");
        String newWord = str.split(" ")[2].replace('R','F');
        String newString = str.replace("Rahim",newWord);
        System.out.println(newString);
    }
}
