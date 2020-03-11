### Prática 6

#### Regras de criação dos programas:

Crie um novo projeto Java no Eclipse denominado Exercicio10.

Nesse projeto, desenvolva uma interface gráfica com um jogo de número mágico.

Ele, ao inicializar, deve gerar um número aleatório entre 0 e 1000 (sem mostrar ao usuário) e perguntar ao usuário qual o número mágico. O usuário deve então entrar numa rotina de tentativa e erro até acertar o valor correto, quando o programa acaba e, naturalmente, exibe uma mensagem de que usuário acertou e ganhou o jogo.

Porém, o programa avisa quando o usuário erra, dando dicas, dependendo do nível da dificuldade do jogo. Quanto mais fácil, mais detalhes ele fornece sobre o quão errado está o chute do jogador.

Os níveis são:

- Fácil: Muito baixo, baixo, um pouco baixo, um pouco alto, alto, muito alto.
- Médio: Muito baixo, baixo, alto, muito alto
- Difícil: Muito baixo, muito alto
- Muito Difícil: Nenhum detalhe, apenas avisa que a resposta está errada.

Para isso, a interface deve ter uma forma de inserção de valores (como um JTextField), uma forma de visualização de respostas (como Label, TextField, etc..) e deve mudar a cor de fundo conforme a intensidade do erro, ficando vermelho quando a intensidade do erro for alta, laranja, quando a intensidade do erro for média e amarelo, quando a intensidade do erro for baixa. A cor, quando o programa finaliza com um chute correto, deve ser verde.

A forma de seleção de dificuldade deve ser feita através de RadioButtons e essa mudança deve acontecer dinamicamente. Ou seja. Se o jogador se sentir muito perdido durante a partida, ele pode clicar num nível mais baixo de dificuldade para receber dicas mais detalhadas e vice-versa.

Quando o jogo finaliza ao se chutar o número mágico correto, o programa deve poder iniciar um novo jogo.

O formato exato da tela e a forma como serão resolvidos determinados detalhes fica a critério do aluno. O programa precisa apenas, de alguma forma, atender os requisitos expostos acima, sobretudo o da mudança de nível de dificuldade em tempo de jogo usando especificamente os Radio Buttons
