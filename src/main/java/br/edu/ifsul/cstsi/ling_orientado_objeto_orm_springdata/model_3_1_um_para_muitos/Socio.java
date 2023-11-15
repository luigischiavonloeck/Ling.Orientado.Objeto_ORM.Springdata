//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_3_1_um_para_muitos;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Entity(name = "Socio")
//@Table(name = "socios")
//public class Socio {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
//    private Long id;
//    private String nome;
//    private String endereco;
//    private String telefone;
//    private LocalDate aniversario;
//    private String email;
//    @OneToMany(mappedBy = "socio")
//    private List<Dependente> dependentes;
//}
