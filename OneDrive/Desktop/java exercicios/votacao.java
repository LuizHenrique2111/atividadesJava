import java.util.Scanner;

public class votacao {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("-------URNA-------");
    System.out.println("(13) Lula");
    System.out.println("(22) Bolsonaro");
    System.out.println("(0) Nulo ou Branco");
    System.out.println("-------URNA-------");
    int voto = ler.nextInt();
    int votoTotal = 0;
    int votoBolsonaro = 0;
    int votoLula = 0;
    int votoNuloBranco = 0;

    for (int i = 0; i < 20; i++) {
      if (voto == 22) {
        System.out.println("\nO seu voto foi para o candidato Bolsonaro.");
        votoBolsonaro++;
      } else if (voto == 13) {
        System.out.println("\nO seu voto foi para o candidato Lula.");
        votoLula++;
      } else if (voto == 0) {
        System.out.println("\nVocê anulou ou deixou em branco o seu voto.");
        votoNuloBranco++;
      } else {
        System.out.println("\nCandidato incorreto. Tente novamente.");
      }
      if (voto == 13 || voto == 22 || voto == 0) {
        votoTotal++;
      }
      System.out.println("-------URNA-------");
      System.out.println("(13) Lula");
      System.out.println("(22) Bolsonaro");
      System.out.println("(0) Nulo ou Branco");
      System.out.println("-------URNA-------");
      voto = ler.nextInt();
    }

    int vL = (votoLula * 100) / 20;
    int vB = (votoBolsonaro * 100) / 20;
    int vN = (votoNuloBranco * 100) / 20;

    System.out.println("\n\n-----RESULTADO-----");
    System.out.println("Votos Totais: " + votoTotal);
    System.out.println("(13) Lula tem " + vL + "% dos votos");
    System.out.println("(22) Bolsonaro tem " + vB + "% dos votos");
    System.out.println("(0) Nulo ou Branco tem " + vN + "% dos votos");
    System.out.println("-----RESULTADO-----");
    System.out.println("\nProcesso finalizado!");
  }
}