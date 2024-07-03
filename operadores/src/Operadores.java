public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero); // -5

        //incrementando numero em mais 1 numero
        numero ++;
        System.out.println(numero); //6

        //incrementando numero em mais 1 numero 
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        //Seria o contrário como o não verdadeiro que é falso
        System.out.println("Inverteu " + !verdadeiro);

        int a, b;
        a = 5;
        b = 6;
        // String resultado = "";
        // if(a==b)
        //     resultado = "Verdadeiro";
        // else
        //     resultado = "Falso";
        
        // System.out.println(resultado);

        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
