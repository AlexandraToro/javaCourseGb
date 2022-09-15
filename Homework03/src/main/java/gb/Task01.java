package gb;
//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random rnd =new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
        }
        System.out.println("Сгенерированный список: "+list);
        int i = 0;
        while (i<list.size()){
            if ((list.get(i)%2)==0){
                list.remove(list.get(i));}
            else{
                i++;
            }
        }
        System.out.println("Список без четных чисел: "+list);
    }
}
