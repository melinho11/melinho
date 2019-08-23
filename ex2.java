/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo;

/**
 *
 * @author matheus.bmelo
 */
public class ex2 {

    public static void main(String[] args) {
        int m[][] = {{20, 15, 30, 40, 68},
        {35, 18, 35, 35, 60},
        {40, 12, 27, 70, 50}};
        int Q[] = {3, 4, 7};
        int[] resultado = precos(m, Q);
        imprimir(resultado);

    }

    public static int[] precos(int m[][], int Q[]) {
        int[] guarda = new int[5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                

                guarda[j] = guarda[j] + Q[i] * m[i][j];

            }
        }
        return guarda;
    }

    private static int[] imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        return a;

    }

    private static void printaMatriz(int[][] m) {

        // anda nas linhas da matriz
        for (int i = 0; i < m.length; i++) { // numero de linhas
            System.out.println();
            // anda nas colunas
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }

    }
}
