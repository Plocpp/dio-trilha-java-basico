public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();
        

        System.out.println( "Canal atual "+smartTv.canal);
        smartTv.mudarDeCanal(17);
        System.out.println("canal Atual "+smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual : " +smartTv.volume);
        smartTv.aumentarVoluma();
        System.out.println("Volume Atual : "+ smartTv.volume);

        System.out.println("TV Ligada : " +smartTv.ligada);
        System.out.println("Canal Atual : " +smartTv.canal);
        System.out.println("Volume Atual :" +smartTv.volume);

        smartTv.Ligar();
        System.out.println("Novo Status da TV  :" + smartTv.ligada);

        smartTv.Desligar();
        System.out.println("Novo Status da TV " +smartTv.ligada);
    }
}
