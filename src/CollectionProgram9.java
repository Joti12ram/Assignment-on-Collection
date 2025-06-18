import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9. Count Occurrences of Each Element in an ArrayList.
	Input: ["apple", "banana", "apple", "orange", "banana", "apple"]*/
		 ArrayList<String> fruits = new ArrayList<>();
		 fruits.add("apple");
		 fruits.add("banana");
		 fruits.add("apple");
		 fruits.add("orange");
		 fruits.add("banana");
		 fruits.add("apple");
		 HashMap<String, Integer> countMap = new HashMap<>();

	        for (String fruit : fruits) {
	            countMap.put(fruit, countMap.getOrDefault(fruit, 0) + 1);
	        }

	        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	}

}
