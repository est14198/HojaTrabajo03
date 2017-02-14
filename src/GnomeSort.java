/**
 * GnomeSort.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * Ana Lucia Diaz 151378
 * Alejandro Vasquez
 * @author FER ESTRADA
 * @since 2/12/2017
 * Tomado de https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Gnome_sort
 */



public class GnomeSort {
	static void gnomeSort(int[] theArray) {
		
		// Lee cada elemento del array y lo compara. Si el siguiente elemento es mayor se cambia de posicion.
		for (int index = 1; index < theArray.length;) {
			if (theArray[index - 1] <= theArray[index]) {
				++index;
			} else {
				int tempVal = theArray[index];
				theArray[index] = theArray[index - 1];
				theArray[index - 1] = tempVal;
				--index;
				if (index == 0) {
					index = 1;
				}
			}
		}
	}
}