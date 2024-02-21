import java.util.ArrayList;
import java.util.List;
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
    public static void iterateAStringThroughForLoop() {
        for (Object string : arrayList.toArray()) {
            System.out.println(string);
        }

    }
    public static void main(String[] args) {

        DemoArrayList.addElementsToArrayList("blue");
        DemoArrayList.addIndexAndValueToArrayList(0,"black");
        System.out.println(arrayList);
        DemoArrayList.addIndexAndValueToArrayList(0,"pink");
        DemoArrayList.addIndexAndValueToArrayList(0,"green");
        DemoArrayList.addElementsToArrayList("red");
        System.out.println(arrayList);
        DemoArrayList.removeElementByIndex(2);
        System.out.println(arrayList);
        DemoArrayList.iterateAStringThroughForLoop();
    }

}
