
public class Técnico extends Empregado {
	private int consertos;
	
	Técnico(String nome, float salario, float saldo, int consertos){
		super(nome,salario,saldo);
		this.consertos=consertos;
	}

	public void Gratificacao() {
		int x=consertos/10;
		setSaldo(getSaldo()+x*500);
	}
	
	public String toString() {
		super.toString();
		return super.toString()+
				"\nconcertos=" + consertos;
	}
	
	
}
