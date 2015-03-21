package nyc.c4q.ac21;

import java.util.Scanner;

/**
 * Created by c4q-Allison on 3/20/15.
 */
public class APrettyTitle {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite book title here to be prettified:");
        String title = input.nextLine();
        System.out.println(Capitalize(title));
        System.out.println(PrettyTitle(title));

    }

    public static String PrettyTitle(String title) {

        String prettify = "";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) != ' ') {
                prettify += "*"; }
            else
                prettify += " ";
        }
        return prettify;

    }

    public static String Capitalize(String title) {

        String newTitle ="";

        for (int i = 0; i < title.length(); i++) {

            if (i == 0)
                newTitle = title.substring(i, i+1).toUpperCase();
            else if (title.charAt(i - 1) == ' ')
                newTitle += title.substring(i, i+1).toUpperCase();
            else
                newTitle += title.charAt(i);
        }
        return newTitle;

    }

}



