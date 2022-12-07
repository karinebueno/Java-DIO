import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Nota;

        System.out.println("Informe uma nota entre zero e dez: ");
        Nota = ler.nextInt();

        while (Nota < 0 | Nota > 10){
            System.out.println("Valor invalido! Digite Novamente: ");
            Nota = ler.nextInt();
        }
    }
}