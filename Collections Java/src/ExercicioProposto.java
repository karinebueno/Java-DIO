
import java.util.*;

class ExercicioProposto{
    /*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
     * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média
     * e em que mês elas ocorreram (mostrar o mês por extenso: 1- Janeiro, 2-fevereiro e etc)
    */
    
   
    public static void main (String[] args) {
     /*System.out.println("Entre com as temperaturas medias dos 6 primeiros mese do ano: ");
    List<Double> temperaturamedia = new ArrayList<>();
    temperaturamedia.add(10.0);
    temperaturamedia.add(13.5);
    temperaturamedia.add(15.3);
    temperaturamedia.add(18.0);
    temperaturamedia.add(20.0);
    temperaturamedia.add(22.0);
    System.out.println(temperaturamedia);
 
    Iterator<Double> iterator = temperaturamedia.iterator();
    Double soma = 0d;
    while (iterator.hasNext()){
        Double next = iterator.next();
        soma+= next; // soma = soma + next
    }
    //System.out.println("Exiba a soma dos valores: " + soma);

    System.out.println("Exiba a media das temperaturas : " + (soma/temperaturamedia.size()));
     */
    //Scanner scan = new Scanner(System.in);
    List<Double> temperaturasSemestral = new ArrayList<Double>();
    double soma = 0.0;
    for (int i = 1; i <= 6; i++) {
        System.out.print("Qual a temperatura do mês " + i + ": ");
        double temp = scan.nextDouble();
        temperaturasSemestral.add(temp);
        soma += temp;
    }
    double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();
    System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
    System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
    System.out.println("----------");
    for (Double temp : temperaturasSemestral) {
        if(temp > mediaTemperaturasSemenstral) {
            int index = temperaturasSemestral.indexOf(temp);
            switch (index) {
                case 0:
                    System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                    break;
                case 1:
                    System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                    break;
                case 2:
                    System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                    break;
                case 3:
                    System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                    break;
                case 4:
                    System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                    break;
                case 5:
                    System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                    break;
                default:
                    break;
                    }
                }
            }
    }
}
    
