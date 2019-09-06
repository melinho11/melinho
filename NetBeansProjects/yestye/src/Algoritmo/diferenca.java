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
public class diferenca {

    static int difabs(int A[]) {
        int a, b;
        a = A[0];
        b = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < a) {
                a = A[i];
            }
            if (A[i] > a) {
                b = A[i];
            }
        }
        return b - a;

    }

    public static void main(String[] args) {
        int A[] = {3, 7, 1, 8, 4, 2, 9, 5};
        int difabs = difabs(A);
        System.out.println(difabs);
        FileReader arquivo = new FileReader("vetor.txt");
    }

}
