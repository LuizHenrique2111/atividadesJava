import java.util.Scanner;

public class imc {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("PESO IDEAL\n");

    String sexo;
    double peso, altura;

    System.out.print("Qual o seu sexo?(Masculino, Feminino): ");
    sexo = ler.next();

    switch (sexo) {
      case "Masculino":
        System.out.print("\nDigite a sua altura: ");
        altura = ler.nextDouble();
        peso = (72.7 * altura) - 58;
        System.out.println("O seu peso ideal é " + peso);
        break;
      case "Feminino":
        System.out.print("\nDigite a sua altura: ");
        altura = ler.nextDouble();
        peso = (62.1 * altura) - 44.7;
        System.out.println("O seu peso ideal é " + peso);
        break;
      default:
        System.out.print("\n\nSexo inserido incorretament!");
        break;
    }

  }
}
