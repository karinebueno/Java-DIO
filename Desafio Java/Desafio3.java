import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) throws Exception {

        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in);
       
        for(int i=0; i < (nomesFila.length ) ; i++){
            nomesFila[i] = nome.next();
        }

        
        for (int i =0; i< nomesFila.length; i++){
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i+1)  );
        }
    }
}