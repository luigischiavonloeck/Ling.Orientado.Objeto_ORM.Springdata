//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_4_1_muitos_para_muitos;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity(name = "Pessoa")
//@Table(name = "pessoas")
//public class Pessoa {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//    @ManyToMany
//    @JoinTable(
//            name = "pessoas_contas",
//            joinColumns = @JoinColumn(name = "pessoa_id"),
//            inverseJoinColumns = @JoinColumn(name = "conta_id")
//    )
//    private List<Conta> contas;
//}
