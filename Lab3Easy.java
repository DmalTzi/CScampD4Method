import java.util.Scanner;

public class Lab3Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String newWord = subString(word, 2, 7);
        System.out.println(newWord);
        sc.close();
    }

    static String subString(String word, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += word.charAt(i);
        }

        return sub;
    }

}