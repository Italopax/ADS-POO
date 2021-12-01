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
        System.out.println("Depósito executado com sucesso."); 
        getSaldo();
    }

    public void sacar(double saque){
        if(saldo>=saque){
            saldo -= saque;
            System.out.println("Saque executado com sucesso.");
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

    public void transferir(Conta conta, float valor){
        if(valor <= 0) {
            System.out.println("O valor a ser transferido não pode ser igual ou inferior a 0.");
            return;
        }
        if(this.saldo < valor) {
            System.out.println("No momento, o seu saldo é insuficiente para fazer essa transferência.");
            return;
        }
        this.saldo -= valor;
        conta.receberTranferencia(valor);
        System.out.println("Ao transferir " + valor + " R$, o valor do seu saldo é: " + this.saldo + " R$.");
    }

    public void receberTranferencia(float valor){
        this.saldo += valor;
    }   
}