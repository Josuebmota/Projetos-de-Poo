public class Teste {
	public static void main(String args[]) {
//----------------------------------------------------------------------------------
	//Primeira Parte   //Apenas printar
		Empresario E=new Empresario();
		E.setNome("Josué");
		E.setSaldo(7000);
		E.setnFun(3);
		E.exibir(E.getNome(), E.getSaldo(), E.getnFun());
		
		Funcionario F1=new Funcionario();
		F1.setNome("Claudio");
		F1.setSalario(2000);
		F1.setNumero(42);
		F1.exibir(F1.getNome(), F1.getSalario(),F1.getSaldo(), F1.getNumero());
		
		Funcionario F2=new Funcionario();
		F2.setNome("Milton");
		F2.setSalario(1900);
		F2.setNumero(51);
		F2.exibir(F2.getNome(), F2.getSalario(),F2.getSaldo(), F2.getNumero());
		
		Funcionario F3=new Funcionario();
		F3.setNome("Jobervania");
		F3.setSalario(2700);
		F3.setNumero(31);
		F3.exibir(F3.getNome(), F3.getSalario(),F3.getSaldo(), F3.getNumero());
//-----------------------------------------------------------------------------
		System.out.println("--------------");
	//Segunda parte  //Apenas colocar o saldo
		F1.recebe(E.PagarFuncionario(2000));
		F1.exibir(F1.getNome(), F1.getSalario(),F1.getSaldo(), F1.getNumero());
		
		F2.recebe(E.PagarFuncionario(1900));
		F2.exibir(F2.getNome(), F2.getSalario(),F2.getSaldo(), F2.getNumero());
		
		F3.recebe(E.PagarFuncionario(2700));
		F3.exibir(F3.getNome(), F3.getSalario(),F3.getSaldo(), F3.getNumero());
		E.exibir(E.getNome(), E.getSaldo(), E.getnFun());
//-----------------------------------------------------------------------------
		System.out.println("--------------");
	//Terceira parte        //Printa o valor invalido
		E.PagarFuncionario(70000);
		F2.exibir(F2.getNome(), F2.getSalario(),F3.getSaldo(), F2.getNumero());
		E.exibir(E.getNome(), E.getSaldo(), E.getnFun());
//-----------------------------------------------------------------------------
		System.out.println("--------------");
		E.setSaldo(7000);
	//Quarta parte  //printar o pagamento bixado
		F3.recebe(E.PagarFuncionario(2));
		F3.exibir(F3.getNome(), F3.getSalario(),F3.getSaldo(), F3.getNumero());
		E.exibir(E.getNome(), E.getSaldo(), E.getnFun());
	}
}

