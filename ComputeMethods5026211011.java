import java.lang.Math;
import java.util.Random;


public class ComputeMethods5026211011 {

    public double fToC (double degreesF){
        double degreesCelcius = (degreesF - 32)*5/9;
        return degreesCelcius;
    }
    
    public double hypotenuse (int a, int b){
        double parsedA = a;
        double parsedB = b;
        double hypotenuseCalc = Math.sqrt(Math.pow(parsedA, 2) + Math.pow(parsedB, 2));
        return hypotenuseCalc;
    }
    
    public int roll () {
        Random randomDice1 = new Random();
        int randomNumdice1 = randomDice1.nextInt(6) + 1;
        Random randomDice2 = new Random();
        int randomNumdice2 = randomDice2.nextInt(6) + 1;
        int diceTotal = randomNumdice1 + randomNumdice2;
        return diceTotal;
    }
}