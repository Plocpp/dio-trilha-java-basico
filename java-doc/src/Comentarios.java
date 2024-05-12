public class Comentarios {
    // Olá eu sou o comentario em uma unica linha
    /* Olá
     * eu sou o um comentario
     * e posso ser mais detalhado
     * quando necessário
     */


    /**
     * estas estrelinhas aqui acima
     * é para identificar que você
     * pretende elaborar um comentario
     * á nivel de documentação.
     * Que incrivel!!!
    */
    public void metodo(){
}
/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 */
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}
// No terminal execute o comando abaixo



}
