import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Top K Frequent Elements using ArrayList & HashMap.
		//Input: List = [4, 4, 1, 2, 2, 2, 3, 3], k = 2
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 4, 1, 2, 2, 2, 3, 3));
        int k = 2;

       HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue())); 

        ArrayList<Integer> RT = new ArrayList<>();
        for (int i = 0; i < k && i < sortedList.size(); i++) {
            RT.add(sortedList.get(i).getKey());
        }

       
        System.out.println("Top " + k + " frequent elements: " + RT);
	}

}
