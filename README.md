A elaboração de chat através da disciplina de sistemas distribuídos tem como objetivo a implementação da arquitetura centralizada e descentralizada de forma a fortalecer o conhecimento teórico ministrado em aula pelo professor João Luiz de Almeida Filho, pelo segundo semestre de 2022.

O desenvolvimento do trabalho foi através da linguagem Java, ao qual teve seu aprendizado também paralelo a realização do sistema de chat.

Inicialmente, a base do trabalho se dá pela aplicação de cinco classes ao todo, sendo uma referente aos métodos e atributos do cliente, uma para o servidor, como também uma interface para cada uma dessas entidades. Os métodos abstratos dessas interfaces foram definidos em conjunto, juntamente com o professor orientador e os demais colegas de turma. Para a alocação das mensagens, estamos utilizando da estrutura de dados, lista.

![image](https://user-images.githubusercontent.com/105815500/206909303-bb6042fc-a315-4de7-bf7a-939606b5c2eb.png)

Inicialmente desenvolvemos a classe do Cliente, ao qual possui dois métodos principais. Sendo eles: 

•	sendMsg: Tem como objetivo enviar uma mensagem para algum destinatário.

•	checkMsg: Retorna ao usuário quantas mensagens o mesmo tem de um determinado remetente.

![image](https://user-images.githubusercontent.com/105815500/206910157-306ea9be-16b7-43c2-a4c7-e9e2f613eba8.png)

A classe Cliente também vai contar com alguns atributos próprios, como:

•	Nome: Responsável pela identificação do cliente.

•	serverIf : Serve como um link para o acesso a interface do servidor.

![image](https://user-images.githubusercontent.com/105815500/206910199-119b5cc5-d9cc-4434-ba89-0b6a48379f73.png)

Passando para a classer Servidor, a mesma conta com inicialmente três principais métodos, sendo eles:

•	receberMensagem: Aloca a mensagem enviada por um cliente na estrutura lista.

•	getMensagem: Retorna ao usuário quantas mensagem o mesmo tem, e quais são elas.

• registroRMI: Verifica se a conexão entre o cliente e o servidor foi bem sucedida.

![image](https://user-images.githubusercontent.com/105815500/206910674-6face70b-7101-4eda-90e9-321262ef6162.png)

A classe Servidor também conta com alguns atributos específicos, como:

• hostName: Referencia o local que será disponibilizado a aplicação
• serviceName: Nome da aplicação

![image](https://user-images.githubusercontent.com/105815500/206910844-8827e2bc-2b35-41ec-87ee-e82ba13c4bab.png)

Já para as interfaces, temos que a interface do Cliente conta com as duas declarações dos dois métodos abstratos:

![image](https://user-images.githubusercontent.com/105815500/206911185-b91cdb02-66d9-49b8-a6a6-dd5b6b9f20a2.png)

A interface do servidor também vai contar com a declaração desses métodos abstratos que está sendo utilizado na classe Servidor, como pode ser visto abaixo.

![image](https://user-images.githubusercontent.com/105815500/206911211-87f99c8a-8581-4ed7-a3b9-6837913cb7e2.png)

Por fim, para fazer a comunicação entre os clientes é feito inicialmente duas instâncias para o teste da comunicação:

![image](https://user-images.githubusercontent.com/105815500/206911390-3ca378d7-23fb-417e-9fac-00fda2cfd94a.png)

Desta forma, para enviar uma mensagem, é necessário a chamada remota do método, sendMsg, levando a instancia da classe Servidor, o destinarário e por fim, a mensagem que se deseja. Abaixo será apresentado um exemplo para maior entendimento.

![image](https://user-images.githubusercontent.com/105815500/206911511-dd5b455d-e004-4644-968d-650038585908.png)

Para a execução correta do programa, é necessário primeiramente executar a classe Servidor e assim, a classe Cliente. No console será apresentado ambas instruções:

![image](https://user-images.githubusercontent.com/105815500/206911642-b1951bf5-6631-46a7-bb1c-5e427191a556.png)

(Após a execução do servidor ser bem sucedida)

![image](https://user-images.githubusercontent.com/105815500/206911702-68e2a4cb-4fc3-476a-ada1-b240c7f4c5c9.png)

(Após a execução do cliente com tais instâncias)
