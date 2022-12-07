import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Nota;

        while(true) {

            System.out.println("Informe uma nota entre zero e dez: ");
            Nota = ler.nextInt();

            if (Nota > 10)
            System.out.println("Valor invalido! ");
            

        }
    }
}