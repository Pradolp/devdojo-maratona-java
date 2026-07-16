package maratonajava.introducao;

public class Aula05EstruturaCondicionaisOperadorTernario {
    public static void main(String[] args) {
        double salario = 10000.12;
        // Operador ternario = (condicao) ? (caso verdadeiro) : (caso falso)
        String msg1 = "Comprar um carro";
        String msg2 = "Tas liso puto vai estudar";
        String resultado = salario < 10000 ? msg2 : msg1;
        System.out.println(resultado);
    }
}
