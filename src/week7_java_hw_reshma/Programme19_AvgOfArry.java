package week7_java_hw_reshma;

public class Programme19_AvgOfArry {
    public static void main(String[] args) {
        Programme19_AvgOfArry programme19 = new Programme19_AvgOfArry();
        programme19.avg();
    }
    public void avg(){
        int num[] = {10,20,30,40,50};
        int sum = 0;
        for (int i=0; i< num.length; i++) {
            sum = sum + num[i];
        }
        int a=sum/num.length;
        System.out.println("Average value of array number is: " +a);
    }
}
