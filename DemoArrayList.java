import java.util.ArrayList;
import java.util.List;
public class DemoArrayList {
    static List<String> arrayList = new ArrayList<>();
    public static void AddElementsToArrayList(String string)
    {
        arrayList.add(string);
    }
    public static void AddIndexAndValueToArrayList(Integer index,String string)
    {
        arrayList.add(index,string);
    }
    public static void RemoveElementByIndex(String index)
    {
        arrayList.remove(index);
    }
    public static void main(String[] args) {

        DemoArrayList.AddElementsToArrayList("blue");
        DemoArrayList.AddIndexAndValueToArrayList(0,"black");
        System.out.println(arrayList);
        DemoArrayList.AddIndexAndValueToArrayList(0,"pink");
        System.out.println(arrayList);
       // DemoArrayList.RemoveElementByIndex(String.valueOf(0));
        DemoArrayList.arrayList.remove(0);
        System.out.println(arrayList);
    }

}
