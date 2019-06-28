
public class Gerente extends Empregado {
	private float part;
	
	Gerente(String nome, float salario, float saldo, float part) {
		super(nome, salario, saldo);
		this.part=part;
		
	}

	public void PagarSalario() {
		setSaldo(getSalario()+part);
	}
	

	public void Gratificacao() {
		setSaldo(getSaldo()+0.1*getSalario());
	}
	
	public String toString() {
		return super.toString()
				+"\nParticipação nos lucros=" + part;
	}
	
}
