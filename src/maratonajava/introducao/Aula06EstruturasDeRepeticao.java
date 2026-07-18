package maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*while (true) {
            System.out.println("Digite um num");
            int num = sc.nextInt();
            if (num == 8) {
                System.out.println("Num certo");
                break;
            }
        }*/

        int numTotal = 1000;

        for (int i = 0; i < numTotal; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
