package Model;

import java.util.Arrays;

public class Professor extends Pessoa {

	private int numCursos;
	private String[] cursos = new String[5];

	public Professor(String nome, String endereco, int numCursos) {
		super(nome, endereco);
		this.numCursos = numCursos;
	}
	
	public Professor() {
		
	}

	@Override
	public String toString() {
		return "Professor [numCursos=" + numCursos + ", cursos=" + Arrays.toString(cursos) + "]";
	}

	public boolean addCursos(String curso) {
		int k = -1;
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] != null) {
				k += 1;
			}

			cursos[k] = curso;
			return true;
		}
		return false;

	}

	public boolean removeCursos(String curso) {
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i].equals(curso)) {
				cursos[i] = null;
			}
			return true;
		}
		return false;
	}
}
