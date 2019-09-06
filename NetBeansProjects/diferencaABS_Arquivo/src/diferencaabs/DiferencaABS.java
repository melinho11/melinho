
package diferencaabs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * @author fabio.aglubacheski
 */
public class DiferencaABS {
                                           // lanca a excecao para quem chamar o programa
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int A[];
        
        // abre o arquivo
        FileReader arquivo = new FileReader("vetor.txt");
        // prepara para fazer a leitura bufferizada(por linha)
        // dos caracteres do arquivo
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        
        // le uma linha do arquivo 
        // e armazena em uma String
        String linha = leBufferizado.readLine();
        
        // converte a string em um vetor de inteiros
        
        // divide a string em strings somente com numeros e 
        // armazena em um vetor de string
        String vetStr[]=linha.split(" "); 

        // cria um vetor de inteiro do mesmo tamanho que o vetor de string vetStr[]
        A = new int[vetStr.length];
        
        // converte cada posicao do vetor de String vetStr[] 
        // para inteiro e atribui no vetor A[]
        for( int i=0; i < vetStr.length;i++)
            A[i]=Integer.parseInt(vetStr[i]);
        
        System.out.println("diferenca absoluta dos elementos do vetor:"+difAbs(A));
    }
    public static int difAbs(int[] A) {
        int a,b;
        a = A[0]; // menor
        b = A[0]; // maior
        for( int i=1; i<A.length;i++){
            if( A[i]<a)
                a = A[i];// novo menor
            if( A[i]>b)
                b = A[i];// novo maior
        }
        return b-a;
    }
    
}
