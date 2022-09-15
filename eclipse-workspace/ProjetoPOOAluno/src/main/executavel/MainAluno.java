package main.executavel;

import javax.swing.JOptionPane;
import classes.objetos.*;
import constantes.status.StatusAluno;

import java.util.*;

public class MainAluno {

	public static void main(String[] args) {

		// Instansciando o classe Aluno como lista de arryas, permitindo que se cadastre
		// um número ilimitado de itens/alunos
		List<Aluno> alunos = new ArrayList<Aluno>();

		// Loop definindo a quantida de alunos que eu quero inserir
		for (int qtdAluno = 1; qtdAluno < 5; qtdAluno++) {

			// Solicitando os dados com JOptionPane
			String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno " + qtdAluno);
			/*
			 * String idadeAluno = JOptionPane.showInputDialog("Digite a idade do aluno " +
			 * qtdAluno); String nomeEscola =
			 * JOptionPane.showInputDialog("Digite o nome da escola"); String
			 * serieMatriculada = JOptionPane.showInputDialog("Digite a séria matriculada");
			 */

			// Instasciando a classe Aluno
			Aluno aluno1 = new Aluno();

			// Inserindo os valores do objeto aluno1, com base nos dados inseridos com
			// JOptionPane
			aluno1.setNome(nomeAluno);
			/*
			 * aluno1.setIdade(Integer.valueOf(idadeAluno));
			 * aluno1.setNomeEscola(nomeEscola);
			 * aluno1.setSerieMatriuclada(serieMatriculada);
			 */

			// Loop para definir a quantidade de disciplinas a serem cadastradas
			for (int pos = 1; pos < 2; pos++) {
				// Solicitando os dados
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina " + nomeDisciplina);

				// Instansciando a classe Disciplina
				Disciplina disciplina = new Disciplina();

				// Inserindo os valores no objeto disciplina
				disciplina.setNomeDisciplina(nomeDisciplina);
				disciplina.setNotaDisciplina(Double.parseDouble(notaDisciplina));

				// Adcionando os dados do objeto disciplina dentro do objeto aluno1
				aluno1.getDisciplinas().add(disciplina);
			}

			// Opção de escolher retirar matérias
			int escolha = JOptionPane.showConfirmDialog(null, "Você deseja remover alguma disciplina?");

			// 0 = Yes; 1 = No; 2 = Cancel
			if (escolha == 0) {

				// Logica para remoção das disciplinas
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual a disciplina? (1,2,3 ou 4)");
					aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
				}
			}

			// Adcionando itens do objeto aluno1, para o objeto alunos de arrays
			alunos.add(aluno1);
		}

		/*
		 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); List<Aluno>
		 * alunosRecuperacao = new ArrayList<Aluno>(); List<Aluno> alunosReprovados =
		 * new ArrayList<Aluno>();
		 */
		// Substituiremos o código acima com a classe HashMap
		// A Classe HashMap serve para que peguemos uma chave e referenciamos a um valor
		// dentro da lista no caso <chave, objeto de referencia>
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		// Metodo put coloca as chaves para serem publicadas e inicia uma lista para
		// serem lidas.
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println("A média final foi " + aluno.getMediaNota());
			System.out.println(aluno.getAlunoAprovado());
			System.out.println("------------------------------------------------------------");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getNomeDisciplina() + " " + disciplina.getNotaDisciplina());
				System.out.println("------------------------------------------------------------");
			}

			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);

			}
		}

		System.out.println("--------------- LISTA DOS APROVADOS ------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("O aluno " + aluno.getNome() + " foi " + aluno.getAlunoAprovado() + " com média de "
					+ aluno.getMediaNota());
		}
		System.out.println("--------------- LISTA DE RECUPERAÇÃO ------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("O aluno " + aluno.getNome() + " foi " + aluno.getAlunoAprovado() + " com média de "
					+ aluno.getMediaNota());
		}
		System.out.println("--------------- LISTA DOS REPROVADOS ------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("O aluno " + aluno.getNome() + " foi " + aluno.getAlunoAprovado() + " com média de "
					+ aluno.getMediaNota());
		}

	}
}
