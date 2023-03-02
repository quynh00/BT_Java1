package day1;

import java.util.Scanner;
//Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết đó là tam giác gì?
public class Bai_97 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();

        if (a < 0 || b < 0 || c < 0 || (a + b < c) || (a + c < b) || (c + a < b)){
            System.out.println("Đây không phải tam giác");
        }else {
            if (a == b && b == c){
                System.out.println("Tam giác đều");
            }else if ( (a == b && a != c) || (a == c && a !=b) || (b == c && b != a)){
                System.out.println("Tam giác cân");
            }else if ( (a * a + b * b == c * c) || (a * c + c * c == b * b) || (b * b + c * c == a * a)){
                System.out.println("Tam giác vuông");
            }else{
                System.out.println("Tam giác thường");
            }
        }
    }
}
