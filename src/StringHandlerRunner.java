import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by RdDvls on 12/14/16.
 */
public class StringHandlerRunner {
    public static void main(String[] args) {
//        stringReverser();
        stateIndicator();
    }

    public static void stringReverser() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String userString = inputScanner.nextLine();
        int charCount = userString.toCharArray().length;
        String[] reversedString = new String[charCount];
        int index = 0;
        while (charCount != 0) {
            reversedString[charCount - 1] = userString.substring(index, (index + 1));
            index = index + 1;
            charCount--;
        }
        for (int counter = 0; counter <= (reversedString.length - 1); counter++) {
            System.out.print(reversedString[counter]);
        }
    }

    public static void stateIndicator() {

            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Please enter a string: \n\tIf there are multiple words in string, separate them with a space");
            String userString = inputScanner.nextLine();
            String[] splitString = userString.split(" ");
        while (true) {
//
            System.out.print("\nIs ");
            for (int counter = 0; counter < (splitString.length); counter++) {
                System.out.print(splitString[counter].toLowerCase());
            }
            System.out.println(" a variable, method, or class?\nEnter \"exit\" to exit");
            String userChoice = inputScanner.nextLine();
            if (userChoice.equalsIgnoreCase("variable")) {
                System.out.print("Variable: " + splitString[0].toLowerCase());
                for (int index = 1; index < splitString.length; index++) {
                    System.out.print(splitString[index].substring(0, 1).toUpperCase() + splitString[index].substring(1));
                }
                System.out.println("");
            } else if (userChoice.equalsIgnoreCase("method")) {
                System.out.print("Method: " + splitString[0].toLowerCase());
                for (int index = 1; index < splitString.length; index++) {
                    System.out.print(splitString[index].substring(0, 1).toUpperCase() + splitString[index].substring(1));
                }
                System.out.println("()\n");
            } else if (userChoice.equalsIgnoreCase("class")) {
                System.out.print("Class: " + splitString[0].substring(0,1).toUpperCase());
                System.out.print(splitString[0].substring(1));
                for (int index = 1; index < splitString.length; index++) {
                    System.out.print(splitString[index].substring(0, 1).toUpperCase() + splitString[index].substring(1));
                }
                System.out.print("{}\n");
            }else if (userChoice.equalsIgnoreCase("exit")){
                break;
            }

        }
    }
}