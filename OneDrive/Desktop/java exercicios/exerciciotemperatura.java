import java.util.Scanner;

public class exerciciotemperatura {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    Double tC, tF;

    System.out.println("CONVERSOR DE TEMPERATURA(CELSIUS --> FAHREINHEINT");

    System.out.print("Insira um temperatura em Celsius: ");
    tC = ler.nextDouble();

    tF = (tC * 1.8) + 32;

    System.out.printf("A temperatura em Fahreinheint é de: %f", tF);

  }
}
