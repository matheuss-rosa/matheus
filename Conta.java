import java.util.Arrays;

public class Conta {

        private Cliente dono;
        private int saldo;
        private int limite;
        public static int contas = 0;

    public Conta (Cliente dono, int saldo, int limite) {

        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;

        contas ++;

    }


    private double saldo = 15000;
    private int acumul = 0;
    private Operacao[] operacoes = new Operacao[1500];

    boolean depositar (double valorDeposito) {

        if (valorDeposito > 0) {

            this.saldo += valorDeposito;

            fDeposito deposit = new fazerDeposito(valorDeposito);
            operacoes[acumul] = deposit;

            acumul++;
            return true;

        } else {

            return false;

        }

    }


    boolean sacar (double valorSaque) {

        if (valorSaque <= saldo) {

            this.saldo -= valorSaque;

            fazerSaque whithdraw = new fazerSaque(valorSaque);
            operacoes[acumul] = whithdraw;

            acumul++;
            return true;

        } else {

            return false;

        }
    }


    public void extrato(){

        for(int i = 0; i < acumul; i++){

           operacoes[i].imprimirExtrato();

        }

    }

    public String toString(){

        String accountsTr = "Conta " + "numero " + contas + "\n"
        + "Dono: " + this.dono.getDono() + "\n"
        + "Saldo: " + this.saldo + "\n"

        return accountsTr;

    }



    public Cliente getDono(){

        return this.dono;

    }
    public void setDono(Cliente dono) {

        this.dono = dono;

    }



    public Operacao[] getOperacoes(){

        return this.operacoes;

    }


    public double getSaldo() {

        return saldo;

    }
    
    public boolean equals(Conta object){

        if(this.contas == object.contas){

        return true;

        }
        return false;
        
    }



    
}