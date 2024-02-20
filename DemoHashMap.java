
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        Map<Integer, String> map2=new HashMap<>();
        map.put(7,"Tom");
        map.put(8,"cris");
        map.put(9,"shawn");
        map2.put(10,"shane");
        System.out.println("first map: "+map);
       map2.putAll(map);
       //System.out.print(map2.putAll(map));
        System.out.println("second map: "+map2);
        for (Map.Entry entry:map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        System.out.println("number of keys in map1 "+map.size());
        System.out.println("number of keys in map2 "+map2.size());

    }
}
