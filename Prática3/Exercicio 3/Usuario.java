
public class Usuario {
	private String nome;			//Atributos
	private int matricula;
	private int cargaT;
	static int NumeroCadastro;
	
	
	Usuario(String nome, int matricula, int cargaT){ //Construtor 
		this.nome=nome;
		this.matricula=matricula;
		this.cargaT=cargaT;
		NumeroCadastro++;   //toda q a uma chamada ele incrementa o número
	}
	
	public void NC(){	//printar a qtd de usuarios
		System.out.println("Numero de Usuarios:"+NumeroCadastro);
	}

	public void setCargaT(int cargaT) { //Pega a carga Total
		this.cargaT=cargaT;
	}

	public String toString() { //Retorna classe
		return "Nome:"+nome+"\n"+"Matricula:"+matricula+"\n"+"CargaT:"+cargaT+"\n";
	}
	
}
