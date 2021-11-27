public class Conta { 
    private int agencia;  
    private int numero;   
    private double saldo;
    private Cliente cliente;

    public Conta(int agencia, int numero, Cliente cliente){
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }
    
    public void depositar(double deposito){
        if(deposito<=0){
            System.out.println("Essa operação não pôde ser realizada."); 
            return;
        }
        saldo += deposito;
        System.out.println("Operação executada com sucesso."); 
        getSaldo();
    }

    public void sacar(double saque){
        if(saldo>=saque){
            saldo -= saque;
            System.out.println("Operação executada com sucesso.");
        } else {
            System.out.println("Você não tem saldo suficiente para efetuar a operação.");
        }
        getSaldo();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void transferir(){
        
    }
    
}

// deposito negativo  **
// não tem set dos atributos, mas tem os gets  **
// passar os atributos com o constructor  **
// transferencia: transferir apenas da sua para outra