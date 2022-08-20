import java.util.Scanner;

public class exerciciomedia {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int a1, a2, a3;
    String nome;

    System.out.println("MÉDIA ARITMÉTICA");

    System.out.printf("Insira seu nome: ");
    nome = ler.next();

    System.out.print("Informe o primeiro valor: ");
    a1 = ler.nextInt();

    System.out.print("Informe o segundo valor.: ");
    a2 = ler.nextInt();

    System.out.print("Informe o terceiro valor.: ");
    a3 = ler.nextInt();

    int res = (a1 + a2 + a3) / 3;

    System.out.printf("Olá %s, segue a média dos valores inseridos --> %d", nome, res);
  }
}