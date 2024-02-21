import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {
    static List<String> arrayList = new ArrayList<>();
    public static void addElementsToArrayList(String string)
    {
        arrayList.add(string);
    }
    public static void addIndexAndValueToArrayList(int index,String string)
    {
        arrayList.add(index,string);
    }
    public static void removeElementByIndex(int index)
    {
        arrayList.remove(index);
    }
    public static void main(String[] args) {

        DemoArrayList.addElementsToArrayList("blue");
        DemoArrayList.addIndexAndValueToArrayList(0,"black");
        System.out.println(arrayList);
        DemoArrayList.addIndexAndValueToArrayList(0,"pink");
        System.out.println(arrayList);
        DemoArrayList.removeElementByIndex(2);
        System.out.println(arrayList);
    }

}
