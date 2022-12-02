package edu.karine.primeirasemana;
public class MinhaClasse {
/**
 * @param args
 */
public static void main (String [] args) {

        String primeiroNome = "Karine";
        String segundoNome = "Bueno";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    
    }

public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    

    }
}
