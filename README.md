# TodoList-Java-Rocketseat

## Endereço do server
https://todolist-rocketseat-b22v.onrender.com
 
## Sobre o projeto

O ToDo List é um projeto da trilha **Java** desenvolvido no Curso Online de Java da **Rocketseat**.

Neste foi proposto utilizando os fundamentos básicos Java com o Spring Boot uma aplicação desenvolvido o Backend de um ToDo List com  em java com o Maven e spring boot, na última parte fazer o deploy da aplicação no render.com.

### Na Aula 01 - Construção do Back-end:
- Criando o projeto com Maven;
- Primeiras Classes: User Controller e UserModel.

### Na Aula 02 - Integração com o BD:
- Conceito de Getters e setters;
- Integração com a lib **LOMBOK**;
- Integração com o banco de dados em memória **H2 Database Engine** do **JPA**;
- Construção da tabela de usuários;
- Interface do IUserRepository.

### Na aula 03 - Implementando segurança:
- Criptografia da senha com **Bcrypt Java**;
- Construção da tabela de Task na classe TaskModel;
- Construção da TaskController e ITaskRepository, controle dos métodos da classe e comunicação com o bd.

### Na aula 04 - Atualizando tarefas e validação de rotas:
- Correção na validação da rotas em /tasks/;
- Validação do usuário cadastrar tasks;
- Validação das datas de início e conclusão das tasks; 
- Listar as tasks;
- Update inteligente da task.

### Na aula 05 - Deploy do Back-End:
- Validação:
    - Impedir que outros usuários altere as tasks que não lhe pertence;
    - Verificar a existência da task antes de qualquer alteração;
- Controller de erros;
- Integração com a lib **Spring Developer tools**ç
- Deploy da aplicação:
    - Configuração com O Docker;
    - Integração no render.com;

## Tecnologias e bibliotecas utilizadas
- Java
- Maven
- Spring boot
- lombok
- H2 Database Engine
- Spring Developer tools
- Docker
- render

# Como executar o projeto

Pré-requisitos: Java 17, Maven e Apidog

```bash
# clonar repositório
git clone https://github.com/Paulohbarbosa/TodoList-Java-Rocketseat.git 

# entrar na pasta do projeto raiz e instale as dependências
mvn clean install

# no Apidog criar requisições:

- Cadastrar usuários:
    Método: POST;
    End.: http://localhost:8080/users/ 
    #exemplo
    json: {
            "username": "henrique@barbosa",
            "name": "henrique Barbosa",
            "password": "12345"
        }

- Cadastrar tarefas:
    Método: POST;
    End.: http://localhost:8080/tasks/ 
    #exemplo
    json: {
            "description": "Tarefa para gravar aula de task do curso de spring boot",
            "title": "Gravação de aula",
            "priority": "ALTA",
            "startAt": "2023-10-15T12:30:00",
            "endAt": "2023-10-15T15:35:00"
        }
    Auth{
        type: Basic Auth;
        Username: (O do user cadastrado);
        Password: (O do user cadastrado);
    }

- Alterar a tarefa:
    Método: PUT;
    End.: http://localhost:8080/tasks/(id da tarefa criada) 
    #exemplo informação para ser alterada
    json:
        {
            "title": "Gravação de aula 02",
        }
    Auth{
        type: Basic Auth;
        Username: (O do user cadastrado);
        Password: (O do user cadastrado);
    }
```
# executar o projeto no Apidog com server

```bash
 - Cadastrar usuários:
    Método: POST;
    End.: https://todolist-rocketseat-b22v.onrender.com/users/ 
    #exemplo
    json: {
            "username": "henrique@barbosa",
            "name": "henrique Barbosa",
            "password": "12345"
        }

- Cadastrar tarefas:
    Método: POST;
    End.: https://todolist-rocketseat-b22v.onrender.com/tasks/ 
    #exemplo
    json: {
            "description": "Tarefa para gravar aula de task do curso de spring boot",
            "title": "Gravação de aula",
            "priority": "ALTA",
            "startAt": "2023-10-15T12:30:00",
            "endAt": "2023-10-15T15:35:00"
        }
    Auth{
        type: Basic Auth;
        Username: (O do user cadastrado);
        Password: (O do user cadastrado);
    }

- Alterar a tarefa:
    Método: PUT;
    End.: https://todolist-rocketseat-b22v.onrender.com/tasks/(id da tarefa criada) 
    #exemplo informação para ser alterada
    json:
        {
            "title": "Gravação de aula 02",
        }
    Auth{
        type: Basic Auth;
        Username: (O do user cadastrado);
        Password: (O do user cadastrado);
    }
```

# Autor

Paulo Barbosa

https://www.linkedin.com/in/paulo-henrique-barbosa-495492160

