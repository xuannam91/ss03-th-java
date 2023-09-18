package ra.ss3_th01;

import java.util.Scanner;

public class Main {
    //    Kiểm tra số nguyên tố
    public static void main(String[] args) {
        System.out.println("Nhập một số ");
        int number = new Scanner(System.in).nextInt();
        if(number < 2){
            System.out.println(number + "không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i < number){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i ++;
            }
            if(check){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }

    }
}
