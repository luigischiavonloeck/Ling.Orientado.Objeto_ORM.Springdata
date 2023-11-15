//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_6_1_heranca;
//
//import jakarta.persistence.*;
//
//@Entity(name = "Submissao")
//@Table(name = "submissoes")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo_submissao")
//public abstract class Submissao {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    protected String titulo;
//    @Enumerated(EnumType.STRING)
//    protected Situacao situacao;
//
//}
