/**
 * MergeSortTest.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * Ana Lucia Diaz 151378
 * Alejandro Vasquez 09284
 * @since 2/13/2017
 * Tomado de https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Gnome_sort
 */

import static org.junit.Assert.*;

import org.junit.Test;


public class MergeSortTest {


	@Test
	public void testLeftHalf() {
		MergeSort test = new MergeSort();
		int[] arrayTest = new int[4];
		for (int i = 0; i<4; i++){
			arrayTest[i] = i+1;
		}
		int[] result = test.leftHalf(arrayTest);
		assertArrayEquals(new int[]{1,2},result);
		}

	@Test
	public void testRightHalf() {
		MergeSort test = new MergeSort();
		int[] arrayTest = new int[4];
		for (int i = 0; i<4; i++){
			arrayTest[i] = i+1;
		}
		int[] result = test.rightHalf(arrayTest);
		assertArrayEquals(new int[]{3,4},result);
		}

	@Test
	public void testMerge() {
		MergeSort test = new MergeSort();
		int[] arrayTest = new int[4];
		for (int i = 0; i<4; i++){
			arrayTest[i] = i+1;
		}
		
		int[] left = test.leftHalf(arrayTest);
		int[] right = test.rightHalf(arrayTest);		
		test.merge(arrayTest, left, right);
		assertArrayEquals(new int[]{1,2,3,4},arrayTest);		
	}

}
