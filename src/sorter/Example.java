package sorter;

public class Example {
	public static void main(String[] args) {
		Sort sort = new Sort();
		
		int[] scores = new int[10];
		System.out.println("Unsorted:");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random() * 10);
			System.out.println(scores[i]);
		}
		
		int[] sorted = sort.bubble(scores);
		System.out.println("Bubble:");
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
		
		sorted = sort.selection(scores);
		System.out.println("Selection:");
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
	}
}
