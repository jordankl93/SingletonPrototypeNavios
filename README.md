# Fabrica de Navios + Singleton + Prototype
Blog sobre implementação dos padrões de projeto Factory Method e Abstract Factory. Adicionando também os padrões Singleton e Prototype

### Factory Method

O padrão Factory Method possui a seguinte intenção:

“Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O Factory Method
permite adiar a instanciação para subclasses.” 

No projeto dos navios, foi criado uma interface de criação de objetos e cada subclasse fica responsável por criar seus objetos. 
Com isso, aumentamos a facilidade em adicionar novos navios no projeto.

### Abstract Factory

Na Fábrica abstrata a ideia é a mesma, porém criamos uma interface para criação de famílias de objetos relacionados ou dependentes 
sem especificar suas classes concretas

### Prototype

O padrão protótipo visa especificar tipos de objetos a serem criados usando uma instância criada e realizando clones desta. No projeto dos navios, a classe Navio recebeu um método chamado clone que realiza essa cópia da primeira instância criada. Com isso podemos instanciar novos navios em tempode excução.

### Singleton

O padrão singleton garante que apenas uma objeto seja criado e prover um único ponto de acesso para esse objeto. No projeto utilizamos o singleton para que apenas uma unica fábrica de cada tipo fosse instanciada, reduziando o consumo de memoria já que cada fábrica terá apenas uma instância criada em tempo de excuação.


## Diagrama de Classe


## Diagram de caso de uso


