
public class Produto {
	private String nome;
	private int cod;
	private float preco;
	
	Produto(String n, int c, float p){
		this.nome=n;
		this.cod=c;
		this.preco=p;
	}

	public String toString() {
		return "Nome=" + nome + 
				"\nCodigo=" + cod + 
				"\nPreço=R$" + preco;
	}
	
}
