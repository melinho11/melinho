/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos2;

/**
 *
 * @author edson.aojunior3
 */
public class intercalacao {

    public static int[] inter(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int j = 0;
        int i = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j] && c[k] == 0 ){
                c[k++] = a[i++];
                c[k] += a[i];
            } else {
                c[k++] = b[j++];
            }

        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 6, 7, 9};
        int b[] = {2, 4, 5, 6};
        int c[] = inter(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
