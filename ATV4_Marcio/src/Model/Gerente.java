package Model;

public class Gerente extends Funcionario {

	private int numDeFunc;
	
	public Gerente(String nome, String cpf, int matricula, String funcao, String setor, double salario, int senha,
			int numDeFunc) {
		super(nome, cpf, matricula, funcao, setor, salario);
		this.numDeFunc = numDeFunc;
		salario = numDeFunc * salario;
	}

}
