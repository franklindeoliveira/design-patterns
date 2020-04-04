# Design Patterns
Teoria e prática de Design Patterns utilizando Java

## O que são Design Patterns (Padrões de Projeto)?

São soluções "elegantes" para problemas recorrentes em desenvolvimento de software.

## Padrão Strategy

**Objetivo**: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

**Quando usar?** O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.
No exemplo do vídeo, temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas.
O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.

**Estrutura:**

**Exemplo:** Calculo de impostos
* Case: strategy-case
* Implementação: strategy-impl

**Exercício**: Adicionar novos algoritmos para cálculo de impostos

## Padrão Chain of Responsibility

**Objetivo**: Avoid coupling the sender of request to its receiver by giving more than one object a chance to handle the request. Chan the receiving objects and pass the request along the chain until an object handles it.

**Quando usar**: O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

**Estrutura**: 

**Exemplo**: Calculo de descontos
* Case: chain-of-responsibility-case
* Implementação: chain-of-responsibility-impl

**Exercício**: Adicionar novas regras para cálculo de descontos

## Padrão Template Method

**Objetivo**: Define the skeleton of an algorithm in an operation, deferring some steps to sobclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s strutcture.

**Quando usar**: Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que serão implementados de maneira diferente por cada uma das implementações específicas.

Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.

**Estrutura**: 
**Exemplo**: Calculo de impostos
* Case: template-method-case
* Implementação: template-method-impl

**Exercício**:

## Padrão Decorator

**Objetivo**: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
Quando usar:

Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser composto por outros impostos. O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.

**Estrutura**: 
**Exemplo**: Calculo de impostos compostos
* Case: decorator-case
* Implementação: decorator-impl

**Exercício**:

## Padrão State

**Objetivo**: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Quando usar**: A principal situação que faz emergir o Design Pattern State é a necessidade de implementação de uma máquina de estados. Geralmente, o controle das possíveis transições são vários e complexos, fazendo com que a implementação não seja simples. O State auxilia a manter o controle dos estados simples e organizados através da criação de classes que representem cada estado e saiba controlar as transições.

**Estrutura**: 

**Exemplo**: Controle dos estados de um orçamento
* Case: state-case
* Implementação: state-impl

**Exercício**:

## Padrão Builder

**Objetivo**: Separate the construction of a complex object from its representaion so thet the same construction process can create differente representations.

**Quando usar**: Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.

Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.

**Estrutura**: 

**Exemplo**: Criação de um objeto Nota Fiscal.
* Case: builder-case
* Implementação: builder-impl

**Exercício**:

## Padrão Observer

**Objetivo**: Define a one-to-many dependency between objects to that when on e object changes state, all its dependes are notified and updated automatically.

**Quando usar**: Quando o acoplamento da nossa classe está crescendo, ou quando temos diversas ações diferentes a serem executadas após um determinado processo, podemos implementar o Observer.

Ele permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.

**Estrutura**: 

**Exemplo**: Ações a serem realizadas após a criação de um objeto Nota Fiscal.
* Case: observer-case
* Implementação: observer-impl

**Exercício**:

## Padrão Flyweight

**Objetivo**: Use sharing to support large numbers of fine-grained objects efficiently.

**Quando usar**: Quando temos muitas instâncias do mesmo objeto andando pelo sistema, e precisamos economizar. Para tal, o Flyweight faz uso de uma fábrica modificada, que guarda essas instâncias..

Ele permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.

**Estrutura**: 

**Exemplo**: Notas musicais
* Case: flyweight-case
* Implementação: flyweight-impl

**Exercício**:

## Padrão Memento

**Objetivo**: Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored and updated automatically.

**Quando usar**: Quando queremos salvar e restaurar estados de objetos.

**Estrutura**: 

**Exemplo**: Gerenciar histórico de contratos
* Case: memento-case
* Implementação: memento-impl

**Exercício**:

## Padrão Interpreter

**Objetivo**: Given a language, define a representation for its grammar along with an interpreter the uses the representation to interpret sentences in the language.

**Quando usar**: O padrão Interpreter é geralmente útil para interpretar DSLs (se você não sabe o que é uma DSL. É comum que, ao ler a string (como por exemplo 2+3/4), o programa transforme-o em uma melhor estrutura de dados (como as nossas classes Expressao) e aí interprete essa árvore. É realmente um padrão de projeto bem peculiar, e com utilização bem específica.

**Estrutura**: 

**Exemplo**: Cálculo de expressões matemáticas.
* Case: interpreter-case
* Implementação: interpreter-impl

**Exercício**:

## Padrão Visitor

**Objetivo**: Represent an operation to be performed on elements of an object struture. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

**Quando usar**: Quando temos uma árvore, e precisamos navegar nessa árvore de maneira organizada, podemos usar um Visitor.

**Estrutura**: 

**Exemplo**: Navegar em uma arvore de expressões e imprimir as expressões em diferentes formatos (pré-fixa pós-fixa).
* Case: visitor-case
* Implementação: visitor-impl

**Exercício**:

## Padrão Bridge

**Objetivo**: Decouple an abstraction from its implementation so that the two can vary independently.

**Quando usar**: Quando é necessário acessar uma funcionalidade provida por serviços externos que possuem diferentes implementações.

**Estrutura**: 

**Exemplo**: Acessar uma API de mapas provida por diferentes serviços (Google Maps e MapLink, por exemplo).
* Case: bridge-case
* Implementação: bridge-impl

**Exercício**:

## Padrão Adapter

**Objetivo**: Convert the interface of class into other interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

**Quando usar**: Quando queremos adaptar uma interface de modo a ser compatível com outra interface.

**Estrutura**: 

**Exemplo**: Criar uma nova interface para acesso a API de datas do Java.
* Case: adapter-case
* Implementação: adapter-impl

**Exercício**:

## Padrão Command

**Objetivo**: Encapsulate a request as an object, thereby letting you parameterize clients with diferents requests, queue or log requests, and support undoable operations.

**Quando usar**: Quando temos que separar os comandos que serão executados do objeto que ele pertence.

**Estrutura**: 

**Exemplo**: .
* Case: command-case
* Implementação: command-impl

**Exercício**:

## Padrão Facade

**Objetivo**: Provide a unified interface to a set of interfaces in a subsystem. Facade defines a flexible alternative to subclassing for extending funcionality.

**Quando usar**: Quando precisamos acessar uma série de serviços disponibilizados por sub-sistemas.

**Estrutura**: 

**Exemplo**: Empresa que possui regras de negócias que fazem acesso a diferentes sistemas, como faturamento, cobrança, contato ao cliente, etc.
* Case: facade-case
* Implementação: facade-impl

## Padrão Singleton

**Objetivo**: Ensure a class only has one instance, and provide a global point of access to it.

**Quando usar**: Quando precisamos que haja apenas uma única instancia de uma classe no sistema.

**Estrutura**: 

**Exemplo**: Classe que segue o Facade e que é utilizada com frequencia em várias partes do sistema.
* Case: singleton-case
* Implementação: singleton-impl

---

**Referencias**:
* Curso: https://www.alura.com.br/curso-online-design-patterns
* Livro: Design Patterns - Elements of Reusable Object-Oriented Software
