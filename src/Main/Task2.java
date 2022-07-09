package Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        int j = 0;
        String[] inputArray2 = new String[1];
        String patern2 = "a.@gmail.com adf xxxx d.@gmail.co";
        Pattern patternEmail = Pattern.compile("@gmail.com$");
        String[] PaternArray = new String[4];
        PaternArray = patern2.split(" ");
        for (String s : PaternArray
        ) {

            Matcher matcher = patternEmail.matcher(s);
            if (matcher.find()) {
                inputArray2[j] = s;
                j++;
            }
        }
        for (String m : inputArray2
        ) {
            System.out.println(m);

        }
    }
}
