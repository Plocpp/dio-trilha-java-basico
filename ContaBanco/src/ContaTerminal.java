import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso cliente usuario
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada
        
       // Utilizei try , pois o programa estava dando erro na palavra scanner,
       // pois não estava fechando corretamente,o try resolveu isso fechando o codigo
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor digite o número da Agência ! ");
            int numero = scanner.nextInt();

            System.out.println("Por favor digite o número da conta !");
            String agencia = scanner.next();

            //Fiz isso para consumir a nova linha deixada no buffer de entrada
            //estavá dando erro na leitura dos dados, então procurei uma forma 
            //de corrijir isso
            scanner.nextLine();

            System.out.println("Digite se nome completo por favor !");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor Digite o Saldo em Conta !");
            Double saldo = scanner.nextDouble();

            System.out.println("Olá Cliente "+nomeCliente+",");
            System.out.println("obrigado por criar uma  \n conta em nosso Banco, ");
            System.out.println("sua agência é: "+agencia+" conta: "+numero+", ");
            System.out.println("seu saldo R$"+saldo+" já está Disponivel para Saque");

            
            // tendo entendido o projeto, fiz esse codigo, espero ter realizado o desafio com exito!!!
        }
    }
}
