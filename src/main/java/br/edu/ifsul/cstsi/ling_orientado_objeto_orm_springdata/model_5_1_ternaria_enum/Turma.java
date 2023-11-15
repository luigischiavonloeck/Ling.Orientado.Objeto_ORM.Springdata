//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_5_1_ternaria_enum;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity(name = "Turma")
//@Table(name = "turmas")
//public class Turma {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Enumerated(EnumType.STRING)
//    private Curso curso;
//    @ManyToMany(mappedBy = "turmas")
//    private List<Professor> professores;
//    @ManyToMany
//    @JoinTable(
//            name = "utilizacoes_salas",
//            joinColumns = @JoinColumn(name = "turmas_id")
//    )
//    private List<Sala> salas;
//}
