package BT1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkNumber = false;
        int n1 = 0;
        int n2 = 0;
        while (!checkNumber) {
            try {
                System.out.print("Nhập số thứ nhất: ");
                n1 = scanner.nextInt();
                System.out.print("Nhập số thứ hai: ");
                n2 = scanner.nextInt();
                checkNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên");
                scanner.nextLine();
            }
        }
        int sum = n1 + n2;
        System.out.println("Tổng của hai số là: " + sum);
    }
}
