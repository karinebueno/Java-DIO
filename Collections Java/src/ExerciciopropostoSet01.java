
import java.util.*;


public class ExerciciopropostoSet01 {
    
    public static void main(String[] args){
        System.out.println("As cores do arco-iris: ");
        Set<String> coresarcoiris = new HashSet<>();
        coresarcoiris.add("vermelho" + "\n");
        coresarcoiris.add("laranja" + "\n");
        coresarcoiris.add("amarelo"+ "\n");
        coresarcoiris.add("verde"+ "\n");
        coresarcoiris.add( "azul"+ "\n");
        coresarcoiris.add("anil"+ "\n");
        coresarcoiris.add("violeta"+ "\n");
        System.out.println(coresarcoiris);

        System.out.println("A. Exiba todas as cores uma abaixo da outra: ");
        for(String cor : coresarcoiris) {
            System.out.println(cor);
        }

        System.out.println("B. A quantidade de cores que o arco-iris tem: ");
        Iterator<String> iterator = coresarcoiris.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            iterator.next();
            count++;
        }
        System.out.println(count);

        System.out.println("C. Exiba as cores em ordem alfabetica: ");
        Set<String> coresarcoiris1 = new TreeSet<>(coresarcoiris);
        System.out.println(coresarcoiris1);
    

        System.out.println("D. Exiba as cores na ordem inversa da que foi informada: " );
        Set<String> coresarcoiris2 = new LinkedHashSet<>(
            Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println(coresarcoiris2);
        List<String> coresarcoirisList = new ArrayList<>(coresarcoiris2);
        Collections.reverse(coresarcoirisList);
        System.out.println(coresarcoirisList);;


        System.out.println("E. Exiba as cores que comecam com a letra v: ");
        for(String cor : coresarcoiris){
            if(cor.startsWith("v")) System.out.println(cor);
        }
        

        System.out.println("F. Remova todas as cores que nao comecam com a letra v");
        Iterator<String> iterator1 = coresarcoiris.iterator();
        while(iterator1.hasNext()){
           if (iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(coresarcoiris);

        System.out.println("G. Limpe o conjunto");
        coresarcoiris.clear();

        System.out.println("H. Confira se o conjunto esta vazio " + coresarcoiris.isEmpty()); 

    }
    
}