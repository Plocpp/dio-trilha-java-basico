public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("19000000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o cep não corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();
        //simulando um cep formatado
        return "19.100-000";
    }
    
}
