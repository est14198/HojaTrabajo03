/**
 * GnomeSortTest.java
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


public class GnomeSortTest {

	@Test
	public void testGnomeSort() {
		GnomeSort test = new GnomeSort();
		int[] arrayTest = new int[4];
		for (int i = 0; i<4; i++){
			arrayTest[i] = 4-i;
		}
		test.gnomeSort(arrayTest);
		assertArrayEquals(new int[]{1,2,3,4}, arrayTest);
	}

}
