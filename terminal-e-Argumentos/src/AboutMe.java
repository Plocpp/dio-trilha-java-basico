import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //os argumentosd comceçam com o indice 0
            /*String nome = args [0];
            String  sobreNome = args [1];
            int idade = Integer.valueOf(args[2]);//vamos falar sobre Wrappers
            double altura = Double.valueOf(args [3]);
*/
            System.out.println("Digite seu Nome :");
            String nome  = scanner.next();

            System.out.println("Digite seu Sobrenome :");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade :");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura :");
            double altura = scanner.nextDouble();

            //imprimindo dados obtidos pelo usuario
            System.out.println("Olá me chamo "+nome+" "+sobreNome);
            System.out.println("Tenho "+ idade +" anos");
            System.out.println("Minha altura é "+ altura +" cm");
        }

    }
}
