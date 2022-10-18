/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
*/
package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme2_Leapyear {
    public static void main(String[] args) {
        Programme2_Leapyear programme2 = new Programme2_Leapyear();
        programme2.year();
    }
    public void year() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int x = s.nextInt();
        if (x % 4 == 0) {
            System.out.println(x + " is leap year");
        } else {
            System.out.println(x + " is not leap year");
        }
        s.close();
    }
}
