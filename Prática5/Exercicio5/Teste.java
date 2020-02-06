
public class Teste {
	public static void main(String args[]) {
		Loja mercado=new Loja(9);
		mercado.CadastrarProduto(mercado.getEstoque()[0]=new Produto("Chinela",9,20));
		mercado.CadastrarProduto(mercado.getEstoque()[1]=new Produto("hotwheels",42,5));
		mercado.CadastrarProduto(mercado.getEstoque()[2]=new Produto("Amoeba",666,15));
		mercado.CadastrarProduto(mercado.getEstoque()[3]=new Livro("O Senhor dos Aneis",1,50,"J. R. R. Tolkien","Martins","Literatura fantástica",1000));
		mercado.CadastrarProduto(mercado.getEstoque()[4]=new Livro("As Crônicas do Gelo e Fogo",2,70,"George R. R. Martin","Leya","Fantasia",1500));
		mercado.CadastrarProduto(mercado.getEstoque()[5]=new Livro("As Crônicas De Nárnia ",3,50,"C.S Lewis","WMF Martins Fontes","Fantasia",800));
		mercado.CadastrarProduto(mercado.getEstoque()[6]=new Disco("Disco",52,10,"Guns N' Roses ","Rock",4004000));
		mercado.CadastrarProduto(mercado.getEstoque()[7]=new Disco("Disco",62,10,"Soja","Reggae",1212));
		mercado.CadastrarProduto(mercado.getEstoque()[8]=new Disco("Disco",72,10,"Bon jovi","Rock",500400));
		mercado.ListarProdutos();
	}
}
