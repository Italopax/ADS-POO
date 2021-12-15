import java.time.LocalDate; 
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("Italo Paixão", "14119416430", LocalDate.parse("2003-06-27"), new Endereco("Avenida", 66, "Centro", "Paulistana", "PI"));

        Conta conta1 = new Conta(11100, 559991, cliente1);
        Conta conta2 = new Conta(22202, 666888, cliente1);

        // cliente1.addEndereco(new Endereco("Rua ...", 70, "Centro", "Paulistana", "PI"));
        // System.out.println(cliente1.getEnderecos());
        // cliente1.removeEndereco(new Endereco("Rua ...", 70, "Centro", "Paulistana", "PI"));
        // System.out.println(cliente1.getEnderecos());
        
        conta1.depositar(7120);
        conta1.sacar(720);
        conta1.transferir(conta2, 720);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}