import java.util.Scanner;

public class Lab3Medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        String cntValue = duplicateValue(arr);

        System.out.println("result " + cntValue);
        sc.close();
    }

static String duplicateValue(int[] arr) {
    String result = "";
    int cntDuplicatte = 0;
    for (int i = 0; i < arr.length-1; i++) {
        if (arr[i] == arr[i+1]) {
            result += arr[i] + " ";
            cntDuplicatte++;
            i++;
        }
    }
    if (cntDuplicatte == 0) {
        return "-1";
    }
    return result;
}
}
