
public class Empresario {
	private String nome;
	private int saldo;
	private int nFun;

	public int getnFun() {
		return nFun;
	}
	public void setnFun(int nFUn) {
		this.nFun = nFUn;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int PagarFuncionario(int valor) {
		if(getSaldo()<valor || valor<0) {
			System.out.println("Pagamento invalido");
			return 0;
		}
		else{
			setSaldo(getSaldo()-valor);
			return valor;
		}
	}
	public void exibir(String nome, int saldo, int numero){
		System.out.println("Nome: "+nome+"\n"+"Saldo: "+saldo+"\n"+"Nº de Funcionarios: "+numero);
		System.out.println("");
		
	}
}