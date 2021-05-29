package Model;

import java.util.Arrays;

public class Estudante extends Pessoa {

	private String[] cursos = new String[5];
	private int[] notas = new int[5];

	public Estudante(String nome, String endereco) {
		super(nome, endereco);
	}

	public Estudante() {

	}

	@Override
	public String toString() {
		return "Estudante [cursos=" + Arrays.toString(cursos) + ", notas=" + Arrays.toString(notas) + "]";
	}

	public boolean addCursoNota(String curso, int nota) {
		int k = 0;
		for (int i = 0; i < cursos.length; i++) {
			k += 1;

			cursos[k] = curso;
		}
		int j = 0;
		for (int u = 0; u < notas.length; u++) {
			j += 1;

			notas[j] = nota;
		}

		return true;
	}

	public void imprimeNotas() {

		for (int t : this.notas) {

			System.out.println(notas[t]);
		}

		for (int i = 0; i <= notas.length; i++) {

			System.out.println(notas[i]);
		}

	}

	public double getNotaMedia() {
		double soma = 0;

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		return soma;
	}

}
