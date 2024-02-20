import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("pink");
        arrayList.add("blue");
        Scanner scanner=new Scanner(System.in);
       System.out.println("please enter a Number");
        int input= scanner.nextInt();
        arrayList.add(0,String.valueOf(input));
        System.out.println("please enter a String");
        String string=scanner.next();
        arrayList.add(string);
        for (String lists:arrayList) System.out.println(lists);
        arrayList.remove(0);
        System.out.println("Arraylist elements: "+arrayList +" size: "+ arrayList.size());
        System.out.println("Getting specific element in an array by index : "+arrayList.get(0));
    }

}
