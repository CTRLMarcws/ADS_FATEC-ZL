# Sistemas Operacionais I - Prof� Leandro Colevati Dos Santos - 2021-1

### ISO100-A18_ADS_FATEC-ZL

D�cimo nono exercicio de Sistemas Operacionais I. Abaixo a descri��o do desafio proposto:

#### Exerc�cio Manipula��o de Arquivos

O Arquivo SteamCharts.csv cont�m informa��es sobre popularidade dos jogos na plataforma Steam, est�o contempladas as informa��es e divididas por ano e por m�s. S�o mais de 83 mil registros de jogos.  

S�o interessantes para a nossa an�lise o nome do jogo, o ano, o m�s e a m�dia de jogadores ativos (avg).  


Fazer uma solu��o em java que tenha, na classe de controle (SteamController), um m�todo que receba como par�metros o ano, o m�s e um valor esperado para a m�dia e exiba no console, no seguinte formato: (Nome do jogo | M�dia de jogadores ativos) desde que o ano e o m�s estejam de acordo com os par�metros e a m�dia de jogadores ativos seja maior ou igual ao par�metro passado.  

A classe de controle deve ter um outro m�todo que receba o ano, o m�s, um caminho de diret�rio v�lido e um nome de arquivo v�lido. O m�todo deve filtrar as linhas de acordo com o m�s e o ano inseridos pelo usu�rio e deve gerar um arquivo (nome.csv), no diret�rio v�lido (A exist�ncia do diret�rio deve ser validada), com o seguinte formato:  
nome do jogo ; m�dia dos jogadores ativos


Uma classe de vis�o (Principal.java) deve ser criada com um m�todo Main que permita realizar as opera��es.  