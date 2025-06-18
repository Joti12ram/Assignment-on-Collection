import java.util.ArrayList;
import java.util.Collections;

public class CollectionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Rotate an ArrayList k Times (Circular Rotation).
		//Input: List = [1, 2, 3, 4, 5], k = 2 
		ArrayList<Integer>list=new ArrayList<>();
		Collections.addAll(list,  1,2,3,4,5);
		int k=2;
		int size = list.size();
		for(int i=0; i<k; i++) {
			int last=list.remove(size-1);
			list.add(0, last);
		}
		System.out.println("Rotated List: " + list);
	}

}
