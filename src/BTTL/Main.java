package BTTL;

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
                System.out.println("Nhập số thứ nhất: ");
                n1 = scanner.nextInt();
                System.out.println("Nhập số thứ hai: ");
                n2 = scanner.nextInt();
                if (n2 == 0) {
                    throw new ArithmeticException("Lỗi: n2 phải khác 0");
                }
                checkNumber = true;
            } catch (InputMismatchException ime) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên");
                scanner.next();
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
        }
        int tong = n1 + n2;
        int hieu = n1 - n2;
        int tich = n1 * n2;
        double thuong = (double) n1 / n2;
        System.out.println("Tổng hiệu tích thương lần lượt của hai số là: " + tong + ", " + hieu + ", " + tich + ", " + thuong);
    }
}
