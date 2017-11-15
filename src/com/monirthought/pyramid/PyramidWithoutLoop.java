package com.monirthought.pyramid;

/**
 * Drawing the following Number Pyramid Without Loop
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 * @author Md Moniruzzaman
 *
 */
public class PyramidWithoutLoop {

	private final int LIMIT = 9;

	private void drawPyramid(int row, int current, int half) {

		System.out.print(current + " ");

		if (row == current) {
			
			System.out.println("");
			
			if (half == 2 && row == 1) {
				return;
			}
			if (half == 2 && row > 1) {
				drawPyramid(row - 1, 1, half);
			}
			if (half == 1 && LIMIT == row) {
				drawPyramid(row - 1, 1, half + 1);
			}
			if (half == 1 && row < LIMIT) {
				drawPyramid(row + 1, 1, half);
			}
		} else {
			drawPyramid(row, current + 1, half);
		}
	}

	public static void main(String[] args) {
		new PyramidWithoutLoop().drawPyramid(1, 1, 1);
	}
}
