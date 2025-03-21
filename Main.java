//import scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create scanner object
        Scanner myObj = new Scanner(System.in);

        //print starting message
      System.out.println("Interest Calculator Program");

      //ask user for principal amount of loan
      System.out.println("What is the principal amount of the loan in dollars?");
        //get user input for principal amount
        double principal = myObj.nextDouble();

        //ask user for interest rate
        System.out.println("What is the interest rate? (Input 0.05 for 5%)");
        //get user input for interest rate
        double rate = myObj.nextDouble();

        //ask user for the period of the loan
        System.out.println("What is the period of the loan in years?");
        //get user input for the period of the loan
        int period = myObj.nextInt();

        //calculate interest
        double interest = principal * rate * period;

        //display the interest
        System.out.println("The total interest of the loan is " + interest + " dollars.");
    }
  }