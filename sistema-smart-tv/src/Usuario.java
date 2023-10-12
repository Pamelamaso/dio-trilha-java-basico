public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?: " + smartTv.ligada);
        System.out.println("Canal ?: " + smartTv.canal);
        System.out.println("Volume ?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status da TV: "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status da TV: "+ smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status do Volume: "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status do Volume: " + smartTv.volume);

        smartTv.trocarCanal(13);
        System.out.println("Status do Canal: "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Diminuir um Canal: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Aumentar um Canal: " + smartTv.canal);

    }
}
