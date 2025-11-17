/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
BEGIN 
->PRINT "This is a console-based calculator"
->PRINT "Enter first number:"
->ENTER num1
->PRINT "First Number = " + num1

->PRINT "Operator: (+, -, *, /)"
->ENTER Operator

->PRINT "Enter Your second number:"
->ENTER num2
->PRINT "Second number = " + num2

result
->switch(operator)
    case '+'
    addition = +

    case '-'
    subtraction = - 

    case '*'
    product = *

    case '/'
    division = /

    default
--->PRINT "Operation Unknown"

->if 
    
    




*/
package com.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Obakeng Phale
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("** Simple calculator **");
        
        //User Prompts
        System.out.print("Enter expression."
                + "Here are supportedoperators(+, -, *, /): ");
        String userInput = input.nextLine(); 
        //test
        //System.out.print("Expression:" + userInput);
        
        //Find the operator in string.
        char operator = userInput.charAt(1);
        
        //test
        //System.out.println("\nThe Operator is: " + operator);
        
         //Find the numbers in string and Convert into integer.
         double num1 = Integer.parseInt(userInput.substring(0,1));
         double num2 = Double.parseDouble(userInput.substring(2));
         
         //test
         /*System.out.println("1st number = " + num1 );
         System.out.println("2nd number = " + num2 );*/

            
        switch(operator){
         
            case '+':
                double addition = num1 + num2;
                System.out.println(num1 + " + " + num2 + "=" + addition);
                break;
         
            case '-':
                 double subtraction = num1 - num2;
                 System.out.print(num1 + " - " + num2 + " = " + subtraction);
                 break;
         
            case '*':
                double product = num1 * num1;
                System.out.print(num1 + " * " + num2 + " = " + product);
                break;
         
            case '/':
                if(num2 == 0)
                   System.out.println("undefined");
                else{
                    double quotient = num1 / num2;
                    System.out.print(num1 + " / " + num2 + " = " + quotient);
                }
                break;
         
            default:
                System.out.println("Operation unknown");
             
        }

    input.close();
    }
}
