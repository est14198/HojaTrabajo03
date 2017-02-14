import static org.junit.Assert.*;

import org.junit.Test;


public class MergeSortTest {


	@Test
	public void testLeftHalf() {
		MergeSort test = new MergeSort();
		int[] arrayTest = new int[4];
		for (int i = 0; i<4; i++){
			arrayTest[i] = 4 - i;
		}
		int[] result = test.leftHalf(arrayTest);
		assertArrayEquals(new int[]{4,3},result);
		}

	@Test
	public void testRightHalf() {
		MergeSort test = new MergeSort();
		int[] arrayTest = new int[4];
		for (int i = 0; i<4; i++){
			arrayTest[i] = 4 - i;
		}
		int[] result = test.rightHalf(arrayTest);
		assertArrayEquals(new int[]{2,1},result);
		}

}
