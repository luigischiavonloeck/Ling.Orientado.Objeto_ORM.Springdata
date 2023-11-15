//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_2_1_um_para_um;
//
//import jakarta.persistence.*;
//
//@Entity(name = "Pessoa")
//@Table(name = "pessoas")
//public class Pessoa {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//
//    @OneToOne
//    @JoinColumn(name = "conjuge_id", referencedColumnName = "id", unique = true)
//    private Pessoa pessoa;
//}
