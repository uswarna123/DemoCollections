import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"red");
        arrayList.add(1,"pink");
        arrayList.add(2,"blue");
        Scanner scanner=new Scanner(System.in);
       System.out.println("please enter a Number");
        int input= scanner.nextInt();
        System.out.println("please enter a String");
        String string=scanner.next();
        arrayList.add(String.valueOf(input));
        arrayList.add(string);
        arrayList.remove(3);
        for (String lists:arrayList) System.out.println(lists);
        System.out.println("Arraylist elements: "+arrayList +" size: "+ arrayList.size());
    }

}
