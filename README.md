# APIRestOrangeTalents
Desafio para o processo seletivo da Orange Talents

API Rest para Registros de Usuários e Carros

O primeiro passo é entender a nossa necessidade para construirmos essa API, que no caso a missão que me foi passada é a construção de 3 endpoints, ou seja, 3 funções principais para a API.
O primeiro endpoint é o cadastro do usuário com alguns detalhes, eles devem ter nome, e-mail, cpf e data de nascimento, sendo que o e-mail e cpf devem ser únicos.
O segundo endpoint é o cadastro de veículos, sendo que as informações desses veículos devem ser trazidas de outra API que puxa essas informações da tabela FIPE.
E o terceiro e não menos importante é o endpoint que traz as informações do usuário com os seus veículos cadastros E o dia de rodízio dos veículos com base no ano do veículo.
E pra isso usaremos o Spring Boot com a linguagem em java e algumas dependências. A IDE utilizada foi o Eclipse e para inicio do projeto usei o Spring Initializr.
Dependências Utilizadas:
Pra esse desenvolvimento usei o JPA pra poder persistir e consultar os dados no banco através de anotações e comandos, o porquê de usar o JPA é que ele vem com umas “pré-configurações” que nos permite manipular e acessar esses dados mais fácil;
Usei também o Dev tools, pra ter o auto refresh conforme eu desenvolvia o projeto, basicamente ele foi usado pra eu não ter que ficar pausando e iniciando a aplicação toda hora, sempre que eu o alterava e salvava, automaticamente ele iniciava a aplicação e me falava se tinha algo de errado ou se rodou ok.
O Spring Web também foi utilizado, porque é com ele que podemos utilizar um servidor autoconfigurável, porque ele tem com o Tomcat incorporado como servidor padrão e o usamos localmente.
E pra conexão do nosso banco de dados usei o H2 porque ele faz o banco de dados em memória e evita o grande trabalho de configurarmos um servidor e como o JPA já configura as tabelas pra nós, o acesso dele é mais rápido e prático.

Eu sou Hugo Hisao Shinde e desenvolvi esse projeto para o processo seletivo da Orange Talents.
