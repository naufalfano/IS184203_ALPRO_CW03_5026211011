import java.util.Scanner;

public class TestClass5026211011 {
    public static void main(String[] args){
        ComputeMethods5026211011 calcClass = new ComputeMethods5026211011();
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("-------------------");
        System.out.println("Enter fahrenheit degrees: ");
        double degreesInput = inputScanner.nextDouble();
        double degreesCalc = calcClass.fToC(degreesInput);
        System.out.println("Temp in celcius is: " + degreesCalc);
        
        System.out.println("-------------------");
        System.out.println("Enter leg1: ");
        int inputLeg1 = inputScanner.nextInt();
        System.out.println("Enter leg2: ");
        int inputLeg2 = inputScanner.nextInt();
        double hypotenuseCalc = calcClass.hypotenuse(inputLeg1, inputLeg2);
        System.out.println("Hypotenuse is: " + hypotenuseCalc);
        
        System.out.println("-------------------");
        int diceRoll = calcClass.roll();
        System.out.println("The sum of dice values is: " + diceRoll);
                
        
        
    }
}