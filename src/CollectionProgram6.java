import java.util.ArrayList;

public class CollectionProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Merge Two Sorted ArrayLists into One Sorted ArrayList.
		//Input: arraylist_1 = [1, 3, 5, 7] ,  arraylist_2 = [2, 4, 6, 8]
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        
		 ArrayList<Integer> list2 = new ArrayList<>();
		 list2.add(2);
	     list2.add(4);
	     list2.add(6);
	     list2.add(8);
		 
	     ArrayList<Integer> list3 = new ArrayList<>();
	     int i = 0, j = 0;
	        while (i < list1.size() && j < list2.size()) {
	            if (list1.get(i) < list2.get(j)) {
	              list3.add(list1.get(i));
	                i++;
	            } else {
	               list3.add(list2.get(j));
	                j++;
	            }
	        }

	        while (i < list1.size()) {
	            list3.add(list1.get(i));
	            i++;
	        }

	        while (j < list2.size()) {
	            list3.add(list2.get(j));
	            j++;
	        }
 System.out.println("list3 Sorted ArrayList: " + list3);
	}

}
