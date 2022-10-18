//Write a Java program to sum values of an array.
package week7_java_hw_reshma;

public class Programme18_SumOfArray {
    public static void main(String[] args) {
        Programme18_SumOfArray programme18 = new Programme18_SumOfArray();
        programme18.sum();
    }
    public void sum(){
        int a[] = {27,85,65,32,77};
        int s = 0;
        for (int i=0; i<a.length;i++){
            s=s+a[i];
        }
        System.out.println("Sum of array numbers is: "+s);
    }
}
