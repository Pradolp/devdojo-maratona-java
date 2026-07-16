package maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicionaisSwitchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana. Sendo 1 domingo e 7 sabado");
        byte dia = sc.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Valor inválido digite um número entro 1 a 7");
                break;
        }
    }
}
