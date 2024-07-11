public class ResultadoEscolar {
    public static void main(String[] args) {
        //Estrutura condicional encadeada
        // int nota = 4;
        // if(nota >= 7)
        //     System.out.println("Aprovado");
        // else if(nota >=5 && nota < 7)
        //     System.out.println("Recuperação");
        // else  
        //     System.out.println("Reprovado");

        //Estrutura condicional ternária

        int nota = 3;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
