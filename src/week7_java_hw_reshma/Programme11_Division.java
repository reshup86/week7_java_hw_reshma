/*
Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
*/
package week7_java_hw_reshma;

public class Programme11_Division {
    public static void main (String []args){
    Programme11_Division programme11 = new Programme11_Division();
    programme11.dvsn();
    }
    public void dvsn(){
        int x[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Numbers divided by 3 are: ");
        for (int i=1; i<=100;i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n\nNumbers divided by 5 are: ");
        for (int a=1; a<=100;a++) {
            if (a % 5 == 0) {
                System.out.print(a + ",");
            }
        }
    }
}
