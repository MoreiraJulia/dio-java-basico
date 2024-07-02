public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Tipos e Variáveis");
        //Byte | valor mínimo de -128 e máximo de 127
        byte num = 1;
        System.out.println("Byte " + num);
        //Short | valor mínimo de -32.768 e máximo de 32.767
        short num2 = 30254;
        System.out.println("Short " + num2);
        //Int | valor mínimo de -2.147.483.648 e máximo de 2.147.483.647
        int num3 = 251478;
        System.out.println("Int " + num3);
        //Long | valor mínimo de -9.223.372.036.854.775.808 e máximo de 9.223.372.036.854.775.807
        long num4 = 962515187857488625L;
        System.out.println("Long " + num4);
        //Float | valor mínimo de -3,4028E + 38 e máximo de 3,4028E + 38
        float num5 = 2.5174f;
        System.out.println("Float " + num5);
        //Double | valor mínimo de -1,7976E + 308 e máximo de 1,7976E + 308
        double num6 = 2.5147;
        System.out.println("Double " + num6);
        //Constante
        final double VALOR_DE_PI = 3.14;  
        System.out.println("Final Double " + VALOR_DE_PI);
        //String 
        String name = "Júlia";
        System.out.println("String " + name);
        //Char - apenas 1 caractere
        char caractere = 66;
        System.out.println("Char " + caractere);
    }
}
