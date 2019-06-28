
public class Livro extends Produto {
	private String autor;
	private String editora;
	private String genero;
	private int folhas;

	Livro(String n, int c, float p, String a, String e, String g, int f) {
		super(n, c, p);
		this.autor=a;
		this.editora=e;
		this.genero=g;
		this.folhas=f;
		
	}

	public String toString() {
		return super.toString()+
				"\nAutor:"+autor+
				"\nEditora:"+editora+
				"\nGenero:"+genero+
				"\nQtdFolhas:"+folhas;
	}
	
	
	
}
