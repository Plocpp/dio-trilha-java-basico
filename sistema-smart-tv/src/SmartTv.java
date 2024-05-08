public class SmartTv {
    boolean ligada =false;
    int canal =1;
    int volume =25;

    public void mudarDeCanal(int novoCanal){

        canal = novoCanal;
    }

    public void aumentarVoluma(){

        volume ++;
        System.out.println("aumentando o volume para "+volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("diminuindo o Volume para " +volume);
    }

    public void Ligar(){
        ligada =  true;
    }
    public void Desligar(){
        ligada = false ;

    }
    
    
}
