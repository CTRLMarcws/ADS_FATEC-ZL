# Sistemas Operacionais I - Prof� Leandro Colevati Dos Santos - 2021-1

### ISO100-A12_ADS_FATEC-ZL

Terceiro exercicio da terceira lista de Sistemas Operacionais I. Abaixo a descri��o do desafio proposto:

#### Ex. 3

Um grande show acontecer� no Brasil, em uma casa com capacidade para 100 pessoas. A venda ser� feita exclusivamente pelo sistema.  
Simultaneamente, 300 pessoas, no primeiro instante acessam o sistema de compra.  
As pessoas podem comprar de 1 a 4 ingressos por compra, sendo que isso � uma condi��o aleat�ria.  

Os passos para a compra s�o:

1. Login no sistema: Processo que pode demorar de 50 ms a 2 s, sendo que, se o tempo passar de 1s, ao final do tempo de espera de login, o comprador recebe uma mensagem de timeout e, por n�o conseguir fazer o login, n�o poder� fazer a compra.

2. Processo de compra: Processo que pode demorar de 1 s a 3 s, sendo que, se o tempo passar de 2,5s, ao final do tempo de espera da compra, o comprador recebe uma mensagem de final de tempo de sess�o e, por estourar o tempo de sess�o, n�o poder� fazer a compra.
semaforo

3. Valida��o da compra: O sistema deve verificar se h� ingressos suficientes para finalizar a compra. Se houver, faz a compra e subtrai do total de ingressos dispon�veis. O sistema comunica a venda da quantidade de ingressos para o usu�rio e a quantidade de ingressos ainda dispon�veis. Se n�o houver a totalidade dos ingressos disponibiliados, o comprador recebe mensagem sobre a indisponibilidade dos ingressos e, como n�o � poss�vel fracionar a quantidade pedida, este perde a possibilidade de compra na sess�o.

Simular em Java essa situa��o

* O processo de valida��o da compra, apenas 1 comprador por vez, pois a finaliza��o do processo depende da disponibilidade de ingressos.
* Os processos de Login e escolha da quantidade de ingressos, por n�o depender de mais nada, devem ser feito simultaneamente entre todos os compradores.