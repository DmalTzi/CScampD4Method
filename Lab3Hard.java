import java.util.Scanner;

public class Lab3Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println(isSubString(word, sub));
        sc.close();
    }

static boolean isSubString(String word, String sub){
    String tempSub = "";
    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == sub.charAt(0)) {
            for (int j = i; j < i+sub.length(); j++) {
                tempSub += word.charAt(j);
            }

            if(tempSub.equals(sub)) {
                return true;
            }
        }
    }
    return false;
}
}
