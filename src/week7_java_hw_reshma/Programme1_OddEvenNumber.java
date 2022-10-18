/*
Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
*/
package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme1_OddEvenNumber {
    public static void main(String[] args) {
        Programme1_OddEvenNumber programme1 = new Programme1_OddEvenNumber();
        programme1.num();
    }
    public void num() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number value: ");
        int x = s.nextInt();
        String y = (x %2 ==0) ? "even":"odd";
        System.out.println(x+ " is " + y + " number");
        s.close();
    }
}
