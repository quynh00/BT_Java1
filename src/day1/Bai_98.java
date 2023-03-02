package day1;

import java.util.Scanner;

public class Bai_98 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        System.out.println("Nhập a, b, c, d, e, f: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        e = in.nextDouble();
        f = in.nextDouble();
        in.close();

        double D = a*e - d*b;
        double Dx = c*e - f*b;
        double Dy = a*f - d*c;

        if (D == 0){
            if (Dx == Dy && Dx == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            x = Dx/D;
            y = Dy/D;
            System.out.printf("phương trình có nghiệm là x = %.2f và y = %.2f", x,y);
        }
    }
}
