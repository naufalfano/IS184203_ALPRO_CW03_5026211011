import java.util.Scanner;

public class ProcessAName5026211011 {
    
    public static void main(String[] args) {
        
        System.out.println("----------------------");
            Scanner nameScanner = new Scanner(System.in);
            System.out.println("Type your name: ");
            String nameInput = nameScanner.nextLine();
        
            int replacedSpace = nameInput.indexOf(" ");
            System.out.println(replacedSpace);
            
            String firstName = nameInput.substring(replacedSpace);
            String firstChar = nameInput.substring(0,1);
            System.out.println("Your name is: " + firstName + ", " + firstChar + ".");
        System.out.println("----------------------");
        
    }
    
}