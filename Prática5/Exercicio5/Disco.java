
public class Disco extends Produto{
	private String bandas;
	private String estilo;
	private int faixas;
	int x=3;
	Disco(String n, int c, float p, String b, String e, int f) {
		super(n, c, p);
		this.bandas=b;
		this.estilo=e;
		this.faixas=f;
	}

	public String toString() {
		return super.toString()+
				"\nBanda:"+bandas
				+ "\nEstilo:"+estilo+""
				+ "\nFaixas:"+faixas;
	}	

}
