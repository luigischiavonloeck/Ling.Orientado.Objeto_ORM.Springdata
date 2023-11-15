//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_5_1_ternaria_enum;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity(name = "Professor")
//@Table(name = "professores")
//public class Professor {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//    @Enumerated(EnumType.STRING)
//    private Curso curso;
//    @ManyToMany
//    @JoinTable(
//            name = "utilizacoes_salas",
//            joinColumns = @JoinColumn(name = "professores_id")
//    )
//    private List<Turma> turmas;
//    @ManyToMany
//    @JoinTable(
//            name = "utilizacoes_salas",
//            inverseJoinColumns = @JoinColumn(name = "salas_id")
//    )
//    private List<Sala> salas;
//}
