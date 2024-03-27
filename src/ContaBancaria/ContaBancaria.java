package ContaBancaria;

public class ContaBancaria {
    String titular;
    double saldo=0;
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void saque (double valor){
        if(valor <= saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso! Saldo atual:" + this.saldo);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
}
