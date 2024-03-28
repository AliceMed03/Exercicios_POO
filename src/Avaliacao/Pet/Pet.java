package Avaliacao.Pet;

public class Pet {
    String nome;
    String especie;
    Integer idade;
    public void exibirInformacoes(){
        System.out.println("Nome:" + nome);
        System.out.println("Espécie:" + especie);
        System.out.println("Idade:" + idade + " anos");
    }
}
