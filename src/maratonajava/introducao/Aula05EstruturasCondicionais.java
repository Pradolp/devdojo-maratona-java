package maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // if idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        String categoria;
        if (idade >= 18) {
            categoria = "Categoria Adulto";
        } else if (idade >= 15) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Cat Infantil";
        }
        System.out.println(categoria);

    }
}
