import java.util.Scanner;

public class exerciciosalariominimo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double Sminimo = 1212.0;
    double Sproprio;

    System.out.println("");

    System.out.print("Coloque um salário: ");
    Sproprio = ler.nextDouble();

    double res = ((Sproprio * 100) / Sminimo) / 100;

    System.out.print("Este salário corresponde a " + res + " vezes o salário minimo.");
  }

}