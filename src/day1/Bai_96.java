package day1;

import java.util.Scanner;

public class Bai_96 {
    public static void main(String[] args){
        double x,y;
        System.out.print("Nhap x: ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        in.close();

        if(x >= 5) {
            y = 2*x*x + 5*x +9;
            System.out.println("Gia tri cua ham so la: "+ y);
        }else {
            y = (-2)*x*x + 4*x -9;
            System.out.println("Gia tri cua ham so la: "+ y);
        }
    }
}
