### Prática 5

#### Regras de criação dos programas:

Crie um novo projeto Java no Eclipse denominado Exercicio5.

Nesse projeto deve conter as seguintes classes encapsuladas com suas devidas funcionalidades abaixo:

##### Classe Produto

Representa um produto genérico de um sistema de uma loja. Deve conter:

1. Nome, código e preço como atributos;

2. Um Construtor que exige as informações dos atributos (não há construtor default);

3. Método toString( ) retornando as informações do produto.

##### Classe Livro

É um tipo específico de Produto. Deve ter, além do que Produto já tem:

1. Autor, Editora, Número de Páginas e Gênero (ficção, não-ficção...);

2. Um Construtor que, assim como o da classe Produto, exige todas as informações dos atributos como entrada;

3. Sobrescrita do método toString( ) de modo a acrescentar as informações do livro.

##### Classe Disco

É um outro tipo específico de Produto. Deve ter, além do que Produto já tem:

1. Banda, Estilo (pop, rock, classic, etc...) e Número de faixas;

2. Um Construtor que, assim como o da classe Produto, exige todas as informações dos atributos como entrada;

3. Sobrescrita do método toString( ) de modo a acrescentar as informações do livro.

##### Classe Loja

Essa classe representa o sistema da loja e contém as informações dos produtos vendidos. Deve ter:

1. Vetor (ou ArrayList) de Produtos (você pode definir quantos elementos o vetor vai ter pelo construtor da classe);

2. Método CadastrarProduto(Produto P) recebe um produto qualquer e adiciona ao vetor (esse método precisa ser único e deve ser capaz de cadastrar qualquer tipo de produto, independente de casos específicos, como Livro ou CD;

3. Método ListarProdutos( ) lista na tela todos os produtos cadastrados em Loja (presentes no vetor ou no arraylist), exibindo as informações no formato estabelecido pelo toString das classes acima.

##### Classe Teste

Essa classe deve conter o método main que realiza o seguinte procedimento:

1. Instancia uma Loja (vetor com tamanho 9, no mínimo);
2. Cadastra três Produtos quaisquer;
3. Cadastra três Livros quaisquer;
4. Cadastra três CDs quaisquer;
5. Exibe a lista de produtos na tela.

<strong>Importante</strong>: como são muitos produtos, a apresentação fica prejudicada se for usar scanner e tiver que digitar na hora da apresentação do código cada produto. Evite usar a classe scanner e crie uma rotina de teste para os nove produtos a serem cadastrados previamente, necessitando apenas mandar rodar o programa na hora (em suma, deixe a construção dos elementos cadastrados em forma de código e não como entrada do teclado).
