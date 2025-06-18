import java.util.ArrayList;
import java.util.Iterator;

public class CollectionProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Remove All Strings with Length < 3 .
		Input:  ["a", "ab", "abc", "java", "is", "fun", "ok", "yes"]*/
		ArrayList<String> words = new ArrayList<>();
		words.add("a");
		words.add("ab");
		words.add("abc");
		words.add("java");
		words.add("is");
		words.add("fun");
		words.add("ok");
		words.add("yes");
		 Iterator<String> iterator = words.iterator();
	        while (iterator.hasNext()) {
	            if (iterator.next().length() < 3) {
	                iterator.remove();
	            }
	        }

	        System.out.println("Filtered List: " + words);

	}

}
