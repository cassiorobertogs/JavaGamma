package core;

public class estudante extends pessoa {
	private int matricula;
	private String curso;
	public estudante(String nome, String telefone, String email, int matricula, String curso) {
		super(nome, telefone, email);
		this.matricula = matricula;
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void imprimir() {
		System.out.println("nome: "+nome);
		System.out.println("telefone: "+telefone);
		System.out.println("email: "+email);
		System.out.println("matricula: "+matricula);		
		System.out.println("curso: "+curso);
	}
}
