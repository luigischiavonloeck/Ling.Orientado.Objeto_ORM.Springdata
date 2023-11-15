//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_4_1_muitos_para_muitos;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity(name = "Conta")
//@Table(name = "contas")
//public class Conta {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private Double saldo;
//    @ManyToMany(mappedBy = "contas")
//    private List<Pessoa> pessoas;
//}
