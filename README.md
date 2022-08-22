[TOC]

# Entrada e Saída Lendo e Pulando Nomes

** Básico

** Princípios Básicos

** Bootcamp Spring Experience

**Desafio**

Faça um programa com as características abaixo:

1. Leia 10 nomes, sem espaço em branco;
2. Imprima o terceiro nome da lista;
3. Imprima o sétimo nome da lista;
4. Imprima o nono nome da lista.

**Entrada**

A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

**Saída**

Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que está sendo pedido.

| Exemplos de Entrada                      | Exemplos de Saída |
| ---------------------------------------- | ----------------- |
| USP <br />UFPE <br />UFCG<br />UFRN<br />UFRJ<br />IME<br />ITA <br />NIOESTE<br />URI<br />UFG |UFCG<br />ITA<br />URI|



# Médias Ponderadas

** Básico

** Princípios Básicos

** Bootcamp Spring Experience

**Desafio**

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

**Entrada**

O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

**Saída**

Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.


| Exemplos de Entrada                      | Exemplos de Saída |
| ---------------------------------------- | ----------------- |
| 3<br/>6.5 4.3 6.2<br />5.1 4.2 8.1<br/>8.0 9.0 10.0| <br/>5.7<br/>6.3<br/>9.3|



# Jogadores Viciados

** Básico

** Princípios Básicos

** Bootcamp Spring Experience

**Desafio**

Sabemos que você adora passar horas jogando jogos como Liga of Legendas (LOL) e Contra-Strike (CS). LOL pode ser o seu queridinho, mas você também gosta de usar todas suas grandes habilidades no Contra-Strike!

Com tanto treinamento, você começpu a fazer vídeos das suas jogadas, e eles estão sempre sendo exibidos na *JC - Jogadores Viciados*, uma página na internet que publica *gameplays* dos alunos da universidade.

Como a página têm muitos acessos, está sempre publicando material novo, isso pode dificultar na hora de tentar encontrar algum vídeo específico. Entretanto, como você é programador e domina a artes de conseguir o que quer por meio do código, você decidiu escrever um programa para encontrar os seus vídeos na página. Dada a lista de *gameplays* publicados na página, determine quantos *gameplays* seus de Contra-Strike foram publicados.

**Entrada**

A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros **N** e **I** (1 ≤ **N** ≤ 104, 1000 ≤ **I** ≤ 9999), o número de *gameplays* publicados na página e o seu identificador na universidade, respectivamente.

As próximas **N** linhas descrevem os *gameplays* publicados. Cada *gameplay* é descrito por dois inteiros **i** e **j** (1000 ≤ **i** ≤ 9999, **j**=0 ou 1), onde **i** é o identificador na universidade do autor do *gameplay*, e **j**=0 se o *gameplay* é de Contra-Strike, ou **j**=1 se é de Liga of Legendas.

A entrada termina com fim-de-arquivo (EOF).

**Saída**

Para cada caso de teste, imprima uma única linha com um número indicando quantos *gameplays* seus de Contra-Strike foram publicados na página.

| Exemplo de Entrada                                           | Exemplo de Saída |
| ------------------------------------------------------------ | ---------------- |
| 7 5558<br/>5693 1<br/>5558 0<br/>6009 1<br/>5558 1<br/>1566 0<br/>5558 0<br/>8757 1 | 2                |



# Proibido a entrada de menores!

** Básico

** Princípios Básicos

** Bootcamp Spring Experience

**Desafio**

O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos. Faça um programa para ler um número N, a idade de N pessoas. Depois disso, coloque a idade mínima permitida para se entrar no local, conforme exemplo.
Retorne às idades de quem não puder entrar.

**Entrada**

A entrada será composta na primeira linha pelo tamanho da array e nas linhas subsequentes pelas idades que preenchem essa array

**Saída**

A saída deverá retornar as idades que não são permitidas a entrada, conforme exemplo abaixo.

