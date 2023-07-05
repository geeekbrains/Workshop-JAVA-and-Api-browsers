import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
  
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("watermelon");

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "apple");
        hashMap.put(2, "banana");
        hashMap.put(3, "cherry");
        hashMap.put(4, "watermelon");
        Integer bananaValue = getKeyByValue(hashMap, "banana");
        Integer watermelonValue = getKeyByValue(hashMap, "watermelon");

        if (bananaValue != null && watermelonValue != null) {
            int result = bananaValue - watermelonValue;
            System.out.println(result);
        } else {
            System.out.println("One or both values are not found in the HashMap.");
        }
             
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("watermelon");
        
if (!treeSet.isEmpty()) {
            String firstElement = treeSet.first();
            System.out.println("First element in the sorted TreeSet: " + firstElement);
        } else {
            System.out.println("The TreeSet is empty.");
        }
    }

    private static Integer getKeyByValue(HashMap<Integer, String> hashMap, String value) {
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key).equals(value)) {
                return key;
            }
        }
        return null;
    }
}
