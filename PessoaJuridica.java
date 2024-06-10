import java.util.Date;
import java.util.Enumeration;

public class PessoaJuridica extends Cliente {

    pvriate int funcionarios;
    private String setor;
    private String cnpj;

    public PessoaJuridica(String name, String addres, Date data, String cnpj, String setor, int funcionarios) {

        super(name, addres, data);
        this.CNPJ = cnpj;
        this.setor = setor;
        this.funcionarios = funcionarios;

    }

    void imprimir() {

        System.out.println("Nome do funcionario: " + getNome());
        System.out.println("Quantidade de Funcionarios: " + funcionarios);
        System.out.println("CPF do funcionario: " + CNPJ);
        System.out.println("Endereço do funcionario: " + getEndereco());
        System.out.println("Data de cadastro feito pelo funcionario: " + getData());
        System.out.println("Setor do funcionario: " + setor);

    }

        public String getCNPJ(){
        return CNPJ;
        }
        public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
        }


        public int getFuncionarios(){
        return Funcionarios;
        }
        public void setFuncionarios(int funcionarios){
        this.funcionarios = funcionarios;
        }



        public String getSetor(){
        return setor;
        }
        public void setSetor(String setor){
        this.setor = setor;
        }

        public String getCnpj(){
            return cnpj;
            }
            public void setCnpj(String cnpj){
            this.setor = cnpj;
            }

        public String toString(){

            String pJuridicaStr = "Nome: " + this.nome + "\n"
                    + "Setor: " + this.setor + "\n"
                    + "Funcionarios: " + this.numFuncionarios + "\n"
                    + "Endereco: " + this.endereco + "\n"
                    + "Criacao " + this.data + "\n"
                    + "CNPJ: " + this.cnpj;
    
                    return pJuridicaStr;
        }

        public boolean equals(PessoaJuridica var){

            if(this.cnpj == var.cnpj){
                 return true;
            }
            else{
            return false;
            }
            
        }
}