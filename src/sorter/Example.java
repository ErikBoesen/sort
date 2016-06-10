package sorter;

import javax.swing.JOptionPane;

public class Example {
	public static void main(String[] args) {
		// Creates an object called objOne
		Sorts sorts = new Sorts();
		
		int[] scores = new int[5];
		for (int i = 0; i < 5; i++) {
			scores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter score #" + i + ": "));
		}
		
		scores = sortBubble(scores);
	}
}
