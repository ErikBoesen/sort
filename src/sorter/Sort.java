package sorter;

public class Sort {
	// Bubble sort swaps values, comparing each set of two and ordering them.
	// This process is repeated until the array has been sorted.
	public int[] bubble(int[] array) {
		// This will cause it to loop through the array until it's sorted.
		// The length of the array will always be enough to fully sort. 
		for (int i = 0; i < array.length; i++) {
			// Loop through the array once
			for (int j = 1; j < array.length; j++) {
				// Is the first value in the set of two larger?
				// Then it should go after the smaller value.
				if (array[j-1] > array[j]) {
					// Store second value and replace it with first value 
					int temp = array[j] = array[j - 1];
					// Make first value what the second was before
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
	public int[] selection(int[] array) {
		// TODO: Comments and fix bugs here
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
