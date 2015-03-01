import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static void solve(String[][] map) {
		// System.out.println(line.split(" ")[1]);

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				int current = Integer.parseInt(map[i][j]);

				if (i + 1 >= map.length || i - 1 < 0 || j + 1 >= map.length
						|| j - 1 < 0) {
					continue;
				}
				else if (map[i - 1][j].equals("X") || map[i + 1][j].equals("X")
						|| map[i][j - 1].equals("X")
						|| map[i][j + 1].equals("X")) {
					continue;
				}
				int up = Integer.parseInt(map[i - 1][j]);
				int down = Integer.parseInt(map[i + 1][j]);
				int left = Integer.parseInt(map[i][j - 1]);
				int right = Integer.parseInt(map[i][j + 1]);
				/*
				 * System.out.println(current); System.out.println("   " +up);
				 * System.out.println(left+"      " +right);
				 * System.out.println("   " +down);
				 */
				if (current > up && current > down && current > left
						&& current > right) {
					map[i][j] = "X";
				}

			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Queue<String> queue = new LinkedList<String>();

		Scanner in = new Scanner(System.in);
		int max_line = in.nextInt();
		String[][] map = new String[max_line][max_line];

		in.nextLine();

		for (int i = 0; i < max_line; i++) {
			queue.add(in.nextLine());
		}

		int row = 0;

		while (!queue.isEmpty()) {
			String linha = queue.poll();
			int column = 0;
			for (char c : linha.toCharArray()) {
				map[row][column] = new Character(c).toString();
				column++;
			}
			row++;
		}
		solve(map);
		print(map);

		in.close();
	}

	private static void print(String[][] map) {
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}
}