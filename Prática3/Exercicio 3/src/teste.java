
public class teste {
	public static void main(String args[]) {
		Usuario U =new Usuario("José",102,40);
		
		Aluno A = new Aluno("João",85);
		
		A.matricula(1, "Calculo");
		A.matricula(2, "POO", 60,5);
		A.matricula(3, "Fisica", 40, 1);
		
		A.cargahoraria();
		
		System.out.println(U);
		System.out.println("------------------------------------------");
		System.out.println(A);
		System.out.println("------------------------------------------");
		
		U.NC();
	}
}
