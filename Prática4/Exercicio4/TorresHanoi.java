
public class TorresHanoi {
	private int a; //Ela vai pegar o tamanho de discos
	private int b=0;
	//Cria os Pinos
	private Pino A;
	private Pino B;
	private Pino C;
	
	//Instacia 
	TorresHanoi(int n){
		this.a=n;
		A=new Pino(n);
		A.preencher();
		B=new Pino(n);
		C=new Pino(n);
	}
	
	public void mover(Pino P1,Pino P2) {
		P2.insere(P1.retira());//O inserir pega o retira
	}
	public void exibira() {	//Simplimente vai exibir 
		System.out.println("------------------------------------------");
		System.out.println("Passo:"+b);
		this.b++;
		System.out.printf("A-");
		A.exibir();
		System.out.printf("B-");
		B.exibir();
		System.out.printf("C-");
		C.exibir();
		System.out.println("------------------------------------------");
	}
	
	public void resolver(int n,Pino O, Pino D, Pino T) { //Precisa ser entendido
		if (n > 0) {
			resolver(n - 1, O, T, D);
			exibira();
			mover(O, D);
			resolver(n - 1, T, D, O);
		}
	
	}
	public void solucao(){ //"Otimizar"
		resolver(a,A,C,B);
		exibira();
	}
}
