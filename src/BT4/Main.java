package BT4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String input = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(input.charAt(i)));
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("'" + input.charAt(i) + "' không phải số nguyên");
                list.add(0);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
