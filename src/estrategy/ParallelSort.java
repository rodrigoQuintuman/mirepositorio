/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategy;

import java.util.Arrays;

/**
 *
 * @author rodri
 */
public class ParallelSort implements Algoritmo {

    @Override
    public int[] ordenar(int[] numeros) {
        Arrays.parallelSort(numeros);
        return numeros;
    }

}
