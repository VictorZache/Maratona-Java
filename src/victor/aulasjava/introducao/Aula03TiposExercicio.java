package victor.aulasjava.introducao;


/*Exercício 1: Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço> ,
confirmo que recebi o salario de <salario> na data <data>*/

public class Aula03TiposExercicio  {
    public static void main (String[] args) {
        String nome = "João";
        String endereco = "Avenida Hidelbrando n°30";
        double salario = 1589.99;
        String dataSalario = "28/01";
        String relatorio = "Eu "+ nome+", morando no endereço " + endereco+", confirmo que recebi o salario de "+salario+" na data "+dataSalario;
        System.out.println(relatorio);
    }
}
