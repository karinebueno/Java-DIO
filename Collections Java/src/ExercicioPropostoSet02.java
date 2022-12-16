import java.util.*;
import java.util.Comparator;

public class ExercicioPropostoSet02 {

    public static void main(String [] args) {

        

        System.out.println("Ordem aleatoria: ");
        Set<LinguagemFavorita> treslinguagens = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 80 , "Visual Studio"));
            add(new LinguagemFavorita( "Python", 90 , "IntteliJ"));
            add(new LinguagemFavorita("C++",  85 , "Eclipse"));

        }};
        System.out.println(treslinguagens);

        System.out.println("A. Ordem de insercao: ");
        Set<LinguagemFavorita> treslinguagens1 = new LinkedHashSet<>( 
            Arrays.asList(
                new LinguagemFavorita("Java", 80 , "Visual Studio"),
                new LinguagemFavorita("Python", 90 , "IntteliJ"),
                new LinguagemFavorita("C++", 85 , "Eclipse")
            )
        );
        for (LinguagemFavorita linguagem: treslinguagens1) System.out.println(linguagem);

        System.out.println("B. Ordem natural (nome): ");
        Set<LinguagemFavorita> treslinguagens2 = new TreeSet<>(treslinguagens);
        for (LinguagemFavorita linguagem: treslinguagens2) System.out.println(linguagem);

        System.out.println("Ordem IDE: ");
        Set<LinguagemFavorita> treslinguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        treslinguagens3.addAll(treslinguagens1);
        for (LinguagemFavorita linguagem: treslinguagens3) System.out.println(linguagem);
        
        System.out.println("Odem Ano de Criacao e Nome: ");
        Set<LinguagemFavorita> treslinguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        treslinguagens4.addAll(treslinguagens1);
        for (LinguagemFavorita linguagem: treslinguagens4) System.out.println(linguagem);
        
        System.out.println("Odem Nome, ano de criacao e IDE: ");
        Set<LinguagemFavorita> treslinguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        treslinguagens5.addAll(treslinguagens1);
        for (LinguagemFavorita linguagem : treslinguagens5) System.out.println(linguagem);

    
}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String ide;
    

    public LinguagemFavorita(String nome, Integer anoDeCriacao , String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
        
    }
    
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao , ide);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemfavorita) {
        return this.nome.compareTo(linguagemfavorita.nome);
    }


}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
