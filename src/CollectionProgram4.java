import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. First Non-Repeating Element in an ArrayList.
		//Input: [3, 5, 3, 4, 5, 6]
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 3, 4, 5, 6));

        HashMap<Integer, Integer> fMap = new HashMap<>();
        for (int num : list) {
            fMap.put(num, fMap.getOrDefault(num, 0) + 1);
        }
        
        for (int num : list) {
            if (fMap.get(num) == 1) {
                System.out.println("First non-repeating element: " + num);
                return;
            }
        }

        System.out.println("No non-repeating element found.");
	}

}
