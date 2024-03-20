package Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a altura:");
        double altura = leia.nextDouble();

        System.out.println("Digite a largura:");
        double largura = leia.nextDouble();

        retangulo.calcularArea(altura,largura);
    }
}
