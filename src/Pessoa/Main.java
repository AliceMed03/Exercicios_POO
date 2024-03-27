package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        pessoa.nome = leia.next();

        System.out.println("Digite a sua idade:");
        pessoa.idade = leia.nextInt();

        pessoa.imprimirNomePessoa();
    }
}

