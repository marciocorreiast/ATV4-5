package Model;

public class Vendedor extends Funcionario {

	private double comissao;

	public Vendedor(String nome, String cpf, int matricula, String funcao, String setor, double salario,
			double comissao) {
		super(nome, cpf, matricula, funcao, setor, salario);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void salVendedor() {
		double salario =+ comissao;

	}
}