/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
*/
/*
 */

package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme3_Marksheet {
    public static void main(String[] args) {
    Programme3_Marksheet programme3= new Programme3_Marksheet();
    programme3.markSheet();
    }
    public void markSheet(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = s.nextLine();
        System.out.print("\nEnter roll number: ");
        int rno= s.nextInt();
        System.out.print("\nEnter marks in Maths: ");
        int m=s.nextInt();
        if (m<0 || m>100){
            System.out.println("Invalid Input");
        }
        System.out.print("\nEnter marks in Science: ");
        int sc=s.nextInt();
        if (sc<0 && sc>100){
            System.out.println("Invalid Input");
        }
        System.out.print("\nEnter marks in English: ");
        int eng=s.nextInt();
        if (eng<0 && eng>100){
            System.out.println("Invalid Input");
        }
        int total = m+sc+eng;
        //System.out.print("Total Marks: " +total);
        double p = (double) total/3;
        //System.out.print("\nPercentage: " +p+"%");

        boolean result = (m>=35 && sc>=35 && eng>=35);
        if (result){
            System.out.println("\nPass");
        }else {
            System.out.println("\nFail");
        }


        System.out.print("|--------------------------------------|");
        System.out.print("\n|                                      |");
        System.out.print("\n|            Mark Sheet                |");
        System.out.print("\n|                                      |");
        System.out.print("\n|--------------------------------------|");
        System.out.print("\n|  Name:                 " +name + "   |");
        System.out.print("\n|  Roll No               " + rno + "   |");
        System.out.print("\n|  Subjects        :      Marks       |");
        System.out.print("\n|  Maths           :       " +m +    "   |");
        System.out.print("\n|  Science         :        " +sc +   "   |");
        System.out.print("\n|  English         :        " +eng +  "   |");
        System.out.print("\n|--------------------------------------|");
        System.out.print("\n|   Total           :    " +total+ "        |");
        System.out.print("\n|--------------------------------------|");
        System.out.print("\n|   Percentage      :    "  +p+ "%" +  "         |");
        System.out.print("\n|   Result          :    " +result+"        |");
        System.out.print("\n|   Grade           :    " );
        if (p>=80){
            System.out.println("A+      |");
        }else if (p>=60 && p<80){
            System.out.println("A        |");
        }else if (p>=50 && p<60){
            System.out.println("B         |");
        }else if (p>=35 && p<50){
            System.out.println("C       |");
        }else {
            System.out.println("Fail    |");
        }

        s.close();
    }
}