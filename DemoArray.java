import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        String[] ar = new String[3];
        ar[0]= ("Apple");
        ar[1]= ("samsung");
        ar[2]= ("Nokia");
        for (String elements:ar) System.out.println(elements);
        System.out.println("Array length is: "+ar.length +" elements in array: "+ Arrays.toString(ar));


    }
}
