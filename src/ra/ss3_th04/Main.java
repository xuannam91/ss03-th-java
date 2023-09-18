package ra.ss3_th04;

import java.util.Scanner;

public class Main {
    //    Thiết kế menu cho ứng dụng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("menu");
            System.out.println("1. draw the triangle");
            System.out.println("2. draw the square");
            System.out.println("3. draw the ractangle");
            System.out.println("0. exit");
            System.out.println("Hãy nhập số");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. draw the triangle");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2 :
                    System.out.println("2. draw the square");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("3. draw the ractangle");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 0 :
                    System.exit( 0);
                default:
                    System.out.println("Nhập sai");


            }

        }

    }
}
