package BT2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
       try{
           int max = list.get(0);
           for (int i = 0; i < list.size(); i++) {
               if(list.get(i) > max){
                   max = list.get(i);
               }
           }
           System.out.println("Giá trị lớn nhất của dãy là: " + max);
       } catch (IndexOutOfBoundsException e){
           System.out.println("Mảng rỗng");
       }
    }
}
