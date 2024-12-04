package victor.aulasjava.introducao;

public class Aula4Operadors {
    public static void main(String[] args){

        // + - / *

        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero2/numero1);
        System.out.println(numero2-numero1);
        System.out.println(numero1+numero2);
        System.out.println(numero1*numero2);



        // Em Java, tudo quando se começa com uma String, tudo que vier depois e ouver um operador, sera considerado concatenação.
        System.out.println("Valor: "+numero2+numero1);

        //Isso também serve para caso venha uma operação antes. Ele realizara a operação, mas quando chagar na String ele seguira a regra anterior.
        System.out.println(numero1+numero2 + "Valor: "+numero2+numero1);

        //O resultado também pode ser guardado dentro de uma nova varivel
        int resultado = numero2+numero1;

        System.out.println(resultado);

        //Operadores de Resto %

        int resto = 21 % 7;

        System.out.println("O resto da divisão de 21 por 7 é igual a "+ resto);

        //Operadores logicos, retornam sempre um valor booleano, são eles < e >, <= e >=, == e !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenosQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenosQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);


        // (and) && (or) ||  (not) !

        int age = 20;
        float salario = 4000F;
        boolean isDentroDaLei = age >= 30 && salario >= 4612;
        System.out.println("É "+isDentroDaLei+" que o salario do imigrante esta dentro da lei.");

        boolean isDentroDaLeiMenor = age < 30 && salario >= 3381;
        System.out.println("É "+isDentroDaLeiMenor +" que o salario do imigrante esta dentro da lei.");


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPs5 = 5000F;
        boolean isPs5Compravel = valorTotalContaCorrente >= valorPs5 || valorTotalContaPoupanca >= valorPs5;

        System.out.println("É possivel compra o Ps5 o com o saldo da sua conta? "+isPs5Compravel);


    }
}
