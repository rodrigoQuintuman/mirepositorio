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
public class HeapSort implements Algoritmo{

    @Override
    public int[] ordenar(int[] numeros) {
        
        final int n = numeros.length;
        for (int nodo = n/2; nodo >= 0; nodo--) {
            hacerMonticulo(numeros,nodo,n-1);
        }
        for (int nodo = n-1; nodo >= 0 ; nodo--) {
            int tmp = numeros[0];
            numeros[0] = numeros[nodo];
            numeros[nodo] = tmp;
            hacerMonticulo(numeros,0,nodo-1);
        }
        return numeros;
    }
    
    public static void hacerMonticulo(int numeros[],int nodo, int fin){
        
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin){
            return;
        }
        if(der>fin){
            may = izq;
        }else{
            may = numeros[izq] > numeros[der]?izq:der;
        }
        if(numeros[nodo] < numeros[may]){
            int tmp = numeros[nodo];
            numeros[nodo] = numeros[may];
            numeros[may] = tmp;
            hacerMonticulo(numeros, may, fin);
        }
    }
    
}
