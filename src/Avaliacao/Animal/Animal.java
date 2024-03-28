package Avaliacao.Animal;

public class Animal {
    String nome;
    String tipo;
    Integer idade;

    public void emitirSom(String som){
        System.out.println("O som que o " + tipo + " faz é:" + som);
    }
}
