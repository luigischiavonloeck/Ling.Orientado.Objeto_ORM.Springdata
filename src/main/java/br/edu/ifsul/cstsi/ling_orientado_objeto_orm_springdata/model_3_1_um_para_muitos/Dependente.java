//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_3_1_um_para_muitos;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDate;
//
//@Entity(name = "Dependente")
//@Table(name = "dependentes")
//public class Dependente {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//    private LocalDate aniversario;
//    @ManyToOne
//    @JoinColumn(name = "socio_id", referencedColumnName = "id")
//    private Socio socio;
//}
