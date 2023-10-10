package BT3;

public class Main {
    public static void main(String[] args) {
        Object[] arr = { 1, "hđâs", 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i].toString());
                sum += num;
            } catch (Exception e) {
                System.out.println( "'" + arr[i] + "' không phải số nguyên. Bỏ qua phần tử này");
            }
        }
        System.out.println("Tổng các số nguyên trong mảng là: " + sum);
    }
}
