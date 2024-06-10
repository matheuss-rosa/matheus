import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Date data = new Date();

        PessoaFisica primeiraPessoa = new PessoaFisica("Mascafo", "Alberto Cintra", data, "111.111.111.01", 16, 'M');
        PessoaFisica segundaPessoa = new PessoaFisica("Supas", "Serrao", data, "222.222.222-22", 16, 'M');
        PessoaJuridica pessoaJuridic = new PessoaJuridica("Pastelaria Sucafo", "Rua do comercio", data, "11 111 111/0000-11", "Alimentacao", 10);



            Conta contaPrimeiraPessoa = new Conta(primeiraPessoa);
            Conta contaSegundaPessoa = new Conta(segundaPessoa);
            Conta contaPessoaJuridic = new Conta(pessoaJuridic);




            System.out.println ("\n Conta da pessoa 1 (Pessoa Fisica):");
            primeiraPessoa.imprimir();

            System.out.println ("\n Conta da pessoa 2 (Pessoa Fisica):");
            segundaPessoa.imprimir();

            System.out.println ("\n Conta da pessoa 3 (Pessoa Juridica):");
            pessoaJuridic.imprimir();




        contaPrimeiraPessoa.depositar(6500);
        contaSegundaPessoa.depositar(3000);
        contaPessoaJuridic.depositar(2500);


        contaPrimeiraPessoa.sacar(1000);
        contaPcontaSegundaPessoaF2.sacar(1200);
        contaPessoaJuridic.sacar(1400);

        
        System.out.println("\nConta " + primeiraPessoa.getNome());
        contaPrimeiraPessoa.extrato();

        System.out.println("\nConta " + segundaPessoa.getNome());
        contaSegundaPessoa.extrato();

        System.out.println("\nConta " + pessoaJuridic.getNome());
        contaPessoaJuridic.extrato();

        System.out.println("Media: " + Operacao.totalOperacoes/Conta.totalConta);
}
}