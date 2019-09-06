package Algoritmo;

import java.util.Scanner;

public class CalculaJuros {

    public static void main(String[] args) {

        float taxaJuros[] = {0.20f, 0.21f, 0.19f, 0.18f, 0.03f, 0.08f, 0.10f, 0.15f, 0.20f, 0.30f, 0.32f, 0.40f};
        float P[];
        Scanner ler = new Scanner(System.in);
        int nProdutos;

        // le os precos produtos para calculo de juros
        System.out.print("digite a quantidade de  produtos:");
        nProdutos = ler.nextInt();
        P = new float[nProdutos];
        for (int i = 0; i < nProdutos; i++) {
            System.out.printf("digite preco de P[%d]:", i);
            P[i] = ler.nextFloat();
        }
        // calcula o preco de P apos aplicar os juros
        //P = aplicaJuros(P, taxaJuros);
        System.out.printf("P[%d]=R$%.1f\n\n", P);
      
        

    }

    private static float[] aplicaJuros(float P[], float taxa[]) {
        for (int k = 0; k < 10; k++) {

            for (int i = 0; i < taxa.length; i++) {
                P[k]= P[k] * (taxa[i] + 1);
            }

         
        }
        return P;
    }

    private static void printaMatriz(int[][] M) {

        // anda nas linhas da matriz
        for (int i = 0; i < M.length; i++) { // numero de linhas
            System.out.println();
            // anda nas colunas
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
        }
    }

}
