import java.time.LocalDate; 

public class Cliente {
    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private String endereco;

    public Cliente(String nome, String CPF, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        String nomeAnterior = this.nome;
        this.nome = nome;
        System.out.println("Operação realizada com sucesso. Nome alterado de " + nomeAnterior + " para " + this.nome);
    }

    public String getCPF(){
        return this.CPF;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        String enderecoAnterior = this.endereco;
        this.endereco = endereco;
        System.out.println("Operação realizada com sucesso. Nome alterado de " + enderecoAnterior + " para " + this.endereco);
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }
}