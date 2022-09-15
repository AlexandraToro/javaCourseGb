package gb;

import java.io.File;

public class Task01 {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\Otomi\\Desktop\\Learning\\Programming\\courseJava\\Homework\\Homework02");
        System.out.println(path);
        String[] arr = path.list();
        int count = 1;
        for (String file : arr) {
            int lastIndex = file.lastIndexOf('.');
            String res = lastIndex == -1 ? "" : file.substring(lastIndex+1);
            System.out.printf(count+". Расширение: " + res +"\n");
            count++;
        }
    }
}
