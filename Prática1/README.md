### Prática 1

#### Regras de criação dos programas:

Crie um novo projeto Java no Eclipse denominado Exercicio1.

Nesse projeto deve conter uma classe chamada SequenciasMatematicas.java.
Essa classe deve conter as quatro funcionalidades descritas nos requisitos abaixo. Ou seja, cada quesito é um método. É permitido criar outros métodos além desses quatro ou usar outras classes de apoio, desde que essas funcionalidades sejam implementadas completamente. As funcionalidades são:

1. Imprimir os fatoriais de 1 a 10 na saída padrão (os valores devem ser calculados pelo programa). O
   fatorial de um número n é dado por: n _ n-1 _ n-2 ... até n = 1.

2. Receber um valor n e imprimir os números da série de Fibonacci que são inferiores ao valor
   informado. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro
   elemento é zero e o segundo vale um, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo
   elemento somado ao (n-2)-ésimo elemento (ex: 1 = 1 + 0).

3. Receber um valor x tal que y seja atualizado de acordo com a seguinte regra:
   a. se x é par, y = x / 2
   b. se x é impar, y = 3 \* x + 1
   c. imprime y
   O método deve então jogar o valor de y em x e continuar até que y tenha o valor final de 1. Por
   exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.

4. Receber um valor n e imprimir a tabela a seguir utilizando o encadeamento da estrutura for:
   1
   2 4
   3 6 9
   4 8 12 16
   n n*2 n*3 .... n\*n

Em seguida, crie uma classe chamada Teste.java contendo o método main que instancie um objeto do tipo
SequenciasMatematicas e realize a chamada dos quatro métodos, passando os valores de teste
necessários, no caso dos três últimos.
