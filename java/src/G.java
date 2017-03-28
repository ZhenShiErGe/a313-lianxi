import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by yizhen on 17-3-28.
 */
public class G {
    public static void main(String[] args) {
        {
            Map<String, Integer> map = new HashMap<>();
            map.put("a", 1);
            map.put("a", 2);
            map.put(new String("a"), 3);
            map.put(new String("a"), 4);
            System.out.println(map);
        }
        {
            Map<Key,Integer> map=new HashMap<>();
            map.put(new Key(),1);
            map.put(new Key(),2);
            System.out.println(map);
        }
        {
            Map<String, Integer> map = new IdentityHashMap<>();
            map.put("a", 1);
            map.put("a", 2);

            map.put(new String("a"), 3);
            map.put(new String("a"), 4);

            System.out.println(map);
        }

    }
}

class Key{}
