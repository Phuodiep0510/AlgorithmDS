package DataStructureandAlgorithm;

public class changeMoney {
	public static int changeMoney(int money) {
		int[] moneyValue = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		int count = 0;
		
		for (int coin : moneyValue) {
			while (money >= coin) {
				money -= coin;
				count++;
			}
		}
		return count;
	}

public static void main(String[] args) {
	System.out.println(changeMoney(324));
	System.out.println(changeMoney(728));
	System.out.println(changeMoney(100));
}
}
//time complexity: O(n)
//Space complexity: O(n+11)??