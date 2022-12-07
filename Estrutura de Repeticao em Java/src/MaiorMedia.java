import java.util.Scanner;

public class MaiorMedia {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Numero;
        int contador =0;
        int Novonumero = 0;
        int Media;
        int MaiorNumero = 0;

        do {
            System.out.println("Entre com um valor: ");
            Numero = ler.nextInt();
            contador = contador +1;
            Novonumero  = Novonumero + Numero;
            MaiorNumero = Numero;
            if(MaiorNumero >= Numero)
                MaiorNumero = Numero;

        } while (contador < 5);
        Media = Novonumero / 5;
        System.out.println( "A media dos numeros e: " + Media);
        System.out.println("O maior numero e: " + MaiorNumero);


        
    }

}