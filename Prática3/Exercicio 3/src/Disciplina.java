
public class Disciplina {
	private String nome;      //Atributos
	private int carga;
	private int semestre;
	
	Disciplina(String nome,int carga, int semestre){ //Construtor para definir
		this.nome=nome;
		this.carga=carga;
		this.semestre=semestre;
	}
	
	Disciplina(String nome){    //Construtor pr�definido
		this.nome=nome;
		this.carga=80;
		this.semestre=1;
	}

	public int getCarga() {		//Pega a o valor da carga
		return carga;
	}

	public String toString() {  //Retornar a classe
		return "Disciplina:"+nome+"\n"+"CargaHor�ria:"+carga+"\n"+"Semestre:"+semestre+"\n";
	}
	
	
}
