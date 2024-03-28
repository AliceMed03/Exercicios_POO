package Avaliacao.Animal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do animal:");
        animal.nome = leia.next();
        System.out.println("Digite o tipo do animal:");
        animal.tipo = leia.next();
        System.out.println("Digite a idade do animal:");
        animal.idade = leia.nextInt();
        System.out.println("Digite o som do animal:");
        String som = leia.next();

        animal.emitirSom(som);
    }
}
