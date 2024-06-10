import java.util.Date;

public class PessoaFisica extends Cliente {

    private String CPF;
    private char SEX;
    private int IDD;

    public PessoaFisica(String name, String addres, Date data, String CPF, char SEX, int IDD) {

        super(name, addres, data);

        this.CPF = CPF;
        this.SEX = SEX;
        this.IDD = IDD;

    }

    void imprimir() {

        System.out.println("Nome da pessoa: " + getNome());
        System.out.println("Sexo da pessoa: " + SEX);
        System.out.println("Idade da pessoa: " + IDD);

        System.out.println("CPF da pessoa: " + cpf);

        System.out.println("Endereço da pessoa: " + getEndereco());
        System.out.println("Data de Cadastro feito pela pessoa: " + getData());

    }



        public String getCPF(){

        return CPF;

        }
        public void setCPF(String CPF){

        this.CPF = CPF;

        }



        public int getIDD(){

        return IDD;

        }
        public void setIDD(int IDD){

        this.IDD = IDD;

        }  



        public char getSEX(){

        return SEX;

        }
        public void setSEX(char sexo){

        this.SEX = SEX;

        }

        public String toString() {


            String pFisicaStr = "Nome: " + this.nome + "\n"
                    + "Idade: " + this.idade + "\n"
                    + "Sexo: " + this.sexo + "\n"
                    + "Endereco: " + this.endereco + "\n"
                    + "Data da criacao: " + this.data + "\n"
                    + "CPF: " + this.cpf;
    
                    return pFisicaStr;

        }

        public boolean equals(PessoaFisica var){

            if(this.cpf == var.cpf){
                 return true;
            }
            else{
            return false;
            }
            
        }

}