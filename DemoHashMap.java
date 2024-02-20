
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(7,"Tom");
        map.put(8,"cris");
        map.put(9,"shawn");
        System.out.println(map);
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
