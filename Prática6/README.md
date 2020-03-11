### Prática 6

#### Regras de criação dos programas:

Crie um novo projeto Java no Eclipse denominado Exercicio7.

Nesse projeto deve conter as seguintes classes encapsuladas com suas devidas funcionalidades abaixo:

##### Classe Abstrata Empregado

Essa classe deve conter:

1. Nome, Salário e Saldo;

2. Método PagarSalário( ), incrementando o valor do Saldo através do valor do Salário do Empregado;

3. Método abstrato Gratificacao( ), que gera um pagamento de gratificação ao empregado. Este é um contrato. Todo empregado precisa poder receber gratificação, porém, cada cargo recebe segundo sua própria regra;

4. Sobrescrita do método toString( ) para listar as informações de Empregado.

##### Classe Técnico

É um tipo de Empregado e deve conter:

1. Número de consertos por mês;

2. Regra de gratificação: inclui 500 reais ao saldo do Técnico para cada 10 consertos (arrendondados para baixo);

3. Sobrescrita do método toString( ) para listar as informações de Técnico (incluindo nome, salário e saldo).

##### Classe Gerente

Também é um tipo de Empregado e deve conter:

1. Participação nos lucros (valor bruto);

2. O método PagarSalário( ), além de incluir o valor do salário do Gerente, deve pagar o valor de participação nos lucros;

3. Regra de gratificação: inclui 10% do salário bruto (sem participação dos lucros) no saldo;

4. Sobrescrita do método toString( ) para listar as informações de Gerente (incluindo nome, salário e saldo).

##### Classe Empresa

Essa classe contém empregados via composição e deve conter:

1. Um vetor de Empregados (tamanho a definir no construtor);

2. Método InserirEmpregado(Empregado Ep), recebe um empregado e inclui no vetor, independente do tipo;

3. Método ListarEmpregados( ) que lista as informações completas de todos os empregados inclusos no vetor;

4. Método PagarEmpregados( ) que realiza o pagamento de todos os Empregados;

5. Método GratificarEmpregados( ) que realiza pagamento de gratificação a todos os Empregados;

##### Classe Teste

Essa classe deve conter o método main que realiza o seguinte procedimento:

1. Crie uma instância de Empresa com 5 empregados;
2. Adicione dois Gerentes e três Técnicos;
3. Liste os Empregados;
4. Pague os Salários;
5. Liste novamente;
6. Pague gratificação;
7. Liste novamente.

<strong>Importante</strong>: evite usar scanner para o teste durante a apresentação. Para agilizar a apresentação do código, crie um script pronto de teste, definindo as informações dos empregados a serem adicionados durante o código (ao instanciar um novo empregado) de modo que o teste se resuma a clicar em executar.
