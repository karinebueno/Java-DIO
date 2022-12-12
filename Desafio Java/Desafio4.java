import java.util.Scanner;

public class Desafio4 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();
    int desconto;
    double novoDesconto;
    double novoM;
    double descontofinal;

    desconto = M - S;
    Double p = Double.valueOf(desconto);
    Double i = Double.valueOf(M);
    descontofinal = (p / i) * 100;
    int valor = (int)descontofinal;


    
    System.out.println("O desconto foi de " + valor +"%");
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
    }   
  
}
