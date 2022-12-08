//Gera e imprima uma matriz M 4x4 com valores aleatorios entre 0-9
import java.util.Random;

public class ArrayMultidimensional{
    public static void main(String[] args){
        Random random = new Random();
        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){ //linha
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }

        }

        System.out.println("Metriz: ");
        for(int[] linha : M){
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
        
    }
}