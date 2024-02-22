import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class DemoArrayList  {
    static List<String> arrayList = new ArrayList<>();
    static List<String> arrayList1= new ArrayList<>();
    static List<String> arrayList2= new ArrayList<>();
        public static void setElementToArrayList (String string){
        arrayList.add(string);
        }
        public static void setElementsToArrayList (){
        arrayList1.addAll(Arrays.asList("Max","Peter","Jackson","Alicia","Julien"));}
    public static void setElementsToAnotherArrayList (){
        arrayList2.addAll(Arrays.asList("Max","Peter","Jackson","Alicia","Julien"));}
        public static void setIndexAndValueToArrayList ( int index, String string)
        {
            arrayList.add(index, string);
        }
        public static void getArrayList (int index)
        {
            System.out.print("inside getMethod :");
            System.out.println(arrayList.get(index));
        }
        public static void removeElementByIndex ( int index)
        {
            arrayList.remove(index);
        }
        public static void getArrayListThroughForLoop () {
        for (Object string : arrayList.toArray()) {
            System.out.println(string);
        }
    }
    public static void main(String[] args) {

        DemoArrayList.setElementToArrayList("blue");
        DemoArrayList.setIndexAndValueToArrayList(0,"black");
        System.out.println(arrayList);
        DemoArrayList.setIndexAndValueToArrayList(0,"pink");
        DemoArrayList.setIndexAndValueToArrayList(0,"green");
        DemoArrayList.setElementToArrayList("red");
        System.out.println(arrayList);
        DemoArrayList.removeElementByIndex(2);
        System.out.println(arrayList);
        DemoArrayList.getArrayListThroughForLoop();
        DemoArrayList.getArrayList(3);
        DemoArrayList.setElementsToArrayList();
        DemoArrayList.setElementsToAnotherArrayList();
        System.out.println("first array "+arrayList1);
        System.out.println("second array "+arrayList2);
        //List<Boolean> equals= Collections.singletonList(arrayList1.equals(arrayList2));
        System.out.println(arrayList1.equals(arrayList2));
        System.out.println(arrayList1.addAll(Arrays.asList("Json","Patricia"))+""+arrayList1);
        System.out.println("first array "+arrayList1);
        System.out.println("second array "+arrayList2);
    }
}
