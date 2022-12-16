import java.util.HashMap;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

import java.util.*;

/*Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
-Crie um dicionário e relacione os estados e suas populações;
-Substitua a população do estado do RN por 3.534.165;
-Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
-Exiba a população PE;
-Exiba todos os estados e suas populações na ordem que foi informado;
-Exiba os estados e suas populações em ordem alfabética;-------******
-Exiba o estado com o menor população e sua quantidade;
-Exiba o estado com a maior população e sua quantidade;
-Exiba a soma da população desses estados;
-Exiba a média da população deste dicionário de estados;
-Remova os estados com a população menor que 4.000.000;--------******
-Apague o dicionário de estados;
-Confira se o dicionário está vazio.
/* */

public class ExercicioPropostoMap01 {
    
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Criando um dicionario com estados e populacao: ");
        Map<String , Integer> dicionario = new HashMap<>(){{//chamar Integer p numeros
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(dicionario);

        System.out.println("Substitua a população do estado do RN por 3.534.165"); 
        dicionario.put("RN",3534165);
        System.out.println(dicionario);

        System.out.println("O estado PB está no dicionário: " + dicionario.containsKey("PB"));
        //caso não adicione: PB - 4.039.277??

        System.out.println("A populacao PE e: " + dicionario.get("PE"));
        dicionario.put("PB", 4039277);
        System.out.println(dicionario);

        System.out.println("Todos os estados e suas populacoes na ordem que foi informado: ");
        
        Map<String , Integer> dicionario1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> Dicionario : dicionario1.entrySet())
            System.out.println(Dicionario);
        
        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        //Map<String, Integer> dicionario2 = new TreeMap<>(dicionario1);
        //System.out.println(dicionario2);   

        System.out.println("O estado com menor populacao e: ");
        Integer MenorPopulacao = Collections.min(dicionario.values());
        Set<Map.Entry<String, Integer>> entries = dicionario.entrySet();
        String EstadoMenorPopulacao = "";

        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(MenorPopulacao)){
                EstadoMenorPopulacao = entry.getKey();
                System.out.println("O menor estado " + EstadoMenorPopulacao + " - " + MenorPopulacao);
            }
        }

        System.out.println("O estado com maior populacao: ");
        Integer MaiorPopulacao = Collections.max(dicionario.values());
        Set<Map.Entry<String, Integer>> entrada = dicionario.entrySet();
        String EstadoMaiorPopulacao = "";

        for(Map.Entry<String, Integer> entry : entrada){
            if(entry.getValue().equals(MaiorPopulacao)){
                EstadoMaiorPopulacao = entry.getKey();
                System.out.println("O menor estado " + EstadoMaiorPopulacao + " - " + MaiorPopulacao);
            }
        }

        Iterator<Integer> iterator = dicionario.values().iterator();
        int soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma da populacao desses estados e: " + soma);

        System.out.println("Exiba a média dos estados: " + (soma/dicionario.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator1 = dicionario.values().iterator();
        while(iterator1.hasNext()){
            if((iterator1.next()) > 4000000) iterator1.remove();
        }
        System.out.println(dicionario);

        System.out.println("Apagar o dicionario: ");
        dicionario.clear();

        System.out.println("Confira se o dicionario esta vazio: "+ dicionario.isEmpty());
        
    
    }    
}
