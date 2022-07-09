package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        String[] inputArray = new String[2];
        String patern1 = "Hello world abs amazonka";
        Pattern pattern = Pattern.compile("^a");
        String[] paternArray = new String[4];
        paternArray = patern1.split(" ");
        for (String s : paternArray
        ) {

            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                inputArray[i] = s;
                i++;
            }
        }
        for (String m : inputArray
        ) {
            System.out.println(m);

        }


    }
}
