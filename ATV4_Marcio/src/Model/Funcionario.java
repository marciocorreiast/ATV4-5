package Model;

public class Funcionario extends Pessoa {

	private int matricula;
	private String funcao;
	private String setor;
	private double salario;

	public Funcionario(String nome, String cpf, int matricula, String funcao, String setor, double salario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.funcao = funcao;
		this.setor = setor;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {

		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
