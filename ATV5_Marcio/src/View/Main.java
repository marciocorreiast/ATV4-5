package View;

import Model.*;

public class Main {

	public static void main(String[] args) {

		Pessoa[] pessoa = new Pessoa[5];
		Estudante e1 = new Estudante();
		Estudante e2 = new Estudante();
		Professor p1 = new Professor();
		Professor p2 = new Professor();

		e1.addCursoNota("Letras", 5);
		e1.addCursoNota("Direito", 7);

		e2.addCursoNota("Nutricao", 4);
		e2.addCursoNota("Computacao", 10);

		p1.addCursos("Letras");
		p1.addCursos("Computacao");

		p2.addCursos("Nutricao");
		p2.addCursos("Direito");

		pessoa[0] = e1;
		pessoa[1] = e2;
		pessoa[2] = p1;
		pessoa[3] = p2;

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println(pessoa[i].toString());
		}
	}

}