| **Entrada**                   | **Saída**                            |
| ----------------------------- | ------------------------------------ |
| 4<br/>18<br/>22<br/>15<br/>50 | Nao poderao entrar as idades:<br/>15 |
| 3<br/>50<br/>10<br/>65 | Nao poderao entrar as idades:<br/>10 |



# Bob Conduite

** Básico

** Princípios Básicos

** Santander Bootcamp Fullstack Developer

**Desafio**

Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele:

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1589.jpg)

Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?

**Entrada**

Na primeira linha teremos um inteiro **T** (**T** ≤ 10000), indicando o número de casos de teste.

Na única linha de cada caso teremos dois números inteiros **R1** e **R2**, indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.

**Saída**

Em cada caso, imprima o menor raio possível em uma única linha

| Exemplo de Entrada        | Exemplo de Saída     |
| ------------------------- | -------------------- |
| 3<br/>1 1<br/>2 8<br/>8 2 | <br/>2<br/>10<br/>10 |



# Pneu

** Básico

** Ad-Hoc

** Santander Bootcamp Fullstack Developer

**Desafio**

Calibrar os pneus do carro deve ser uma tarefa cotidiana de todos os motoristas. Para isto, os postos de gasolina possuem uma bomba de ar. A maioria das bombas atuais são eletrônicas, permitindo que o motorista indique a pressão desejada num teclado. Ao ser ligada ao pneu, a bomba primeiro lê a pressão atual e calcula a diferença de pressão entre a desejada e a lida. Com esta diferença ela esvazia ou enche o pneu para chegar na pressão correta.

Sua ajuda foi requisitada para desenvolver o programa da próxima bomba da SBC - Sistemas de Bombas Computadorizadas.

Escreva um programa que, dada a pressão desejada digitada pelo motorista e a pressão do pneu lida pela bomba, indica a diferença entre a pressão desejada e a pressão lida.

**Entrada**

A primeira linha da entrada contém um inteiro **N** que indica a pressão desejada pelo motorista (1 ≤ **N** ≤ 40). A segunda linha contém um inteiro **M** que indica a pressão lida pela bomba (1 ≤ **M** ≤ 40).

**Saída**

Seu programa deve imprimir uma única linha, contendo a diferença entre a pressão desejada e a pressão lida.

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 30<br/>18           | 12                |
| 27<br/>27 | 0    |
| 27<br/>30 | -3   |

OBI - Olimpíada Brasileira de Informática 2010 Fase 1 Nível Júnior



# Reservatório de Mel

** Básico

** Princípios Básicos

** Santander Bootcamp Fullstack Developer

**Desafio**

Seu Júlio é proprietário de um grande apiário situado no interior da Paraíba. Todo ano, semestralmente, seu Júlio coleta o mel produzido pelas abelhas da sua propriedade e armazena-o em um recipiente de formato CILÍNDRICO para que facilite o transporte do mel para os estabelecimentos que encomendam esse produto natural para a comercialização.
Certa vez seu Júlio percebeu que devido a um crescimento na produção do mel, em relação ao semestre anterior, o recipiente que possuia não suportaria o volume de mel produzido por suas abelhas. Seu Júlio precisa agora que você faça um programa que informado o volume de mel em cm3 e o diâmetro da parte interna do recipiente em cm, calcule e mostre:

\- Qual deve ser a altura(em cm) da parte interna do recipiente;

\- A área(em cm2) da boca(entrada) do recipiente.

*Obs.:* Considere π **=** 3.14

**Entrada**

A entrada contém vários casos de teste e termina com EOF. Cada caso de teste consiste de duas linhas contendo em cada uma um valor de ponto flutuante de dupla precisão com duas casas decimais após a vírgula, sendo um **V** (1.00 ≤ **V** ≤ 10000.00) e outro **D** (1.00 ≤ **D** ≤ 100.00), representando respectivamente o volume e o diâmetro do recipiente.

