package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the verbosity of a text
 */
public class VerbosityCalculator {
    public static void main(String[] args){

        //Scanner input = new Scanner(file);
        // An abstract representation of a File
        File dickensBook = new File("/Users/c4q-Allison/Desktop/accesscode/VerbosityCalculator/resources/pg98.txt");

        File melvilleBook = new File("/Users/c4q-Allison/Desktop/accesscode/VerbosityCalculator/resources/pg2701.txt");

        int totalWords = 0;
        int totalSentences = 0;

        try{
            Scanner dickensScan = new Scanner(dickensBook);



            while (dickensScan.hasNext()) {
                String word = dickensScan.next();
                //System.out.println(word);
                totalWords++;
                char c = word.charAt(word.length() - 1);
                if (c == '.' || c == '?' || c == '!') {
                    totalSentences++;
                }

            }


        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Total number of words in Dickens' \"Tale of Two Cities\": " + totalWords);
        System.out.println("Total number of sentences in his novel: " + totalSentences);

        double dickensVerbosity = totalWords / (double) totalSentences;

        System.out.println("Verbosity Quotient (total words divided by total sentences): " + new DecimalFormat("#.##").format(dickensVerbosity) + "\n");

        try{
            Scanner melvilleScan = new Scanner(melvilleBook);

            while (melvilleScan.hasNext()) {
                String word = melvilleScan.next();
                //System.out.println(word);
                totalWords++;
                char c = word.charAt(word.length() - 1);
                if (c == '.' || c == '?' || c == '!') {
                    totalSentences++;
                }

            }


        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Total number of words in Melville's \"Moby Dick\": " + totalWords);
        System.out.println("Total number of sentences in his novel: " + totalSentences);

        double melvilleVerbosity = totalWords / (double) totalSentences;

        System.out.println("Verbosity Quotient (total words divided by total sentences): " + new DecimalFormat("#.##").format(melvilleVerbosity) + "\n");
        System.out.println("Melville wins; sorry, Dickens!");



    }
}
