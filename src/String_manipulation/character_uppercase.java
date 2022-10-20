package String_manipulation;

public class character_uppercase {
    public static void main(String[] args) {
        String str = "rahim lives in sylhet";
        String word[] = str.split(" ");
        String firstLetter = "";
        String restLetters="";
        for (int i = 0; i < word.length; i++) {
            firstLetter=String.valueOf(word[i].charAt(0)).toUpperCase();
            restLetters = word[i].substring(1);
            System.out.print(firstLetter+restLetters+" ");
        }

    }
}
