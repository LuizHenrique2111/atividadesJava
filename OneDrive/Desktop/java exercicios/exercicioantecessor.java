import java.util.Scanner;

public class exercicioantecessor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int x, s, a, d, m;

    System.out.print("Insira um núemro: ");
    x = ler.nextInt();

    s = x + 1;
    System.out.println("O sucessor é " + s);
    a = x - 1;
    System.out.println("O antecessor é " + a);
    d = x * 2;
    System.out.println("O dobro é " + d);
    m = x / 2;
    System.out.println("A metade é " + m);
  }
}