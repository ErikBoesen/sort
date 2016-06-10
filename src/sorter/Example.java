package sorter;

import javax.swing.JOptionPane;

public class Example {
	public static void main(String[] args) {
		Sort sort = new Sort();
		
		int[] scores = new int[5];
		for (int i = 0; i < 5; i++) {
			scores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter score #" + (i + 1) + ": "));
		}
		
		String p = "";
		int[] sorted = sort.bubble(scores);
		for (int i = 0; i < sorted.length; i++) {
			p += "\n" + sorted[i];
		}
		System.out.println("Bubble:" + p);
		
		p = "";
		sorted = sort.selection(scores);
		for (int i = 0; i < sorted.length; i++) {
			p += "\n" + sorted[i];
		}
		System.out.println("Selection:" + p);
	}
}
