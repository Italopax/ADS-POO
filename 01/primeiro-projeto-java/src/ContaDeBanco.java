public class ContaDeBanco {
    int agencia = 1110;
    int numero = 308000;
    String nomeCliente = "Italo";
    float saldo = 150.00F;

    public float saca(){
        float valor = 100;
        saldo-=valor;
        return saldo;
    };

    public boolean deposita(float valor){
        boolean retornoDeposita = true;
        saldo+=valor;
        return retornoDeposita;
    };
}
