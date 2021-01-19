/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author rodri
 */
public class TiempoEjecucion {

    public static void tiempoEjecucion(long inicio, long fin, String nombre) {
        System.out.println(nombre + " execution time: " + (fin - inicio) + " ms");
    }

}
