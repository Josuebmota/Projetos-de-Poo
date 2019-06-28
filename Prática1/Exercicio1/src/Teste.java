import java.util.Scanner;

public class Teste {
	public static void main(String args[]){
		Scanner num =new Scanner(System.in);
		int n=num.nextInt();
		SequenciasMatematicas ob = new SequenciasMatematicas();
		System.out.println("Fatorial");
		ob.fatorial();
		System.out.println("Fibonacci");
		ob.Fibonacci(n);
		System.out.println("Valor");
		ob.Valor(n);
		System.out.println("Tabela");
		ob.tabela(n);
	}
}
