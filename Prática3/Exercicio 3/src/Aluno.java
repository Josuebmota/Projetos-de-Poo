public class Aluno extends Usuario {
	Disciplina D[]=new Disciplina[3]; //N�mero de Disciplinas
	
	Aluno(String nome, int matricula) { // Construtor 
		super(nome, matricula, 0);	//Refer�ncia a class usuario por ser uma heran�a
	}
	
	public void matricula(int indice,String nome,int carga, int semestre) {// metodo para cadastradr n�o definido
		D[indice-1]=new Disciplina(nome,carga,semestre);
	}
	public void matricula(int indice,String nome) { // metodo quase pr�-definido
		D[indice-1]=new Disciplina(nome);
	}
	public void cargahoraria() { // Soma das cargas
		setCargaT(D[0].getCarga()+D[1].getCarga()+D[2].getCarga());
	}
	
	public String toString() { // Retorna a classe + a classe do usuario
		return super.toString()+"\n"+(D[0].toString()+"\n"+D[1].toString()+"\n"+D[2].toString()+"\n");
	}
	
}
