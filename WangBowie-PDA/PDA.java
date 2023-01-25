
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        boolean shouldContinue = true;
        System.out.println("Enter 0 to quit.");
        while (shouldContinue == true) {
            shouldContinue = true; 
            System.out.println("How old are you?");
            Scanner scanner = new Scanner(System.in);
            int LOWER_BOUND = 14;
            try {
            int age;
            age = scanner.nextInt();
            if (age == 0) {
                shouldContinue = false;
            } else{
            if (age < LOWER_BOUND) {
                System.out.println(age+" is too young!!");
            } else{
                System.out.println("Do not date someone younger than " + getYoungerAge(age) + " or older than " + getOlderAge(age));
            }
        }
        }      catch (InputMismatchException error) {
            System.out.println("Please enter an integer");
            scanner.next();
        }
    }
    }
    
    public int getYoungerAge (int age) {
       int lower = 0;
        if (age % 2 == 0) {
        lower = (age/2) + 7;
        } else{
        lower = (age/2) + 8;
    }
        return lower;
    }
    
    public int getOlderAge (int age) {
        int older = 2 * (age-7);
        return older;
    }
    
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

