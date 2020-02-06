public class Funcionario {
	private String nome;
	private int salario;
	private int saldo;
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void exibir(String nome, int salario,int saldo, int numero){
		System.out.println("Nome: "+nome+"\n"+"Salario: "+salario+"\n"+"Saldo: "+saldo+"\n"+"Nº de Indentificão: "+numero);
		System.out.println("");
	}
	public void recebe(int deposito) {
		if(deposito<getSalario()) {
			System.out.println("Pagamento indevido");
		}
		else{
			setSaldo(getSaldo()+deposito);
		}
	}
}

