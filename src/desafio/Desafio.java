/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import estrategy.BubbleSort;
import estrategy.Contexto;
import estrategy.HeapSort;
import estrategy.InsertionSort;
import estrategy.ParallelSort;
import estrategy.QuickSort;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcion;
        boolean salir = false;
        int confirmar;
        long inicio, fin;
        CrearListaNumeros misNumeros = new CrearListaNumeros();

        while (salir != true) {
            System.out.println("-----------------------");
            System.out.println("Selecciona una opción");
            System.out.println("1-Generar numeros");
            System.out.println("2-Ver numeros generados");
            System.out.println("3-Ordenar numeros");
            System.out.println("4-Ver numeros ordenados");
            System.out.println("5-Buscar un numero");
            System.out.println("0-Salir");

            opcion = sc.next();

            switch (Validar.validarOpcion(opcion)) {
                case 1:
                    int cantidadValidada;
                    do {
                        System.out.println("Cuantos numeros deseas crear?");
                        String cantidad = sc.next();
                        cantidadValidada = Validar.validarOpcion(cantidad);
                        if (cantidadValidada > 0) {
                            misNumeros = new CrearListaNumeros(cantidadValidada);
                            inicio = System.currentTimeMillis();
                            misNumeros.crearNumeros();
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "Write file");
                        } else {
                            System.out.println("Selecciona un valor valido mayor a 0");
                        }

                    } while (cantidadValidada <= 0);

                    break;
                case 2:
                    int[] numerosObtenidso = misNumeros.obtenerNumeros();
                    if (numerosObtenidso != null) {
                        for (int num : numerosObtenidso) {
                            System.out.println(num);
                        }

                    } else {
                        System.out.println("Debes generar los numeros para ver el archivo");
                    }
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Selecciona una opción");
                    System.out.println("1-Burbuja");
                    System.out.println("2-Quicksort");
                    System.out.println("3-Parallelsort ");
                    System.out.println("4-HeapSort ");
                    System.out.println("5-Insertionsort  ");

                    String opcionOrdenamiento = sc.next();
                    switch (Validar.validarOpcion(opcionOrdenamiento)) {
                        case 1:
                            Contexto contexto = new Contexto(new BubbleSort());
                            int arrayAux[] = misNumeros.obtenerNumeros();

                            inicio = System.currentTimeMillis();
                            contexto.ejcutar(arrayAux);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "BubbleSort");

                            inicio = System.currentTimeMillis();
                            misNumeros.guardarNumerosOrdenados(arrayAux);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "Write file");
                            break;
                        case 2:
                            Contexto quicksort = new Contexto(new QuickSort());
                            int arrayAux2[] = misNumeros.obtenerNumeros();
                            inicio = System.currentTimeMillis();
                            quicksort.ejcutar(arrayAux2);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "QuickSort");

                            inicio = System.currentTimeMillis();
                            misNumeros.guardarNumerosOrdenados(arrayAux2);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "Write file");

                            break;
                        case 3:
                            Contexto parallelsort = new Contexto(new ParallelSort());
                            int arrayAux3[] = misNumeros.obtenerNumeros();

                            inicio = System.currentTimeMillis();
                            parallelsort.ejcutar(arrayAux3);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "ParallelSort");

                            inicio = System.currentTimeMillis();
                            misNumeros.guardarNumerosOrdenados(arrayAux3);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "Write file");
                            break;
                        case 4:
                            Contexto heapsort = new Contexto(new HeapSort());
                            int arrayAux4[] = misNumeros.obtenerNumeros();
                            inicio = System.currentTimeMillis();
                            heapsort.ejcutar(arrayAux4);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "HeapSort");

                            inicio = System.currentTimeMillis();
                            misNumeros.guardarNumerosOrdenados(arrayAux4);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "Write file");
                            break;
                        case 5:
                            Contexto insertionSort = new Contexto(new InsertionSort());
                            int arrayAux5[] = misNumeros.obtenerNumeros();
                            inicio = System.currentTimeMillis();
                            insertionSort.ejcutar(arrayAux5);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "InsertionSort");

                            inicio = System.currentTimeMillis();
                            misNumeros.guardarNumerosOrdenados(arrayAux5);
                            fin = System.currentTimeMillis();
                            TiempoEjecucion.tiempoEjecucion(inicio, fin, "Write file");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }

                    break;
                case 4:
                    int arrayOrdenado[] = misNumeros.obtenerNumArchivoOrdenado();
                    if (arrayOrdenado != null) {
                        for (int i : arrayOrdenado) {
                            System.out.println(i);
                        }
                    } else {
                        System.out.println("Debes ordenar los numeros para ver el archivo");
                    }

                    break;
                case 5:
                    boolean buscadoValidado;
                    String buscado;
                    do {
                        System.out.println("Ingresa el numero que buscas");
                        buscado = sc.next();
                        buscadoValidado = Validar.validarNumero(buscado);
                    } while (!buscadoValidado);
                    int buscadoAux = Integer.parseInt(buscado);
                    misNumeros.buscarNumero(buscadoAux);
                    break;
                case 0:
                    System.out.println("Estas seguro que deseas salir?");
                    System.out.println("Si=>1");
                    System.out.println("NO=>2");
                    confirmar = sc.nextInt();
                    if (confirmar == 1) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opciön no valida");
            }

        }

    }

}
