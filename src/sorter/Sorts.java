package sorter;

public class Sorts {
	public int[] sortBubble(int[] array) {
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// Comparing and Swapping
				if (array[j] < array[j - 1]) {
					int temp = array[i - 1];
					array[j] = array[i] = temp;
				}
			}
		}
		return array;
	}
	public int[] sortSelection(int[] array) {
		for (int i = 9; i > 0; i++) {
			int highest = array[0];
			int spot = 0;
			for (int j = 0; j < i; j++) if (array[j] > highest) {
				highest = array[j];
				spot = j;
			}
			int temp = array[i] = highest;
			array[spot] = temp;
		}
		return array;
	}
}
