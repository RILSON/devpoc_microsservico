# devpoc_microsservico
Projeto relacionado a microsserviço

<h3>ReadME</h3>
<p>Arquitetura do serviço desenvolvido em Java com Spring Boot</p>

<p>Foram criados 3 módulos:</p>

<h4>Core</h4>
<p>Estrutura compartilhada entre os projetos. As classes de modelo, serviço e repositório foram mantidas nesse módulo
    para servir como ponto de acesso compartilhado entre os outros 2 microsserviços.</p>

<h4>Venda</h4>
<p>Microsserviço principal de gestão de venda, possui Controller com funcionalidades principais.</p>

<h4>Relatório</h4>
<p>Microsserviço com o propósito de prover ponto de consulta a dados e relatórios, assim como vendas consolidadas de
    de um período.</p>

<h3>Base de dados</h3>
<p>O projeto roda em cima de uma estrutura do docker. Para utilizar deve-se rodar o arquivo stack.yml em ../venda </p>
<p>docker-compose -f venda/stack.yml</p>
<p>Após a execução do arquivo deve-se criar o schema conforme arquivo ../resoures/application.yml</p>

https://user-images.githubusercontent.com/290335/226512218-98b82f7e-d4b8-44a5-b0fd-bf164acb41e9.jpg
![Arquitetura](https://user-images.githubusercontent.com/290335/226512097-3ee063c6-5d31-49bd-8e30-8f3c7267bf45.jpg)
