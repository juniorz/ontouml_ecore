# Metamodelo de Referência UML

Esse metamodelo serve como base para o metamodelo de OntoUML, no que diz respeito a UML.

### Motivação
O metamodelo de UML fornecido pelo plugin `uml2` do Eclipse não foi feito para ser extendido.
Por isso o recomendado seria usar um metamodelo próprio que fosse feito com esse propósito.

**Fonte:** Mensagem no forum do Eclipse.

O [metamodelo de referência](http://code.google.com/p/rcarraretto/) (feito por Roberto Carraretto) apresenta o metamodelo de OntoUML e o metamodelo de UML no mesmo arquivo - o que dificulta a compreensão dos limites de cada escopo. Com o objetivo de facilitar o desenvolvimento (e a compreensão) separei o que diz respeito à UML em seu próprio metamodelo.

### Considerações

1. Todas as properties são navigable e owned por padrão.  
   OntoUML não se preocupa com essas questões. Por esse motivo o metamodelo UML também não se preocupa com essas distinções. Isso traz uma limitação, pois há instâncias válidas de um modelo UML (padrão) que não podem ser expressas nessa implementação.

### Rationale
Esse modelo foi feito seguindo o "OCLinEcore Tutorial", disponivel na documentação do OCL (dentro do Eclipse).

Há dois meios de incorporar OCL no Ecore:

1. Usando **OCLinEcore**, onde as *"extensões OCL"* são inseridas diretamente no metamodelo Ecore via anotações.
2. Usando **CompleteOCL**, onde as *"extensões OCL"* são inseridas em um arquivo separado.

**nota:** chamo de "extensões OCL" tudo aquilo que pode ser injetado no metamodelo via OCL: invariantes, pre-condições, pós-condições, derivações, etc.

**OCLinEcore**  
As extensões OCL são injetadas automaticamente nos arquivos Java gerados pelo genmodel: invariantes são inseridos no Validator do metamodelo, derivações são injetadas automaticamente nas implementações Java das EClass.

**CompleteOCL**  
Mais poderoso. Permite extender, por exemplo, um metamodelo importado. Seria útil para o nosso caso, MAS nada é automático. Precisa colocar o validador manualmente, por exemplo.

**Por isso, decidi usar OCLinEcore.**

### Changelog

* Alterados de `property + derived (annotation)` para `attribute + derivation`:

    * `NamedElement::qualifiedName`
    * `DirectedRelationship::source`, `DirectedRelationship::target`
    * `Relationship::relatedElement`

* Removido:

    * `NamedElement::has_qualified_name`
