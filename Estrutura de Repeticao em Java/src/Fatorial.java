import java.util.Scanner;

public class Fatorial {
  
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int NumeroInteiro;
        int multiplicacao = 1;
        int contador;
        int resultadofinal = 1;
        int resultado;
        

        System.out.println("Me informe um numero inteiros: ");
        NumeroInteiro = ler.nextInt();

        do {
            resultado = multiplicacao * NumeroInteiro;
            resultadofinal = resultadofinal * resultado;
            NumeroInteiro--;

        } while (NumeroInteiro >= 1);

        // for(int i = NumeroInteiro; NumeroInteiro >= 1; i-- )
        // multiplicacao= multiplicacao * i;
        //

        
        System.out.println( "O fatorial do numero e  " + resultadofinal);
      
    }

}