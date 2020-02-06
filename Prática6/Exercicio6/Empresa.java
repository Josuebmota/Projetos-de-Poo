
public class Empresa {
	private Empregado Empregados[];
	private int cont=0;
	Empresa(int n){
		Empregados= new Empregado[n];
	}
	public void Inserir(Empregado Ep) {
		this.Empregados[cont]=Ep;
		this.cont++;
	}
	
	public void Lista() {
		for(int i=0;i<cont;i++) {
			System.out.println("Empregados "+ (i+1));
			System.out.println(this.Empregados[i]);
			System.out.println("-----------------------------------------");
		}
	}
	public void Pagar() {
		for(int i=0;i<cont;i++) {
			Empregados[i].PagarSalario();
		}
	}
	public void Gratificar() {
		for(int i=0;i<cont;i++) {
			Empregados[i].Gratificacao();
		}
	}
}
