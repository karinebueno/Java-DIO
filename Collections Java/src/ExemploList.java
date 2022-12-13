import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class ExemploList {
   
    public static void main (String[] args) {
        //Dada uma lista com 7 notas de um aluno (7, 8.5, 9.3, 5, 7, 0, 3.6), faça:
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5.0));
        System.out.println("Exiba todas as notas na ordem em que forem informados: ");
        for(Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next; // soma = soma + next
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));//size mostra a quantidade de elementos dentro da lista

        System.out.println("Remova a nota 0: " );
        notas.remove(0d);//se colocar so 0, remove na posicao 0, pra remover o elemento 0 poe 0.d ou 0.0
        System.out.println(notas);

        System.out.println("Remova a nota da posicao 0: " );
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //System.out.println("Apague toda a lista");
        //notas.clear();
        //System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

        /* Resolva utilizando os métodos da implementação LinkedList
         * System.out.println("Crie uma lista chamada notas2"+ "e coloque todos os elementos da List ArrayList nessa nova lista:");
         * System.out.println("Mostre a primeira nota da nova lista sem removê-lo");
         * System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
         */

        List<Double> notas2 = new LinkedList<>();
        notas2 = notas;
        System.out.println("A lista de notas 2 é: " + notas2);

        System.out.println("a primeira nota e: " + notas.get(0));

        System.out.println("Remova a nota da posicao 0: " );
        notas.remove(0);
        System.out.println(notas2);


    }
}