package week7_java_hw_reshma;

public class Programme20_Value {
    public static void main(String[] args) {
        Programme20_Value programme20 = new Programme20_Value();
        programme20.val();
    }
    public void val(){
        int n[] = {5,3,7,2,9};
        int x = 0;
        boolean y = false;

        for (int a : n) {
            if (a == x) {
                y = true;
                break;
            }
        }
        if(y)
            System.out.println(x + " is found.");
        else
            System.out.println(x + " is not found.");
    }
}
