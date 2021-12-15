public class Notificacao {
    
    public void mandaNotificacao(String operacao, double valor) {
        System.out.println("----- Enviando notificação -----");
        System.out.println("Operação: " + operacao);
        System.out.println("Valor: " + valor);
        System.out.println("----- Notificação enviada -----");
    }

}