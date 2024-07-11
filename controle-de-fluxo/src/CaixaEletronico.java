public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valosSolicitado = 17.0;

        if(valosSolicitado < saldo)
            saldo = saldo - valosSolicitado;

        System.out.println(saldo);
    }
}
