package classes.objetos;

import java.util.Objects;

import constantes.status.StatusAluno;

import java.util.*;

public class Aluno {

	private String nome;
	private int idade;
	private String nomeEscola;
	private String numeroCpf;
	private boolean matriculado;
	private String serieMatriculada;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	public String getSerieMatriculada() {
		return serieMatriculada;
	}
	public void setSerieMatriuclada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}
	public double getMediaNota() {
		double somaNota = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getNotaDisciplina();
		}
		return somaNota / disciplinas.size();
	}
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return StatusAluno.APROVADO;
		} else if (media >= 40 && media < 70){
			return StatusAluno.RECUPERACAO;
		} else {
			return StatusAluno.REPROVADO;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(idade, matriculado, nome, nomeEscola, numeroCpf, serieMatriculada);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return idade == other.idade && matriculado == other.matriculado && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(serieMatriculada, other.serieMatriculada);
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", nomeEscola=" + nomeEscola + ", numeroCpf=" + numeroCpf
				+ ", matriculado=" + matriculado + ", serieMatriculada=" + serieMatriculada + "]";
	}
	
	
	
}
