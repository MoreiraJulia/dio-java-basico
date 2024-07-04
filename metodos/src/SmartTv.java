public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //LIGADA
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    //CANAL
    public void novoCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    //VOLUME
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}
