package project02pm;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetCollection {
    public static void main(String[] args) {

        //static String shuffle(String text){
        // if (text.length()<=1)
        // return text;

        // int split=text.length()/2;

        // String temp1=shuffle(text.substring(0,split));
        // String temp2=shuffle(text.substring(split));

        // if (Math.random() > 0.5) 
        //     return temp1 + temp2;
        // else 
        //     return temp2 + temp1;
        // }    
        Console console = System.console();

        String keyboardInput = "";
        
        
        while (keyboardInput.toUpperCase().length() !=4) {
            keyboardInput = console.readLine("Please enter 4 alphabets\n");
            
        }
        System.out.println("Your input is " + keyboardInput.toUpperCase());
        char[] chArray = keyboardInput.toCharArray();
        List<String> resultList = new ArrayList<>();

        ///ABC
        ///A : ABC, ACB
        ///B : BAC, BCA
        ///C: CAB, CBA

        ///ABCD
        ///A: ABCD, ABDC, ACBD, ACDB, ADBC, ADCB
        ///B: BACD, BADC, BCAD, BCDA, BDAC, BDCA
        ///C: CABD. CADB. CBAD, CBDA, CDAB, CDBA
        ///D: DABC, DACB, DBAC, DBCA, DCAB, DCBA
        permutate(chArray,0,resultList);
        for (String item : resultList) {
            System.out.println(item);
        }
        System.out.println(resultList.size());
        HashSet<String> resultSet = new HashSet<>(resultList);

        System.out.println(resultSet.size());


    }
    
   


    private static void permutate(char[] arr, int index, List<String> result) {
        if (index == arr.length - 1) {
            result.add(new String(arr));  // Base case: add permutation to the list
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            swap(arr, index, i);  // Swap characters at `index` and `i`
            permutate(arr, index + 1, result);  // Recursive call
            swap(arr, index, i);  // Backtrack by swapping back
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // public class Fibonacci {
    //     public static void main(String[] args) {
    //         int n = 6; // Example input
    //         int result = fibonacci(n);
    //         System.out.println("Fibonacci number F(" + n + ") is: " + result);
    //     }
    
    //     public static int fibonacci(int n) {
    //         if (n == 0) { // Base case
    //             return 0;
    //         }
    //         if (n == 1) { // Base case
    //             return 1;
    //         }
    //         return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    //     }
    // }
    // public class Factorial {
    //     public static void main(String[] args) {
    //         int number = 5; // Example input
    //         int result = factorial(number);
    //         System.out.println("Factorial of " + number + " is: " + result);
    //     }
    
    //     public static int factorial(int n) {
    //         if (n == 0) { // Base case
    //             return 1;
    //         }
    //         return n * factorial(n - 1); // Recursive case
    //     }
    // }
}
