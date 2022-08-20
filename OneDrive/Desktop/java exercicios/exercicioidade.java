import java.util.Scanner;

public class exercicioidade {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    int anoN, anoAtual;
    String nome;

    System.out.printf("Insira seu nome: ");
    nome = ler.next();

    System.out.print("Qual o ano de seu nascimento? ");
    anoN = ler.nextInt();

    System.out.print("Em que ano estamos? ");
    anoAtual = ler.nextInt();

    int res = anoAtual - anoN;

    System.out.printf("Olá %s, sua idade é %d%n", nome, res);

    int res2 = 2050 - anoN;

    System.out.printf("Em 2050 sua idade será de %d%n", res2);

    // if (anoFuturo < anoAtual) {
    // System.out.printf("Sua idade era de %d", nome, res2);
    // } else {
    // System.out.printf("Sua idade será de %d", nome, res2);
    // }
  }
}