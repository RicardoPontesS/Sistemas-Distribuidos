A elaboração de chat implementado na disciplina de sistemas distribuídos tem como objetivo a implementação da arquitetura centralizada e descentralizada de forma a fortalecer o conhecimento teórico ministrado em aula pelo professor João Luiz de Almeida Filho, pelo segundo semestre de 2022.

O desenvolvimento do trabalho foi através da linguagem Java, ao qual teve seu aprendizado também paralelo a realização do sistema de chat.

Inicialmente, a base do trabalho se dá pela aplicação de cinco classes ao todo, sendo uma referênte aos métodos e atributos do cliente, uma para o servidor, como também uma interface para cada uma dessas entidades. Os métodos abstratos dessas interfaces foram definidos em conjunto, juntamente com o professor orientador e os demais colegas de turma. Para a alocação das mensagens, estamos utilizando da estrutura de dados, lista.

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

•	
