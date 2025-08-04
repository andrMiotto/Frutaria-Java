# 🍎 Projeto Frutaria — Técnicas de Programação (Java)

Este projeto foi desenvolvido ao longo da disciplina de **Técnicas de Programação**, com o objetivo de aplicar os princípios **SOLID** e reforçar o uso de **orientação a objetos** com a linguagem **Java**.

Durante a evolução do sistema, aprimoramos a estrutura e lógica do projeto, partindo de uma versão básica focada em frutas até uma versão mais elaborada com **polimorfismo aplicado entre frutas e verduras**.

---

## 🧠 Objetivo Pedagógico

- Aplicar **encapsulamento, herança e polimorfismo** na prática.
- Refatorar código para respeitar os **princípios SOLID**.
- Separar corretamente as responsabilidades entre as classes.
- Praticar a organização de um sistema em **camadas: modelo, serviço e visão**.

---

## 📁 Estrutura do Projeto

```
br.com.appFrutaria/
├── model/
│   ├── Produto.java
│   ├── Fruta.java
│   └── Verdura.java
├── service/
│   └── Estoque.java
├── view/
│   └── Atendente.java
└── Main.java
```

---

## 🧾 Versões Implementadas

### ✅ Versão 1 — Sistema Normal (foco em frutas)

Nesta versão inicial, o sistema permite:

- Cadastro de frutas
- Listagem de frutas
- Remoção de frutas
- Edição de frutas
- Pesquisa por nome
- Contagem total de frutas

Todas as ações são centralizadas na classe `Estoque`, que gerencia uma lista de frutas (`List<Fruta>`).

> **Limitação:** Não aplica polimorfismo. Trabalha apenas com frutas.

---

### 🔁 Versão 2 — Aprofundando Polimorfismo

Esta versão foi criada como **atividade avaliativa** com o objetivo de aplicar e consolidar o uso de **polimorfismo**.

#### Melhorias nesta versão:

- Criação da superclasse `Produto`, que é estendida por `Fruta` e `Verdura`.
- O estoque agora contém uma lista genérica de produtos (`List<Produto>`).
- O sistema é capaz de lidar com múltiplos tipos de produtos.
- Uso do polimorfismo para tratar frutas e verduras de forma genérica.
- Verificar o tipo de dado inserido e retornar uma mensagem de erro caso não atenda ao requisito

#### Funcionalidades:

- Cadastro de frutas
- Cadastro de verduras
- Listagem unificada de todos os produtos

---
## 🧪 Tecnologias Utilizadas

- Java 17+
- Paradigma Orientado a Objetos (POO)
- Princípios SOLID (com foco em SRP e OCP)
- Organização em pacotes (`model`, `service`, `view`)

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/frutaria-java.git
```

2. Importe o projeto em uma IDE Java (recomendado: Eclipse ou IntelliJ).

3. Execute a classe `Main.java` para iniciar o sistema.

---

## 👨‍🏫 Créditos

- **Aluno:** André Luis Miotto Pereira  
- **Disciplina:** Técnicas de Programação  
- **Professor:** Bruno da Silva Andrade

---

## 📌 Considerações Finais

Este projeto representou uma ótima oportunidade de colocar em prática os conceitos aprendidos em sala. A refatoração do sistema para aplicar **polimorfismo** e organizar as responsabilidades de forma mais clara foi um grande diferencial no aprendizado.

> Agradecimentos ao professor pela proposta de atividade avaliativa que incentivou a melhoria e aprofundamento do código.
