import java.util.ArrayList;

public class CollectionProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. Find All Pairs with Given Sum (Two-Sum Variant).
		//Input: List = [2, 4, 3, 5, 7], sum = 7
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(7);
        int targetSum = 7;

        System.out.println("Pairs with sum " + targetSum + ":");

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    System.out.println("(" + list.get(i) + ", " + list.get(j) + ")");
                }
            }
        }
	}

}
