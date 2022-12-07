import java.util.Scanner;

public class Tabuada {
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int TabuadaDo;
        int contador = 0;
        int multiplicacao;

        System.out.println("Qual numero voce deseja ver a tabuada? ");
        TabuadaDo = ler.nextInt();

        do {
            contador = contador + 1;
            multiplicacao = contador * TabuadaDo;
            System.out.println(multiplicacao);
            
        } while (contador < 10);

        //for (int i =1; i <=  10 ; i++)
        //{System.out.println(tabuada*1)}
        
        System.out.println( " A sua tabuaa esta pronta! "); 
    }

}