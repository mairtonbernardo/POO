
public class Estudante {
	//CONSTRUTORES
	//CONSTRUTOR COM VALORES DEFAULT SEM PARAMETROS
	public Estudante(){
		matricula = 0;
		nome = "nomedoestudante";
		sexo = '#';
		notas[0] = 0.0;
		notas[1] = 0.0;
		notas[2] = 0.0;
		notas[3] = 0.0;
	}
	//CONSTRUTOR PASSANDO NOME E SEXO COMO PARAMETROS
	public Estudante(String nome, char sexo) {
		nome = nome;
		sexo = sexo;
	}
	//CONSTRUTOR PASSANDO NOME, SEXO E MATRICULA COMO PARAMETROS
	public Estudante(String nome, char sexo, int matricula) {
		matricula = matricula;
		nome = nome;
		sexo = sexo;
	}
	
	//VARIAVEIS DE INSTANCIA
	int matricula;
	String nome;
	char sexo;
	double notas[] = new double[4];
	void exibir() {
		System.out.print("Matrícula: " + matricula);
		System.out.print("; Nome: " + nome);
		System.out.println("; Sexo: " + sexo);
		double soma = 0;
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			if(i == notas.length - 2) {
				System.out.println("VF: " + notas[i]);
				soma = soma+ notas[i];
				break;
			}
			else {
				System.out.println("VP" + (i+1) + ": " + notas[i]);
			}
			soma = soma + notas[i];
		}
		media = soma / (notas.length - 1);
		System.out.println("MEDIA: " + media);
	}
	//METODO EXIBIR() SOBRECARREGADO COM STRING DO TITULO
	void exibir(String texto) {
		System.out.println("");
		System.out.println(texto);
		exibir();
	}
	void atribuirNota(int prova, double nota) {
		notas[prova] = nota;
	}
	void atribuirNota(int prova) {
		notas[prova] = 5.0;
	}
	double lerNota (int prova) {
		return notas[prova];
	}
}