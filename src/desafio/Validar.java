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
public class Validar {

    public static int validarOpcion(String numero) {

        try {
            int numeroValidado = Integer.parseInt(numero);
            return numeroValidado;
        } catch (NumberFormatException nfe) {
            return -1;
        }

    }

    public static boolean validarNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;

        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
