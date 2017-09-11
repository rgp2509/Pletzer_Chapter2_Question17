import java.util.Scanner;
public class Pletzer_2_17 {
    static double temp, wind;
    public static void main(String[] args) {
        /* Main that calls two methods, showing good discipline for when methods need to be kept private.
         */
        WelcomePrompt();
        System.out.println("The wind chill index is: " + Calculator(temp,wind));
    }

    public static void WelcomePrompt (){
        /* A welcome prompt to tidy things up and keep it out of main, utilizing global "double" variables.
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the wind chill calculator");
        System.out.println("I will calculate the the windchill outside. With temperatures between -58 F and");
        System.out.println("41 F with a wind index >= 2 Miles per hour");
        System.out.println("Please enter a Temperature between -58 and 41 F: Ex. 5.3");
        temp = input.nextDouble();
        System.out.println("please enter a wind index >= 2 Miles per hour now: ex \"6.0\"");
        wind = input.nextDouble();
    }
    public static double Calculator(double temp, double wind){
        /*
         a simple calculator that calls on the inputs to give a output.
         */
        double newTemp;
        newTemp = 35.74 + (0.6215*temp) - (35.75*(Math.pow(wind,0.16))) + (0.4275*temp*(Math.pow(wind,0.16)));
        return newTemp;

    }
}
