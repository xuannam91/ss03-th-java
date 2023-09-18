package ra.ss3_th03;

import java.util.Scanner;

public class Main {
    //    Tìm ước số chung lớn nhất
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a");
        int a = sc.nextInt();
        a = Math.abs(a);

        System.out.println("nhập số b");
        int b = sc.nextInt();
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("không có ước chung");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a);
            } else {

                b = b - a;
                System.out.println("b = " + b);
            }

        }
        System.out.println("UCLN "+ a );
    }
}
