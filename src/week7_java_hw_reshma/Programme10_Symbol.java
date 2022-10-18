/*
Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
*/

package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme10_Symbol {
    public static void main(String[] args) {
    Programme10_Symbol programme10 = new Programme10_Symbol();
    programme10.symbol();
    }
    public void symbol(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a1 = s.nextInt();
        System.out.print("\nEnter second number: ");
        int a2 = s.nextInt();
        System.out.print("\nEnter symbol (+,-,*,/): ");
        char c = s.next().charAt(0);

        if (c =='+'){
            System.out.println("\nAddition: " +(a1+a2));
        }else if (c =='-'){
            System.out.println("\nSubtraction: "+(a1-a2));
        }else if (c=='*'){
            System.out.println("\nMultiplication: "+(a1*a2));
        }else if (c=='/'){
            System.out.println("\nDivision: "+ (a1/a2));
        }else {
            System.out.println("Invalid data");
        }
    s.close();
    }
}
