import java.util.Scanner;

public class LabQ3Easy {
    /*  โจทย์
     *  เขียน method subString
     *  โดยที่ sub string เริ่มตั้งแต่ index ที่ n จนถึงก่อน index ที่ m
     *  และเมื่อหาเสร็จแล้วให้ทำการ reutrn ออกมา
     *  ข้อมูลนำเข้า:
     *      บรรทัดแรกรับข้อความชื่อว่า word 
     *      บรรทัดสองรับตัวเลข n เข้ามา หมายถึงจุดเริ่มต้นของ sub string : 1 <= n < ความยาวของ word
     *      บรรทัดสามรับตัวเลข m เข้ามา หมายถึงจุดสิ้นสุดของ sub string : n < m <= ความยาวของ word
     *  ข้อมูลส่งออก:
     *      ข้อความของ sub string
     * 
     *  ตัวอย่าง:
     *      ข้อมูลนำเข้า:
     *          KMITL
     *          1
     *          4
     *      ข้อมูลส่งออก
     *          MIT
     *      อธิบาย:
     *          ให้แสดง sub string ตั้งแต่ index ที่ 1 โดย M อยู่ในตำแหน่ง index ที่ 1 และ 
     *          จนถึง index ที่ก่อน 4 นั้นก็คือ T
     *  ตัวอย่าง:
     *      ข้อมูลนำเข้า:
     *          CScamp17
     *          ไม่ใช่ 3 แต่ เป็น 2
     *          6
     *      ข้อมูลส่งออก:
     *          camp
     *      อธิบาย:
     *          index ที่ ไม่ใช่ 3 แต่ เป็น 2 ของ word คือ c และ index ที่ก่อน 6 คือ p
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String newWord = subString(word, n, m);
        System.out.println(newWord);
        sc.close();
    }

    static String subString(String word, int n, int m) {
        // Start code at here
    }
}