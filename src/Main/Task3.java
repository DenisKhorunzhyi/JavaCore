package Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String str = ("I love Java more than my friend. Java is so beautiful.");
       if(str.contains("Java")){
            System.out.println("Str contains Java");}
        str = str.replace("Java","C#");
        System.out.println(str);

    }
}
