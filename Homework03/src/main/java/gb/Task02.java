package gb;
// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка
// Учитывая,что задача найти из заданнного списка, а не написать функцию для постоянного использования,
// минимальное и максимальное значений можно найти за один цикл.

import java.util.ArrayList;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random rnd =new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
        }
        System.out.println("Сгенерированный список: "+list);
        int minNum = list.get(0);
        int maxNum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)<minNum){
                minNum = list.get(i);
            }
            if (list.get(i)>maxNum){
                maxNum = list.get(i);
            }
        }
        int sumNum = 0;
        for (int num:list) {
            sumNum+=num;
        }
        int average=sumNum/list.size();
        System.out.printf("Минимальное значение равно %s, максимальное значение равно %s, среднее арифметическое значение равно %s.", minNum, maxNum, average);
    }
}
