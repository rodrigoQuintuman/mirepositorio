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
public class InsertionSort implements Algoritmo{

    int pos, aux;
    @Override
    public int[] ordenar(int[] array) {      
        for(int i = 0; i < array.length; i++){
            pos = i;
            aux = array[i]; 
            
            while((pos>0)&&(array[pos-1] > aux)){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos]= aux;
        }
        return array;
    }
    
}
