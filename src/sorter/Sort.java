package sorter;

public class Sort {
	public int[] bubble(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
	public int[] selection(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
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
