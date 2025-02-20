/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


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
public class Arithmetic 
{
    public static void main(String[] args) 
    {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int n = in.nextInt();
        System.out.print("Enter second number: ");
        int m = in.nextInt();
        in.nextLine(); 

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = in.nextLine(); 

       
        double result = 0;
        switch (operation) {
            case "+":
                result = n + m;
                break;
            case "-":
                result = n - m;
                break;
            case "*":
                result = n * m;
                break;
            case "/":
                if (m != 0) {
                    result = (double) n / m;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);
    }
}


