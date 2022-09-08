package gb;
//2. Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
// Если общего префикса нет, то возвращать пустую строку.
// Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

public class Task02 {
    public static void main(String[] args) {
        String[] arr={"aabbxxx", "aaaaabbb", "aaabb"};
        int count = 0;
        boolean flag = false;
        int minLenght = arr[0].length();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i].length() < minLenght) {
                minLenght = arr[i].length();
            }
        }
        for (int i = 0; i < minLenght; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                flag = arr[j].charAt(i) == arr[j + 1].charAt(i);
            }
            if (flag) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("");
        } else {
            System.out.println(arr[0].substring(0, count));
        }
    }
}
