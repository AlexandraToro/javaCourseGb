package gb;
//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
        String sql = "select * from students where ";
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String text0 = text.substring(2);
        String text1 = text0.replace("}", ",");
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        String text2= getArray(text1, list1, list2);
        String text3= getArray(text2, list1, list2);
        String text4= getArray(text3, list1, list2);
        String text5= getArray(text4, list1, list2);
        StringBuilder builder = new StringBuilder(sql);
        for (int i = 0; i < list1.size(); i++) {
            if (list2.get(i).equals("null")){
                continue;
            }else{
                builder.append(list1.get(i)).append(" = '").append(list2.get(i)).append("' and ");
            }
        }
        System.out.printf("\"" + builder.substring(0,builder.length()-5) + "\"");
        
    }

    public static String getArray(String text1, ArrayList<String>list1, ArrayList<String> list2) {
        int index1 = text1.indexOf("\"");
        int index2 = text1.indexOf("\",");
        list1.add(text1.substring(0,index1));
        list2.add(text1.substring(index1+3,index2));
        if (index2+4<text1.length()) {
            return text1.substring(index2+4);
        }else{
            return null;
        }
        
    }
}
