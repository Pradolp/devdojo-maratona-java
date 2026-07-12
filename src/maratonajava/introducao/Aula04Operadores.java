package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *

        double a = 10;
        double b = 20;

        double resultAdd = 10 + 20;
        double resultSub = 10 - 20;
        double resultMult = 10 * 20;
        double resultDiv = 10 / (double) 20;

        // &&(AND) ||(OR)
        // Testando o debug
        boolean isTenBiggerThenFiveOrFour = 10 >= 4 || 10 >= 5;

        // Operadores de atribuição
        // = += -= *= /= %= ++
        int count = 1;
        count++;
        System.out.println("Contador = " + count);


    }
}
