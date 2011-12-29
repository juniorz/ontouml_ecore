= Metamodelo de Referência UML

Esse metamodelo serve como base para o metamodelo de OntoUML

=== Motivação
O metamodelo de UML fornecido pelo plugin uml2 do Eclipse não foi feito para ser extendido.
Por isso o recomendado seria usar um metamodelo próprio que fosse feito com esse propósito.
**Fonte:** Mensagem no forum do Eclipse.

=== Considerações

1. Todas as properties são navigable e owned por padrão. OntoUML não se preocupa com essas questões.

=== Notas
Esse modelo foi feito seguindo o "OCLinEcore Tutorial", disponivel na documentação do OCL (dentro do Eclipse).

Esse link fala como usar o Complete OCL
http://127.0.0.1:56041/help/topic/org.eclipse.ocl.doc/help/Validators.html?path=16_5_10_1#CompleteOCLEObjectValidator

=== Modificações

* Alterados de property + derived annotation para attribute + derivation:
  * NamedElement::qualifiedName
  * DirectedRelationship::source, DirectedRelationship::target
  * Relationship::relatedElement

* Removido
  * NamedElement::has_qualified_name
