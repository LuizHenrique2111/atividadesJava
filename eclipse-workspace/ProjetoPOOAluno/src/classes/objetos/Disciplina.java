package classes.objetos;

public class Disciplina {
	
	private String nomeDisciplina;
	private double notaDisciplina;
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public double getNotaDisciplina() {
		return notaDisciplina;
	}
	public void setNotaDisciplina(double notaDisciplina) {
		this.notaDisciplina = notaDisciplina;
	}
	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", notaDisciplina=" + notaDisciplina + "]";
	}

}