**Saída**

Para cada teste, a saída contém na primeira linha a mensagem "ALTURA = ", com um espaço depois de ALTURA e outro depois do símbolo de igualdade, seguido do valor da **altura** do recipiente com duas casas decimais após a vírgula e na segunda linha a mensagem "AREA = ", também com um espaço depois de AREA e outro depois do símbolo de igualdade, seguido do valor da **area** da boca(entrada) do recipiente com duas casas decimais após a vírgula.

\- Não esqueça da quebra de linha ao final da saída,caso contrário você receberá "Presentation Error".

| Exemplo de Entrada                                           | Exemplo de Saída                                             |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1450.00<br/>25.00<br/>760.00<br/>40.00<br/>7500.00<br/>15.00 | ALTURA = 2.96<br/>AREA = 490.62<br/>ALTURA = 0.61<br/>AREA = 1256.00<br/>ALTURA = 42.46<br/>AREA = 176.62 |

Dedicado à equipe Los Miserables e turma GTI do UNIPÊ de 2015.



# Idades

** Básico

** Princípios Básicos

** Santander Bootcamp Fullstack Developer

**Desafio**

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

**Entrada**

A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

**Saída**

A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.

| Exemplo de Entrada             | Exemplo de Saída |
| ------------------------------ | ---------------- |
| 34<br/>56<br/>44<br/>23<br/>-2 | 39.25            |

Agradecimentos a Cassio F.



# A Mudança

** Intermediário

** Princípios Básicos

** Santander Bootcamp Fullstack Developer

**Desafio**

![img](https://www.urionlinejudge.com.br/gallery/images/problems/UOJ_2686.png)

Hermione está criando um novo Vira Tempo especialmente para programadores. É impressionante as vantagens que ele oferece e o conforto pra codar que ele tem. O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de inclinação do Sol/Lua(de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar: dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se encontra.

**Entrada**

A entrada contém um número inteiro **M** (0 ≤ **M** ≤ 360) representando o grau do Sol/Lua. Como a posição muda constantemente seu programa receberá diversos casos a cada segundo(EOF).

**Saída**

Imprima uma saudação referente ao período do dia que ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

| Exemplo de Entrada              | Exemplo de Saída                                             |
| ------------------------------- | ------------------------------------------------------------ |
| 0<br/>45<br/>360<br/>90<br/>180 | Bom Dia!!<br/>Bom Dia!!<br/>Bom Dia!!<br/>Boa Tarde!!<br/>Boa Noite!! |



# Dragão Berrador World

** Básico

** Princípios Básicos

** Santander Bootcamp Fullstack Developer

**Desafio**

Todos os habitantes do Mundo Mágico estão super animados com a abertura do Dragão Berrador World, o mais novo parque de diversões do universo bruxo. 

Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo Ministério Bruxo. Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.

Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado pela gerência do Dragão Berrador World para fazer um programa que, dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa.

**Entrada**

A entrada contém vários casos de teste. A primeira linha de cada caso consiste em três inteiros **N** (1 ≤ **N** ≤ 100), **Amin** e **Amax** (50 ≤ **Amin** ≤ **Amax** ≤ 250), o número de visitantes, a altura mínima e máxima em centímetros para andar na montanha-russa, respectivamente.

As **N** linhas seguintes contém, cada uma, um número inteiro representando a altura do visitantes, em centímetros.

**Saída**

Para cada caso de teste, imprima uma única linha com o número visitantes que podem passear na montanha-russa.

| Exemplo de Entrada                                           | Exemplo de Saída |
| ------------------------------------------------------------ | ---------------- |
| 8 160 182<br/>160<br/>182<br/>183<br/>159<br/>250<br/>170<br/>172<br/>173 | 5                |
| 5 155 176<br/>149<br/>154<br/>172<br/>182<br/>167            | 2                |
