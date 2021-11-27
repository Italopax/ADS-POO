import java.time.LocalDate; 
import java.util.Date;
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Italo Paixão", "14119416430", LocalDate.parse("2003-06-27"), "Avenida, Paulistana-PI");
        Conta conta1 = new Conta(11100, 559991, cliente1);
        
        cliente1.setNome("Sales");
        cliente1.setEndereco("Picos");

        System.out.println("CLIENTE:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCPF());
        System.out.println("Data de nascimento: " + cliente1.getDataNascimento());
        System.out.println("Endereço: " + cliente1.getEndereco());

        System.out.println("");
        System.out.println("CONTA:");
        System.out.println("Agência: " + conta1.getAgencia());
        System.out.println("Número: " + conta1.getNumero());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Cliente: " + conta1.getCliente().getNome());

    }
}