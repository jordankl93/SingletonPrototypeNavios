# Fabrica de Navios
Blog sobre implementação dos padrões de projeto Factory Method e Abstract Factory

### Factory Method

O padrão Factory Method possui a seguinte intenção:

“Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O Factory Method
permite adiar a instanciação para subclasses.” 

No projeto dos navios, foi criado uma interface de criação de objetos e cada subclasse fica responsável por criar seus objetos. 
Com isso, aumentamos a facilidade em adicionar novos navios no projeto.

### Abstract Factory

Na Fábrica abstrata a ideia é a mesma, porém criamos uma interface para criação de famílias de objetos relacionados ou dependentes 
sem especificar suas classes concretas


