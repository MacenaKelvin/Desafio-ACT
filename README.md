# Desafio-ACT
Cadastro de Pessoas e Endereços
Utilizando boas práticas de programação, aplicação foi criada em Spring Boot para cadastrar
pessoas e endereços.

Utilizando os métodos POST, PUT e GET podemos:
Cadastrar pessoas com endereço - método POST;
Cadastrar pessoas sem endereço - método POST;
Atualizar pessoas e endereço - método PUT;
Consultar pessoas cadastradas - método GET;
Consultar CEP - método GET;

A entidade Pessoa contém: ID, NOME, CPF, RG e ENDEREÇO (podendo conter mais de um);
A entidade Endereço contém: CEP, RUA, NÚMERO, BAIRRO, CIDADE, ESTADO;

Utilizei banco de dados MYSQL e a ferramenta REST client Postman

# Preparação do ambiente e execução:

Para executar a aplicação basta clonar esse repositório importar o projeto no Spring Boot e realizar os testes no PostMan utilizando o arquivo disponível, realizando sua importação.
