
public class Loja {
	private Produto estoque[];
	int qtd=0;
	
	public Produto[] getEstoque() {
		return estoque;
	}

	Loja(int n){
		this.estoque=new Produto[n];
	}

	public void CadastrarProduto(Produto P) {
		this.estoque[qtd]=P;
		qtd++;
	}
	public void ListarProdutos() {
		System.out.println("Produtos Estocados");
		System.out.println("-----------------------------------------");
		for(int i=0;i<qtd;i++) {
			System.out.println("Produto "+ (i+1));
			System.out.println(this.estoque[i]);
			System.out.println("-----------------------------------------");
		}
		
	}
}
