package Copias;

public class copiar_y_pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("busca esto");
/*el programa que ordena en ascendente un arrary de números enteros utilizando el algoritmo de la burbuja.*/
	
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Ejemplo de array de números enteros
        int[] numbers = {5, 3, 8, 6, 2, 7, 4, 1};

        System.out.println("Array original: " + Arrays.toString(numbers));
        
        // Llamamos a la función de ordenamiento
        bubbleSort(numbers);

        System.out.println("Array ordenado: " + Arrays.toString(numbers));
    }

    // Método que implementa el algoritmo de la burbuja
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Iterar por el arreglo
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Comparar y intercambiar elementos adyacentes
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar los elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo intercambios en una pasada, el arreglo ya está ordenado
            if (!swapped) break;
        }
    }
}

	
	}

}

