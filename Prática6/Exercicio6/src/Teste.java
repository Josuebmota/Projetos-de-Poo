
public class Teste {
	public static void main(String args[]) {
		Empresa nestle= new Empresa(5);
		nestle.Inserir(new Gerente("Josue",10000,0,1000));
		nestle.Inserir(new Gerente("Carlos",10000,0,666));
		nestle.Inserir(new Técnico("Gabriel",990,0,9));
		nestle.Inserir(new Técnico("Arlindo",1000,0,10));
		nestle.Inserir(new Técnico("Marco",7000,0,22));
		nestle.Lista();
		nestle.Pagar();
		nestle.Gratificar();
		nestle.Lista();
	}
}

