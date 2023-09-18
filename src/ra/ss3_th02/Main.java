package ra.ss3_th02;

import java.util.Scanner;

public class Main {
    //    Ứng dụng tính tiền lãi cho vay
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        double money = sc.nextDouble();
        System.out.println("nhập số tháng");
        int month = sc.nextInt();
        System.out.println("nhập số tỷ lệ lãi suất");
        double interestRate = sc.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++){
            total += money * (interestRate/100)/12 * month;
        }
        System.out.println("tổng lãi suất " + total);

    }
}
