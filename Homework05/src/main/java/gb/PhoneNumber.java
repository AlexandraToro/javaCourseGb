package gb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

public class PhoneNumber {
    private static Map<Integer,String> id = new HashMap<>(100);
    private static Map<Integer, List<Integer>> phone = new HashMap<>(100);
    private static int count;
    public static void addNewNumber(String name, Integer phoneNumber){
        boolean flag = false;
        if (id.isEmpty()){
            count = 0;
            id.put(count,name);
            phone.put(count, new ArrayList<Integer>());
            phone.get(count).add(phoneNumber);
        }
        else{
            for (var item: id.entrySet()) {
                if(item.getValue().equals(name)){
                    phone.get(item.getKey()).add(phoneNumber);
                    count--;
                    break;
                }
                else{
                    flag= true;
                    phone.put(count, new ArrayList<Integer>());
                    phone.get(count).add(phoneNumber);
                }
            }
            if (flag){id.put(count,name);}
            }
            count++;
    }

    public static void printNumberOfName(String name) {
        for (var item : id.entrySet()) {
            if (item.getValue().equals(name)) {
                System.out.println("Номер(а) телефона " + name + ": " + phone.get(item.getKey()));
                return;
            }
        }
        System.out.printf("Контакта с именем %s не обнаружено %n", name);
    }

    public static void deleteContacts(String name){
        for (var item:id.entrySet()) {
            if(item.getValue().equals(name)){
                id.remove(item.getKey());
                phone.remove(item.getKey());
                System.out.printf("Контакт %s удален %n", name);
            }
        }
    }

    public static void main(String[] args) {
        addNewNumber("Alex", 125478);
        addNewNumber("Nick", 584364);
        addNewNumber("Egor", 584498);
        addNewNumber("Fillip", 580008);
        addNewNumber("Alex", 156408);
        printNumberOfName("Alex");
        printNumberOfName("Fillip");
        printNumberOfName("Alexa");
        deleteContacts("Fillip");
        printNumberOfName("Fillip");
    }
}
