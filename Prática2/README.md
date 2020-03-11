### Prática 2

#### Regras de criação dos programas:

Crie um novo projeto Java no Eclipse denominado Exercicio2.

Nesse projeto deve conter duas classes chamadas <strong>Funcionário.java </strong> e <strong>Empresario.java </strong>. Essas classes devem estar completamente encapsuladas, com todos os seus atributos no modo <strong>private</strong>, e atender aos seguintes requisitos:

1. Funcionário deve conter <strong> nome, salário</strong> (sempre positivo), <strong> nº de identificação </strong> (sempre positivo) e <strong> saldo </strong>. Além disso, ele deve ser capaz de exibir na tela todas essas informações com uma chamada de método.

2. Empresario deve conter <strong> nome, nº de funcionários </strong>, (sempre positivo) e <strong> saldo </strong>. Além disso, ele deve ser capaz de exibir na tela todas essas informações e deve conter o método a seguir.

3. PagarFuncionario: esse método deve receber como parâmetro a informação de quanto deve ser pago de salário, debitar esse valor do saldo do Empresario e incrementar o valor no saldo do Funcionário. Para isso, PagarFuncionario deve ter um retorno para informar a um Funcionário qual valor ele deve incrementar.

4. PagarFuncionario retorna 0 (zero) se o valor for inválido (negativo ou maior que o saldo do Empresário), exibe um aviso na tela que um pagamento inválido foi solicitado e não debita valores do saldo de Empresario.

5. Se o funcionário receber um valor menor que seu salário, ele exibe na tela um aviso de um pagamento indevido.

Em seguida, crie uma classe chamada <strong>Teste.java</strong>contendo o método main. Instancie 3 Funcionarios (F1, F2 e F3) e 1 Empresario e realize os seguintes passos:

1. F1 se chama Maria e seu salário deve ser 2000.00; F2 se chama João e seu salário deve ser 1900.00;

2. F3 se chama Marcelo e seu salário deve ser 2700.00; Escolha números de identificação para eles;

3. O empresário se chama Mateus, contém 3 funcionários e tem 7000.00 de saldo

4. Exiba as informações dos objetos, realize o pagamento dos três funcionários (recebendo a informação de salário de cada um) e exiba as informações novamente;

5. Realize um pagamento inválido para F2 e exiba F2 e o Empresário;

6. Tente passar para F3 um pagamento indevido passando diretamente como argumento um valor abaixo de seu salário (ex: 2000 é menor que seu salário de 2700) e exiba F3 em seguida.

<strong>Importante</strong>: Todas as modificações ou acesso de informações ocorridos na main devem ser feitos através de métodos de acesso, como setters, gettters e o método para exibir as informações.
