
public abstract class Empregado {
	private String nome;
	private float salario;
	private float saldo;
	
	Empregado(String nome, float salario, float saldo){
		this.nome=nome;
		this.salario=salario;
		this.saldo=saldo;
	}

	public void PagarSalario() {
		this.saldo+=salario;
	}
	public abstract void Gratificacao();
	
	public float getSalario() {
		return salario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = (float) d;
	}

	public String toString() {
		return "nome=" + nome
				+"\nsalario=" + salario
				+ "\nsaldo=" + saldo;
	}
}
