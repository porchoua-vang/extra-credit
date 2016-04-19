import java.util.Scanner;

/**
 * Created by ocf5 on 4/14/2016.
 */
import java.util.*;
public class SentenceCapitalizer {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your sentence.");
        String s = ob.nextLine();
        System.out.println("The new String with capital letters is: " + "\n" + toCapitalize(s));

    }


    public static String toCapitalize(String b) {
        System.out.println("hello");
        int i;
        StringBuilder a = new StringBuilder(b);

        if(a.length() > 0){
            a.setCharAt(0, Character.toUpperCase(a.charAt(0)));
        }

        i = a.indexOf(" ");

        while (i != -1){
            i++;

            a.setCharAt(i, Character.toUpperCase(a.charAt(i)));

            i = a.indexOf(" ", i);
        }
                return a.toString();



    }

}