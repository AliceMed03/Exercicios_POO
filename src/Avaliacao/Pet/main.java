package Avaliacao.Pet;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do pet:");
        pet.nome = leia.next();
        System.out.println("Digite a espécie do pet:");
        pet.especie = leia.next();
        System.out.println("Digite a idade do pet:");
        pet.idade = leia.nextInt();

        pet.exibirInformacoes();
    }
}
