### Prática 4

#### Regras de criação dos programas:

Crie um novo projeto Java no Eclipse denominado Exercicio4.

Nesse projeto deve conter as seguintes classes encapsuladas com suas devidas funcionalidades abaixo, a fim de resolver o problema das Torres de Hanói:

##### Classe Pino

Representa um dos pinos da Torre de Hanói onde valores inteiros representando discos de diferentes raios serão armazenados. Deve conter:

1. Um vetor (ou uma pilha) que represente o conjunto de discos e um inteiro que marque o índice do topo da torre (quantos discos contém o pino);

2. Um Construtor que exige o tamanho da torre em discos e instancia o vetor de discos com o tamanho correto;

3. Método preencher( ) para que o pino inicie completamente preenchido (o pino de origem deve estar preenchido e os demais vazios no início do procedimento). Um pino completamente preenchido contém todos os discos do problema. Assim, um problema de tamanho 5, o método inicializará o pino com a lista _ 5 4 3 2 1 (_ é a base e os números representa os raios dos discos);

4. Um método insere(int x) deve receber um valor inteiro e adicionar no topo da pilha contida pelo pino;

5. Um método retira() deve retirar da pilha o disco do topo e retornar seu valor;

6. O método exibir( ) deve imprimir na tela o estado atual do pino. Sugestão: utilize o pino na horizontal, com base à esquerda e topo à direita. Por exemplo: \* 3 2 1, é um pino que contém três discos, com 3 na base e 1 no topo.

##### Classe TorresHanoi

Deve ter:

1. Três atributos Pinos (A, B e C);

2. O construtor deve exigir o tamanho do problema, passar esse valor para instanciar A, B e C e preencher o pino A;

3. Um método mover( ), que recebe como entrada dois pinos e retira o elemento do topo de um e insere esse elemento no topo do outro;

4. Método para exibir o estado atual da torre, exibindo seus três pinos e indicando em que passo o problema em questão, separando um passo de outro através de alguma divisão visual.

5. Método solucionar() deve executar o processo de transferir totalmente a torre do pino A para o pino C e chamar corretamente a rotina para exibir todos os passos.

##### Classe Teste

Essa classe deve conter o método main que realiza o seguinte procedimento:

1. Instancia uma TorreHanoi de tamanho 5;

2. Realiza uma chamada de solucionar( );
