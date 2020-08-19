
public class TesteEstudante {

	public static void main(String[] args) {
		//PRIMEIRO ESTUDANTE
		Estudante aluno1 = new Estudante();
		aluno1 = new Estudante();
		aluno1.exibir("PRIMEIRO ESTUDANTE (SEM PARAMETROS PASSADOS)");
		
		System.out.println("");
		System.out.println("");
		
		//SEGUNDO ESTUDANTE
		Estudante aluno2 = new Estudante();
		aluno2 = new Estudante();
		aluno2.nome = "Maria Silva";
		aluno2.sexo = 'F';
		aluno2.exibir("SEGUNDO ESTUDANTE (PASSANDO NOME E SEXO COMO PARAMETROS)");
		
		System.out.println("");
		System.out.println("");
		
		//TERCEIRO ESTUDANTE
		Estudante aluno3 = new Estudante();
		aluno3 = new Estudante();
		aluno3.nome = "Mario Alencar";
		aluno3.sexo = 'M';
		aluno3.matricula = 200401;
		aluno3.exibir("TERCEIRO ESTUDANTE (PASSANDO NOME, SEXO E MATRICULA COMO PARAMETROS)");
		
		System.out.println("");
		System.out.println("");
		
		aluno1.atribuirNota(0, 8.0); aluno1.atribuirNota(1, 8.0); aluno1.atribuirNota(2, 8.0);
		aluno2.atribuirNota(0, 7.0); aluno2.atribuirNota(1, 5.0); aluno2.atribuirNota(2); aluno2.atribuirNota(3, 8.5);
		aluno3.atribuirNota(0, 7.0); aluno3.atribuirNota(1, 5.0); aluno3.atribuirNota(2); aluno3.atribuirNota(3, 8.5);
		
		aluno1.exibir("PRIMEIRO ESTUDANTE");
		aluno2.exibir("SEGUNDO ESTUDANTE");
		aluno3.exibir("TERCEIRO ESTUDANTE");
	}

}