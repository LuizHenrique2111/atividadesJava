import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    Double n1, n2, res;
    String op;

    System.out.println("CALCULADORA");

    System.out.print("Primeiro número: ");
    n1 = ler.nextDouble();

    System.out.print("Escolha uma operação(+,-,*,/): ");
    op = ler.next();

    System.out.print("Segundo número: ");
    n2 = ler.nextDouble();

    switch (op) {
      case "+":
        res = n1 + n2;
        System.out.println("O resultado de " + n1 + " " + op + " " + n2 + " é " + res);
        break;
      case "-":
        res = n1 - n2;
        System.out.println("O resultado de " + n1 + " " + op + " " + n2 + " é " + res);
        break;
      case "*":
        res = n1 * n2;
        System.out.println("O resultado de " + n1 + " " + op + " " + n2 + " é " + res);
        break;
      case "/":
        res = n1 / n2;
        System.out.println("O resultado de " + n1 + " " + op + " " + n2 + " é " + res);
        break;
      default:
        System.out.println("Você inseriu um operador inexistente!");
        break;

    }

  }
}
