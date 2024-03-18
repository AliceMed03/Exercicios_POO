package Calculadora;

public class Main {
    public static void main(String[] args) {
        //Criando o objeto
        Calculadora calculadora = new Calculadora();
        double resultado = 0;
        //Chamando os métodos
        resultado = calculadora.somar(10,10);
        System.out.println("A soma é:" + resultado);

        resultado = calculadora.subtrair(10,10);
        System.out.println("A subtração é:" + resultado);

        resultado = calculadora.multiplicar(10,10);
        System.out.println("A multiplicação é:" + resultado);

        resultado = calculadora.dividir(10,10);
        System.out.println("A divisão é:" + resultado);



    }
}
