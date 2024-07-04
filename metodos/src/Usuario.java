public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume da televisão? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status - Volume da televisão? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status - Volume da televisão? " + smartTv.volume);

        smartTv.novoCanal(28);
        System.out.println("Novo status - Canal atual? " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo status - Canal atual? " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Novo status - Canal atual? " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

    }
}
