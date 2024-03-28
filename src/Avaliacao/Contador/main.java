package Avaliacao.Contador;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.println("Digite um valor para contador:");
        contador.valor = leia.nextInt();

        contador.incrementar();
        contador.exibirValor();
    }
}
