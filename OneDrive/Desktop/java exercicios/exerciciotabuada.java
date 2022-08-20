import java.util.Scanner;

public class exerciciotabuada {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("TABUADA \n");
    int n, m = 1;

    System.out.print("Digite um número: ");
    n = ler.nextInt();

    while (m <= 10) {
      int res = n * m;
      System.out.println("O resultado de " + n + " x " + m + " é " + res);
      m++;
    }
  }
}
