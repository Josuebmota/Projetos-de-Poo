public class SequenciasMatematicas {
		public void fatorial(){ // b Número fatorial
			int b,c;			// c Número anterior
			for(int i=1;i<11;i++) {
				b=i;
				c=b;		
				for(int j=b-1;j>0;j--){ //Nunca vai entrar na primeira opção...................
					c--; //Decrementa
					b=b*c; //Multiplica a negada
				}
			System.out.println(b);
			} 
		}
		public void Fibonacci(int n){ //Número a do fatorial
			int f=0; 	//Número que recebe a soma
			int s=1;	//Segundo
			int p=0;	//Primeiro
			for(int i=0;i<n;i++) {
				if(i<=0) {
					f=i;	//Ou seja, o primeiro caso
				}
				else {
					f=p+s;	//Executa a soma
					p=s;	//Primeiro recebe o segundo
					s=f;	//Segundo recebe a soma
						
				}
				System.out.printf(f+" ");
			}
			System.out.println("");
		}
		public void Valor(int x) {
			int y=0;
			while(y!=1) {
				if(x%2==0) {
					y=x/2;
				}
				else {
					y=3*x +1;
				}
				x=y;
				System.out.printf(y+" ");
			}
			System.out.println("");
		}
		public void tabela(int n) { //Número de linhas
			for(int i=1;i<=n;i++) {	// vai rodar até a quantidade de linhas
				for(int j=1;j<=i;j++) { //vai preencher a linha 
					System.out.printf(i*j+" ");
				}
				System.out.println(" ");
			}
		}		
	}
