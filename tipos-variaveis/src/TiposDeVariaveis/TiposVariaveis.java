package TiposDeVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        

            //tipos primitivos
            //estudem a classe String que representa texto na aplicação

            String nome = "Jefferson De Souza Ramos ";
            System.out.println(nome);


            @SuppressWarnings("unused")
            double salarioMinimo = 2.55;
            short numeroCurto =1;
            int numeroNormal = numeroCurto;
            @SuppressWarnings("unused")
            short numeroCurto2 = (short) numeroNormal;

            int numero = 5;

            numero =10;

            System.out.println(numero);

            final double VALOR_DE_PI =3.14;

            System.out.println(VALOR_DE_PI);

            

        }
}
