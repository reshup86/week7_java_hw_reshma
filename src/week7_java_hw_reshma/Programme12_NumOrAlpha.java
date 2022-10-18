//Write a program that tells us input value is number or an alphabet or symbol
package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme12_NumOrAlpha {
    public static void main(String[] args) {
        abc();
    }
    public static void abc() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any single number or alphabet: ");
        char x = s.nextLine().charAt(0);

        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            System.out.println(x + " is alphabet.");
        } else if (x >= '0' && x <= '9') {
            System.out.println(x + " is number.");
        } else {
            System.out.println("Invalid data");
        }
        s.close();
    }
}
