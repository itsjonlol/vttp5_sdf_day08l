package project02pm;

import java.io.Console;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Construct mastermind game
        //1. - use random function to generate 4 digit number between 1111 and 6666
        ///a. 4 RNG to generate each digit (1-6)
        //2. use console to prompt for 4 digit input
        ///a. this should be inside a while loop
        //3. chek for invalid input ( input that it is not between 1111 and 6666)
        ///4. check the digit at each index using atChar (index)
        ////a. check the digit at each index using atChar(index) match poistion % number.
        ////    i. incremeet cp by one if match number ^ position
        // b. 
        //  i. if point a fullfills, no nee dto perform this point b
        /// ii. loop throguh to check if there are matching number.
        //      1. increment C if number matches but position doesnt match
        //5. repeat 4 until solution matches
        //  a. allow up to 12 tries
        //6 - display whether you win or lose
        //7. repeat the game

        
        int min = 1;
        int max = 6;
        
        int maxDigits = 4;
        String randomNo = generateFourRandomDigits(min, max, maxDigits);
        //System.out.println(generateFourRandomDigits(min, max, maxDigits));

        Console console = System.console();
        int cp = 0;
        int c = 0;
        int attemptCounter = 1; // maximum 12 attempts
        while (attemptCounter<3) {
            String input = console.readLine("Attempt: " + attemptCounter + ". Enter a number between 1111 and 6666. Only use digits 1 to 6.\n");
            
            if (!input.matches("[1-6]{4}")) {
                System.out.println("Please enter 4 digit from 1 to 6");
                continue;

            } else {
                for (int i = 0; i<input.length(); i++) {
                    char characterInput = input.charAt(i);
                    for (int j = 0; j<randomNo.length(); j++) {
                        char characterSystem = randomNo.charAt(j);
                        if (characterInput == characterSystem) {
                            cp++;
                        } 
                    }
                    
                }
            }
            
            attemptCounter++;
        }

        
    }

    public static String generateFourRandomDigits(int min, int max,int maxDigits) {

        int digit;
        String randomNo = "";
        Random random = new Random();
        for (int i = 0; i<maxDigits; i++) {
            digit = random.nextInt(max - min + 1) + min;
            randomNo += String.valueOf(digit);
        }

        return randomNo;


    }
}
