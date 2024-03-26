package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Nome do cachorro:");
        String nome = leia.next();
        System.out.println("Idade:");
        int idade = leia.nextInt();

        Cachorro pug = new Cachorro(nome, idade);

        pug.exibirDetalhes();

        System.out.println("Digite o nome do gato:");
        nome = leia.next();
        System.out.println("Idade:");
        idade = leia.nextInt();

        Gato garfield = new Gato(nome,idade);

        System.out.println("Digite o som do gato:");
        String som = leia.next();

        garfield.emitirSom(som);
        garfield.exibirDetalhes();

    }
}
