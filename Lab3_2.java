public class Lab3_2 {
    public static void main(String[] args) {
        /* q1 */
        System.out.println("=== q1 ===");
        printMessage("Hello World Method");

        /* q2 */
        System.out.println("=== q2 ===");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 5};
        boolean isEqual = checkTwoArrayIsEqual(arr1, arr2);
        System.out.println(isEqual);
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3, 3};
        isEqual = checkTwoArrayIsEqual(arr3, arr4);
        System.out.println(isEqual);
        int[] arr5 = {1, 2, 3, 4};
        int[] arr6 = {1, 2, 3, 4};
        isEqual = checkTwoArrayIsEqual(arr5, arr6);
        System.out.println(isEqual);

        /* q3 */
        System.out.println("=== q3 ===");
        int[] arr = {3, 9, 1, 5, 10, 9, 9};
        int indexMaxVal = maxPosition(arr);
        System.out.println("indexMaxVal: " + indexMaxVal);

    }

    static void printMessage(String message) {
        /*  อธิบาย:
         *  ต้องการพิมพ์ข้อความออกมาที่ถูกส่งเข้ามา 
         *  pseudocode: 
         *  print message
         */
        /* Start Your Code At Here */
        System.out.println(message);
    }

    static boolean checkTwoArrayIsEqual(int[] arr1, int[] arr2) {
        /*  อธิบาย
         *  รับค่า array สองตัว ชื่อ arr1 arr2
         *  ทำการเช็คว่า array สองตัวนี้เท่ากันหรือไม่ทั้งขนาดและตำแหน่ง
         *  1. เช็คขนาด หากขนาดไม่เท่ากัน แสดงว่า arr1 และ arr2 ไม่เท่ากัน
         *  2. เช็คตำแหน่ง ว่าแต่ละตำแหน่งเท่ากันไหม หากมีตำแหน่งใดตำแหน่งหนึ่งไม่เท่ากัน แสดงว่า arr1 และ arr2 ไม่เท่ากัน
         *  3. เมื่อเช็คเงื่อนไขแล้ว ไม่พบตามข้างต้น จะถือว่า arr1 และ arr2 เท่ากันทั้งหมด 
         *  หมายเหตุ หากใช้ .length หลังตัวแปร array
         * 
         *  pseudocode:
         *  if len of arr1 not equal len of arr2 return false
         *  for loop in arr1
         *      if arr1 i-th not equal arr i-th return false
         *  if it not in above case just return true
        */
        /* Start Your Code At Here */
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    static int maxPosition(int[] arr) {
        /*  อธิบาย
         *  ต้องการหาตำแหน่งที่มีค่ามากที่สุดใน array ตำแหน่งที่หมายถึงคือ index ของ array
         *  max เก็บค่าตัวแรกของ arr เอาไว้ในตอนเริ่ม หาก arr นั้นมีแค่หนึ่งตัว เราก็จะได้ค่า max
         *  indexMax คือตัวแปรที่จะเก็บตำแหน่งของค่าที่มากที่สุดเอาไว้
         *  ทำการเช็คทุกตัวใน array 
         *  หากพบว่าค่าที่กำลังเช็คอยู่ มีค่ามากกว่า max ให้ทำการอัพเดทค่า max เป็นค่าที่กำลังเช็คอยู่ และ ทำการจำตำแหน่งเอาไว้
         *  pseudocode:
         *  create max value for keep first value of index and keep max value as int
         *  create indexMax value for keep max index as int
         *  for loop in arr
         *      if arr i-th greater t-han max
         *          max keep value of arr i-th
         *          indexMax keep value of i-th
         *  return indexMax
         */
        /* Start Your Code At Here */
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}

// 1 2 3 3