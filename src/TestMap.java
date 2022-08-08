import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smit", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap ");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHasMap = new HashMap<>( 16, 0.75f);
        linkedHasMap.put("Smith", 30);
        linkedHasMap.put("Anderson", 31);
        linkedHasMap.put("Lewis", 29);
        linkedHasMap.put("Cook", 29);
        System.out.println("\nThe age for" + " Lewis is " + linkedHasMap.get("Lewis"));


    }
}