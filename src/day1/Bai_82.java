package day1;
import java.util.Scanner;

//        Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.
public class Bai_82 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập a, b, c: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        in.close();

         float max = a;
         if (b > max){
             max = b;
         }if (c > max){
             max = c;
        }
         System.out.println(max);
    }
}
