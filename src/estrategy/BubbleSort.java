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
public class BubbleSort implements Algoritmo {

    @Override
    public int[] ordenar(int numeros[]) {
        int aux;
        for (int i = 0; i < (numeros.length - 1); i++) {
            for (int j = 0; j < (numeros.length - 1); j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        return numeros;
    }

}
