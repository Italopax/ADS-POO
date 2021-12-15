import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private List<Endereco> enderecos = new ArrayList<>();

    public Cliente(String nome, String CPF, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.enderecos.add(endereco);
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
    
    public List<Endereco> getEnderecos(){
        return enderecos;
    }
    
    public void addEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }
    
    public void removeEndereco(Endereco endereco){
        this.enderecos.remove(endereco);
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }
}