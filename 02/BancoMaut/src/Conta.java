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
    
    public boolean depositar(double deposito){
        if(deposito<=0){
            System.out.println("Essa operação não pôde ser realizada."); 
            return false;
        }
        saldo += deposito;
        System.out.println("Depósito executado com sucesso."); 
        getSaldo();
        return true;
    }

    public boolean sacar(double saque){
        if(saldo>=saque){
            saldo -= saque;
            System.out.println("Saque executado com sucesso.");
            return true;
        } else {
            System.out.println("Você não tem saldo suficiente para efetuar a operação.");
            return false;
        }
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

    public void transferir(Conta conta, float valor){
        if (this.sacar(valor)){
            conta.depositar(valor);
            System.out.println("Ao transferir " + valor + " R$, o valor do seu saldo é: " + this.saldo + " R$.");
            return;
        }
    }
}