import java.util.Arrays;
public class LabQ1 {
    //  โจทย์:
    //      ให้เต็มคำที่ขาดหายไปให้ถูกต้อง และสามารถรันได้
    //      สามารถเขียนทับได้เลย 
    //          เช่น /*q1*/ สามารถเขียนทับเป็น static ได้เลย
    //      โจทย์เริ่มบรรทัดที่ 51
    //      โดยใน main เป็นเพียงโค้ดเพื่อไว้ใช้รันทดสอบเท่านั้น
    public static void main(String[] args) {
        /*q1-q2*/
        System.out.println("q1-q2");
        int pow = power(3,3);
        System.out.println(pow);
        // output: 27
        System.out.println("===============");

        /*q3-q4*/
        System.out.println("q3-q4");
        String myName = addLabel("Qwan");
        System.out.println(myName);
        // output: Qwanlnwza
        System.out.println("===============");

        /*q5-q6*/
        System.out.println("q5-q6");
        String word = "Hello";
        if (contain(word, "e")){
            System.out.println("e in " + word);
        }else {
            System.out.println("e not in " + word);
        }
        // output: > e in Hello
        System.out.println("===============");

        /*q7-q8*/
        System.out.println("q7-q8");
        int[] arr = {2,3,5,9,1,0,-2,9};
        int maxVal = maxValue(arr);
        System.out.println(maxVal);
        // output: 9
        System.out.println("===============");

        System.out.println("q9-q10");
        int[] nums = {2,3,1, 3, 5, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        // output : [1, 2, 3, 3, 4, 5]
        System.out.println("===============");
    }
    
    /*q1*/ int power(int a, int b) {
        /*q2*/ pow = 1;
        for (int i = 0; i < b; i++) {
            pow = pow * a;
        }
        return pow;
    }

    static /*q3*/ addLabel(String name) {
        String newName = name + "lnwza";
        return /*q4*/;
    }
    
    static boolean contain(/*q5*/ word, String c) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c.charAt(0)) {
                return true;
            }
        }
        /*q6*/ false;
    }

    static int maxValue(/*q7*/ arr) {
        /*q8*/ max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static /*q9*/ sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int /*q10*/ = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}