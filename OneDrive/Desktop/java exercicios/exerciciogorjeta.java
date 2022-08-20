import java.util.Scanner;

public class exerciciogorjeta {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("GORJETA \n");

    System.out.println("MENU");

    System.out.println("Comida\n1- Macarrão -- R$39,90\n2- Lasanha -- R$29,90");

    System.out.println("Bebida\n1- Coca-Cola -- R$9,90\n2- Suco de Laranja -- R$6,90\n");

    double c, b, g;

    System.out.print("Escolha uma comida do Menu(1 ou 2): ");
    c = ler.nextDouble();

    System.out.print("Escolha uma bebida do Menu(1 ou 2): ");
    b = ler.nextDouble();

    if (c == 1 && b == 1) {
      g = (39.90 + 9.90) * 0.1;
      System.out.println("A gorjeta do garçom será de " + g);
    } else if (c == 1 && b == 2) {
      g = (39.90 + 6.90) * 0.1;
      System.out.println("A gorjeta do garçom será de " + g);
    } else if (c == 2 && b == 1) {
      g = (29.90 + 9.90) * 0.1;
      System.out.println("A gorjeta do garçom será de " + g);
    } else if (c == 2 && b == 2) {
      g = (29.90 + 6.90) * 0.1;
      System.out.println("A gorjeta do garçom será de " + g);
    } else {
      System.out.println("Insira 1 ou 2 nas opções.");
    }

  }
}
