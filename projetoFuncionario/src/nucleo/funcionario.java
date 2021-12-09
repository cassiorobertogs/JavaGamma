package nucleo;

public class funcionario {
	private int numeroFuncional;
	private String nome;
	private String cargo;
	private double salario;
	private int tempTrab;
	

	public funcionario(int numeroFuncional, String nome, String cargo, double salario, int tempTrab) {
		super();
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.tempTrab = tempTrab;
	}

	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTempTrab() {
		return tempTrab;
	}

	public void setTempTrab(int tempTrab) {
		this.tempTrab = tempTrab;
	}

	public void mostrarDados() {
		System.out.println("Colaborador(a): " + nome + ", Numero da funcional: " + numeroFuncional);
		System.out.println("Cargo atual: " + cargo + ", com remuneração parão de R$: " + salario);
	}

	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
				
	}
}
