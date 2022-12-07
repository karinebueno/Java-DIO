import java.util.Scanner;

public class ParImpar {
  
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Numero;
        int contadorPar = 0;
        int contadorImpar = 0;
        int quantNumeros = 0;

        System.out.println("Me informe a quantidade de numero inteiros: ");
        quantNumeros = ler.nextInt();

        do {
            System.out.println("Entre com numero inteiro: ");
            Numero = ler.nextInt();
            quantNumeros = quantNumeros - 1;
            if (Numero % 2 == 0) contadorPar++;
            else contadorImpar++;
        } while (quantNumeros > 0);
        
        System.out.println( "A quantidade de numeros pares " + contadorPar);
        System.out.println("A quantidade de numeros impares: " + contadorImpar);  
    }

}