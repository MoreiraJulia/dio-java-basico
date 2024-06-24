package edu.julia.primeirasemana;
public class MinhaClasse {
  public static void main (String [] args){
    String primeiroNome = "Júlia";
    String segundoNome = "Moreira";
    int idade = 20;
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, idade);

    System.out.println(nomeCompleto);
  }
  public static String nomeCompleto (String primeiroNome, String segundoNome, int idade){
    return "Meu nome é: " + primeiroNome.concat(" ").concat(segundoNome).concat(" e tenho ") + idade + " anos";
  }

}
