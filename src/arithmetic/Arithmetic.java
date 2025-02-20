/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
import java.util.Scanner;

/** This class performs arithmetic operations based on user input
 * @author sivagamasrinivasan
 */
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n = in.nextDouble();
        System.out.print("Enter second number: ");
        double m = in.nextDouble();
        in.nextLine(); 

        System.out.println("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.nextLine().toUpperCase(); 

        try {
        
            Operation operation = Operation.valueOf(operationInput);
            double result = r.calculate(n, m, operation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please enter one of: PLUS, MINUS, TIMES, DIVIDE.");
        }
    }
}
