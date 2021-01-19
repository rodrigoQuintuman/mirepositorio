/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodri
 */
public class CrearListaNumeros {

    private int cantidad;
    private static int index = 0;
    private String path = System.getProperty("user.home") + File.separator + "Documents"+File.separator + "ArchivoDeDesafio";

    public CrearListaNumeros(int cantidad) {
        this.cantidad = cantidad;
        index++;
    }

    public CrearListaNumeros() {
    }

    public void crearNumeros() {
        int numeroAux;
        try {
            File fi = new File(path);
            fi.mkdirs();
            FileWriter fw = new FileWriter(path+"\\Lista"+index+".txt");
            for (int i = 0; i < cantidad; i++) {
                numeroAux = (int) (Math.random() * (10000-(-10000)+1)+(-10000));
                fw.write(numeroAux + "\n");
            }
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(CrearListaNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static int[] leerArchivo(String file) {

        try {

            File f = new File(file);
            Scanner s = new Scanner(f);
            int cantidad = 0;
            while (s.hasNextInt()) {
                cantidad++;
                s.nextInt();
            }
            s.close();
            int[] arr = new int[cantidad];

            s = new Scanner(f);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            s.close();
            return arr;
        } catch (Exception e) {
            return null;
        }

    }

    public int[] obtenerNumeros() {
        
        
        int[] datos = leerArchivo(path+"\\Lista"+index+".txt");
        if (datos!=null) {
            return datos;
        }
        return null;
    }

    public int[] obtenerNumArchivoOrdenado() {
        
        int[] datos = leerArchivo(path+"\\Ordenados"+index+".txt");     
        return datos;
    }

    public void guardarNumerosOrdenados(int[] numerosOrdenados) {

        try {
            FileWriter fw = new FileWriter(path+"\\Ordenados"+index+".txt");
            int numeros[] = numerosOrdenados.clone();
            for (int i = 0; i < numeros.length; i++) {
                fw.write(Integer.toString(numeros[i]) + "\n");
            }
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(CrearListaNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscarNumero(int buscado) {

        boolean encontrado = false;
        int[] numeroOrdenados = obtenerNumArchivoOrdenado().clone();
        for (int i = 0; i < numeroOrdenados.length; i++) {
            if (numeroOrdenados[i] == buscado) {
                System.out.println("Numero " + buscado + " encintrado en la pocision: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Lo siento el numero que busca no se encuentra");
        }

    }
}
