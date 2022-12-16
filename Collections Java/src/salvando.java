
import java.util.*;


public class salvando {
    
    public static void main(String[] args){
        System.out.println("A. Exiba todas as cores uma abaixo da outra: ");
        Set<ArcoIris> coresarcoiris = new HashSet<>();
        coresarcoiris.add("vermelho" + "\n");
        coresarcoiris.add("laranja" + "\n");
        coresarcoiris.add("amarelo"+ "\n");
        coresarcoiris.add("verde"+ "\n");
        coresarcoiris.add( "azul"+ "\n");
        coresarcoiris.add("anil"+ "\n");
        coresarcoiris.add("violeta"+ "\n");
        System.out.println(coresarcoiris);

        System.out.println("B. A quantidade de cores que o arco-iris tem: ");
        Iterator<ArcoIris> iterator = coresarcoiris.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            iterator.next();
            count++;
        }
        System.out.println(count);

        System.out.println("C. Exiba as cores em ordem alfabetica: ");
        Set<ArcoIris> coresarcoiris1 = new TreeSet<>(new ComparatorCores());
        System.out.println(coresarcoiris1);
        coresarcoiris1.addAll(coresarcoiris);
        for (ArcoIris arcoiris: coresarcoiris1) System.out.println(arcoiris.getCores() + " - ");

        //System.out.println("D. Exiba as cores na ordem inversa da que foi informada: " );
       // Set<String> coresarcoiris2 = new LinkedHashSet<>(
        //    Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        //System.out.println(coresarcoiris2);
        //List<String> coresarcoirisList = new ArrayList<>(coresarcoiris2);
        //Collections.reverse(coresarcoirisList);
        //System.out.println(coresarcoirisList);;


        //System.out.println("E. Exiba as cores que comecam com a letra v: ");
        //Iterator<ArcoIris> iterator1 = coresarcoiris.iterator();
        //while(iterator1.hasNext()){
           //ArcoIris next = iterator1.next();
           //if (iterator1.next().equals("vermelho")) iterator1.remove();
        //}
       // System.out.println(coresarcoiris);

        //System.out.println("F. Remova todas as cores que nao comecam com a letra v");

        //System.out.println("G. Limpe o conjunto");
        //coresarcoiris.clear();

        //System.out.println("H. Confira se o conjunto esta vazio" + coresarcoiris.isEmpty());
        


        //Set<ArcoIris> coresarcoiris2 = new TreeSet<>(new ComparatorCorescomv());
        //coresarcoiris2.addAll(coresarcoiris);
        //for (ArcoIris arcoiris: coresarcoiris2) System.out.println(arcoiris.getCores() + " - ");
        
       

    }
    
}

class ArcoIris implements Comparable<ArcoIris> {
    private String cores;

    public ArcoIris(String cores){
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return "{" +
                ", cores=" + cores +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores);
    }
    @Override
    public int compareTo(ArcoIris arcoiris) {
        return this.getCores().compareTo(arcoiris.getCores());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoiris = (ArcoIris) o;
        return cores.equals(arcoiris.cores);
    }
}

class ComparatorCores implements Comparator<ArcoIris>{
   @Override
    public int compare(ArcoIris c1, ArcoIris c2){
        int cores = c1.getCores().compareTo(c2.getCores());
        if(cores == 0) return cores;
        return cores;
    }
}
//class ComparatorCorescomv implements Comparator<ArcoIris>{
    
    //@Override
     //public int compare(ArcoIris c1, ArcoIris c2){
         //int cores = c1.getCores().compareTo(c2.getCores());
         //if(cores != 0) return cores;
         //return cores;

    // }
 
 
 //}