package gb;

import java.util.*;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
public class Task02 {
    public static void main(String[] args) {
        String str = "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";
        String[] strArray = str.replaceAll("\n", " ").split(" ");
        System.out.println(Arrays.toString(strArray));
        NavigableMap<Integer, List<String>> countOfName = new TreeMap<>();
        for (int i = 0; i < strArray.length; i = i + 2) {
            String temp = strArray[i];
            int count = 1;
            for (int j = 0; j < strArray.length; j = j + 2) {
                if (i != j) {
                    if (temp.equals(strArray[j])) {
                        count++;
                    }
                }
            }
            if (count > 1) {
                if (countOfName.containsKey(count)) {
                    countOfName.get(count).add(temp);
                } else {
                    ArrayList<String> tempArray = new ArrayList<>();
                    tempArray.add(strArray[i]);
                    countOfName.put(count, tempArray);
                }
            }
        }
        System.out.println(countOfName.descendingMap());
    }
}
