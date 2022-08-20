import java.util.Scanner;

public class prova {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    // Informando variaveis
    final int tam = 5;
    int perguntas = 0;
    char[] gabarito = { 'a', 'b', 'a', 'd', 'd', /* 'c', 'b', 'a', 'c', 'c' */ };
    char[] respostas = new char[tam];
    String nome;
    int nota = 0;

    // Informar nome
    System.out.println("--PROVA JAVA--");
    System.out.print("Digite o seu nome: ");
    nome = ler.nextLine();
    respostas[0] = 'a';
    respostas[1] = 'b';
    respostas[2] = 'a';
    respostas[3] = 'd';
    respostas[4] = 'd';

    // Fazendo perguntas e solicitando respostas
    for (int i = 0; i < respostas.length; i++) {
      if (perguntas == 0) {
        System.out.println("1) Como escrever um comando de saída em java?");
        System.out.println("a- System.out.println(''Hello World'')");
        System.out.println("b- Cosole.WritLine(''Hello World'')");
        System.out.println("c- print(''Hello World'')");
        System.out.println("d- print('Hello World')");
        respostas[i] = ler.next().charAt(0);
      } else if (perguntas == 1) {
        System.out.println("2) Qual a biblioteca é responsável para que o usuário possa inserir valores?");
        System.out.println("a- import.java.util.scanner;");
        System.out.println("b- import.java.util.Scanner;");
        System.out.println("c- import.java.util.Scanner");
        System.out.println("d- imoprt.java.util;");
        respostas[i] = ler.next().charAt(0);
      } else if (perguntas == 2) {
        System.out.println("3) Quais são os comandos de decisão?");
        System.out.println("a- if/if...else/switch");
        System.out.println("b- while/for/do while");
        System.out.println("c- if/if...else/for");
        System.out.println("d- switch/while/do while");
        respostas[i] = ler.next().charAt(0);
      } else if (perguntas == 3) {
        System.out.println("4) Qual a melhor linguagem de programação?");
        System.out.println("a- #TeamPython");
        System.out.println("b- Depende das necessidades do projeto.");
        System.out.println("c- JavaScript, facil e prático");
        System.out.println("d- #TeamJava Nada Supera");
        respostas[i] = ler.next().charAt(0);
      } else if (perguntas == 4) {
        System.out.println("5) Qual codigo permite ao usuário adcionar um número?");
        System.out.println("a- int num = ler.nextDouble();");
        System.out.println("b- int num = ler.next().charAt(0);");
        System.out.println("c- String nome = ler.nextLine();");
        System.out.println("d- int num = ler.nextInt();");
        respostas[i] = ler.next().charAt(0);
      }
      perguntas++;
    }

    // Adcionando notas a cada resposta correta
    for (int i = 0; i < tam; i++) {
      if (gabarito[i] == respostas[i]) {
        nota++;
      }
    }

    System.out.println("\n\nO aluno(a) " + nome + " tirou " + nota + " pontos na prova!");

    ler.close();
  }
}