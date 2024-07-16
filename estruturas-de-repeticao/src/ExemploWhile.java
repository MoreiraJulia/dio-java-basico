// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        // Enquanto mesa for maior que 0
            while(mesada>0) {
                // Pegar um doce com valor aleatório
                Double valorDoce = valorAleatorio();
                // Se valor do doce for maior que da mesada
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }
    // Retorna um double
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(5, 17);
    }
}