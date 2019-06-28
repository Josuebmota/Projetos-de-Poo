public class Aluno extends Usuario {
	Disciplina D[]=new Disciplina[3]; //Número de Disciplinas
	
	Aluno(String nome, int matricula) { // Construtor 
		super(nome, matricula, 0);	//Referência a class usuario por ser uma herança
	}
	
	public void matricula(int indice,String nome,int carga, int semestre) {// metodo para cadastradr não definido
		D[indice-1]=new Disciplina(nome,carga,semestre);
	}
	public void matricula(int indice,String nome) { // metodo quase pré-definido
		D[indice-1]=new Disciplina(nome);
	}
	public void cargahoraria() { // Soma das cargas
		setCargaT(D[0].getCarga()+D[1].getCarga()+D[2].getCarga());
	}
	
	public String toString() { // Retorna a classe + a classe do usuario
		return super.toString()+"\n"+(D[0].toString()+"\n"+D[1].toString()+"\n"+D[2].toString()+"\n");
	}
	
}
