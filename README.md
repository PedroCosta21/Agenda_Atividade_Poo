# Agenda Ayla

Projeto desenvolvido em Java utilizando Programação Orientada a Objetos (POO) para gerenciamento de contatos e aniversários.

## Funcionalidades

* Cadastro de contatos
* Remoção de contatos
* Pesquisa de aniversariantes por data
* Salvamento de dados em arquivo
* Recuperação de dados salvos
* Tratamento de exceções
* Testes automatizados com JUnit

---

## Tecnologias Utilizadas

* Java
* Maven
* JUnit 5
* IntelliJ IDEA

---

## Estrutura do Projeto

### Classes principais

#### `AgendaAyla`

Classe responsável pelo gerenciamento dos contatos.

Principais métodos:

* `cadastraContato()`
* `pesquisaAniversariantes()`
* `removerContato()`
* `salvarDados()`
* `recuperarDados()`

---

#### `Contato`

Representa um contato da agenda.

Atributos:

* Nome
* Dia do aniversário
* Mês do aniversário

---

#### `GravadorDeDados`

Responsável pela persistência dos dados utilizando serialização em arquivo `.dat`.

---

#### `ContatoInexistenteException`

Exceção personalizada utilizada para tratamento de erros relacionados a contatos inexistentes.

---

## Persistência de Dados

Os contatos são armazenados no arquivo:

```text
contatos.dat
```

Utilizando serialização de objetos em Java.

---

## Testes

O projeto possui testes automatizados utilizando JUnit para validar:

* Cadastro de contatos
* Pesquisa de aniversariantes
* Remoção de contatos

---

## Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Collections (`HashMap`, `ArrayList`)
* Serialização
* Tratamento de Exceções
* Testes Unitários
* Persistência de Dados

---

## Autor

Pedro Costa
