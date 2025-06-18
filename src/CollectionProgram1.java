import java.util.ArrayList;

public class CollectionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Remove Duplicates from an ArrayList (Without using Set or Streams).
		//Input: [10, 20, 10, 30, 20, 40]
		ArrayList<Integer>x=new ArrayList<>();
		x.add(10);
		x.add(20);
		x.add(10);
		x.add(30);
		x.add(20);
		x.add(40);
		
		ArrayList<Integer>y=new ArrayList<>();
		for(Integer num:x) {
			if(!y.contains(num)) {
				y.add(num);
			}
		}
		System.out.println("OriginalList: " + x);
		System.out.println("List without duplicates: " +y);
	}

}
