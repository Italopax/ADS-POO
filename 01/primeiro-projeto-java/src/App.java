public class App {
    public static void main(String[] args) throws Exception {
        ContaDeBanco conta = new ContaDeBanco();
        conta.deposita(150.00F);
        conta.saca();
    }
}