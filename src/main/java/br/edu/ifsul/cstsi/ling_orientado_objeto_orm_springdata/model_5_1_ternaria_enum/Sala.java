//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_5_1_ternaria_enum;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity(name = "Sala")
//@Table(name = "salas")
//public class Sala {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String descricao;
//    @Enumerated(EnumType.STRING)
//    private Curso curso;
//    @ManyToMany(mappedBy = "salas")
//    private List<Professor> professores;
//    @ManyToMany(mappedBy = "salas")
//    private List<Turma> turmas;
//}
