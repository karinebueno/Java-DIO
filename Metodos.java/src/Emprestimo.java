import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        int soma;
        int media;

        soma = idade1 + idade2 + idade3;
        media = soma / 3;

        if (media > 0 | media <= 25) 
            System.out.println("Jovem");
        else 
            if(media > 25 | media < 60)
                System.out.println("adulta");
            else System.out.println("idosa");



        
    }
    
}
