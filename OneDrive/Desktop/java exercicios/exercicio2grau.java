import java.util.Scanner;

public class exercicio2grau {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int a, b, c, delta, d = -4;
    double x1, x2;

    System.out.print("Digite o valor de a: ");
    a = ler.nextInt();

    while (a == 0) {
      System.out.println("O valor de 'a' não pode ser igual a '0'");
      System.out.println("Digite novamente o valor de a: ");
      a = ler.nextInt();
    }

    System.out.print("Digite o valor de b: ");
    b = ler.nextInt();

    System.out.print("Digite o valor de c: ");
    c = ler.nextInt();

    System.out.println("Resolvendo o valor de Delta");

    System.out.println(b + "²" + d + "*" + a + "*" + c);

    delta = b * b - d * a * c;

    System.out.println("O delta é " + delta);

    if (delta < 0) {
      System.out.println("Não existe valor de x");
    } else {
      x1 = (-b + Math.sqrt(delta) / (2 * a));
      x2 = (-b - Math.sqrt(delta) / (2 * a));
      System.out.println("A raiz 1 é " + x1);
      System.out.println("A raiz 2 é " + x2);
    }

  }
}
