public class Pino {
	private int tam;  //Ele administra a quantidade de discos
	private int torre[];//vetor do pinos
	private int topo;
	
	public Pino(int num) {	
		this.tam=num;		//Recebe a quantidade de discos
		this.torre=new int[num];	//Faz o vetor de acordo com a quantidade
		this.topo=-1;
	}
	
	public void preencher() {
		int a=tam;				//variavel auxiliar
		for(int i=0;i<tam;i++) {
			this.torre[i]=a; //Preenche o vetor da torre
			a--;	
		}
		this.topo=tam-1;
	}
	
	public void insere(int a) {	
		this.topo++;
		torre[topo]=a;
	}
	

	public int retira() {
		int x=torre[topo];//pega a ultima posi��o
		torre[topo]=0;//zera a ultima posicao
		this.topo--;// decremneta o topo
		
		return x; // retorna a ultima posi��o
	}
	
	public void exibir() {  //vai so exibir
		System.out.printf("*");
		for(int i=0;i<tam;i++) {
			if(torre[i]!=0) 
				System.out.print(torre[i]);
		}	
		System.out.println("");
	}	 
}

