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
    
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("watermelon");
        
    String bananaValue = hashMap.get(2);
        String watermelonValue = hashMap.get(4);

        if (bananaValue != null && watermelonValue != null) {
            int result = bananaValue.length() - watermelonValue.length();
            System.out.println(result);
        } else {
            System.out.println("One or both values are not found in the HashMap.");
        }
    }
}
