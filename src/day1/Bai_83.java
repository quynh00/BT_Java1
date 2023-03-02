package day1;
import java.util.Scanner;
//Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng dấu hay không
public class Bai_83 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("nhập x, y: ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        in.close();

        if (x*y > 0){
            System.out.println("cùng dấu" );
        }else System.out.println("khác dấu" );
    }
}
