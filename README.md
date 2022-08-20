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
