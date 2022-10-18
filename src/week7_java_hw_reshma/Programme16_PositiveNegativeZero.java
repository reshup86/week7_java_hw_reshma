//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO
package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme16_PositiveNegativeZero {
    public static void main(String[] args) {
        Programme16_PositiveNegativeZero programme16 = new Programme16_PositiveNegativeZero();
        programme16.num();
    }
    public void num(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number value: ");
        int x= s.nextInt();
        if (x>0){
            System.out.println(x +" is positive value");
        }else if (x<0){
            System.out.println(x + " is negative value");
        }else {
            System.out.println(x + " is zero value");
        }
        s.close();
    }
}
