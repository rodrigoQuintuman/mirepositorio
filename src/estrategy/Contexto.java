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
public class Contexto {
    private Algoritmo algoritmo;
    
    public Contexto (Algoritmo algoritmo){
        this.algoritmo = algoritmo;
    }
    
    public void ejcutar(int numeros[]){
        this.algoritmo.ordenar(numeros);
    }
    
}
