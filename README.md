# Fórum Hub API - Projeto Oracle ONE

Bem-vindo ao Fórum Hub, um projeto desafiador desenvolvido como parte da formação em Java e Spring Framework T6 do programa Oracle ONE.

## Objetivo
Este projeto tem como objetivo proporcionar uma experiência prática no desenvolvimento de APIs Restful. Foi desenvolvido um backend completo para um fórum, com funcionalidades de CRUD.

Diferentemente do projeto anterior, onde os dados eram obtidos da API Gutendex, neste projeto todos os dados são gerados internamente. A API persiste os dados em um banco de dados MySQL usando o Spring Data JPA.

## Endpoints
Os endpoints da API estão documentados no Swagger. Para acessar a documentação, execute o projeto e visite e site:

Alguns dos endpoints disponíveis incluem:

- Autenticação de usuários
- Criação de tópicos
- Cadastro de usuários
- Respostas a tópicos
- Gerenciamento de cursos
- Listagem de tópicos e usuários
- Atualização e exclusão de tópicos, usuários e respostas

## Dependências
Para o funcionamento correto do Fórum Hub, é necessário instalar as seguintes dependências:

- MySQL: Banco de dados utilizado pelo Fórum Hub
- Maven: Gerenciador de dependências utilizado pelo projeto

## Configurações
Antes de executar o projeto, é preciso configurar algumas variáveis de ambiente:

- **DB_FORUMHUB_API_HOST**: Host do banco de dados MySQL, incluindo o número da porta
- **DB_FORUMHUB_API_DATABASE**: Nome do banco de dados utilizado pelo Fórum Hub
- **DB_FORUMHUB_API_USER**: Nome do usuário do banco de dados
- **DB_FORUMHUB_API_PASSWORD**: Senha do usuário do banco de dados
- **JWT_FORUMHUB_API_SECRET**: Chave secreta utilizada para assinar e verificar tokens JWT

## Execução
Para executar o projeto, há duas opções:

1. Abra o projeto na IDE IntelliJ IDEA e execute o método `main` na classe `ForumhubApplication`.
2. No terminal, navegue até a pasta do projeto e execute `mvn spring-boot:run`.

[!NOTE] Se houver problemas com o Maven, certifique-se de usar a versão 3.9.5, utilizada durante o desenvolvimento deste projeto.

Após a execução, faça uma requisição para `/login` com um JSON contendo email e senha (criptografada pelo BCrypt e previamente cadastrada na tabela `Usuarios` do banco de dados) para obter um token JWT válido. Este token é necessário para autenticar outras requisições aos endpoints da API, com duração máxima de duas horas.

## Avisos
Este projeto foi construído e testado com JDK 17, portanto recomenda-se usar a mesma versão durante a execução.
