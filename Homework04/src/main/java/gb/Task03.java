package gb;
//***** Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
//      x ^ y / (5 * z) + 10
//      Вычислить запись если это возможно.

import java.util.Arrays;
import java.util.LinkedList;

public class Task03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> stack = new LinkedList<>();
        String str = "x ^ y / ( 5 * z ) + 10";
        String alphNum = "xyz510";
        String signs = "^*/+";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (alphNum.contains(arr[i])) {
               if (stack.isEmpty()) {
                    list.add(arr[i]);
               } else {
                    list.add(arr[i]);
                 list.add(stack.pop());}
            }
            if (arr[i].equalsIgnoreCase("(")) {
                ++i;
                while (!arr[i].equalsIgnoreCase(")")) {
                    if (alphNum.contains(arr[i])) {
                        list.add(arr[i]);
                    }
                    if (signs.contains(arr[i])) {
                        stack.push(arr[i]);}
                    ++i;
                    System.out.println(i);
                }
                }
                if(!stack.isEmpty()){
                    list.add(stack.pop());
                }
            if (signs.contains(arr[i])) {
                stack.add(arr[i]);
                System.out.println(stack + "stack");}
        }
        System.out.println(list);
    }
}
