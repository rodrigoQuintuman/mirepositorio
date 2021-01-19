/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategy;

/**
 *
 * @author rodri
 */
public class QuickSort implements Algoritmo {

    @Override
    public int[] ordenar(int[] array) {
        array = quick(array, 0, array.length - 1);
        return array;
    }

    public int[] quick(int[] array, int primero, int ultimo) {

        int i, j, pivote, aux;
        i = primero;
        j = ultimo;
        pivote = array[(primero + ultimo) / 2];
        do {
            while (array[i] < pivote) {
                i++;
            }
            while (array[j] > pivote) {
                j--;
            }
            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quick(array, primero, j);
        }
        if (i < ultimo) {
            quick(array, i, ultimo);
        }
        return array;
    }
}
