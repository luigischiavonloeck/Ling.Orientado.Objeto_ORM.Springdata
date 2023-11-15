//package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_1_3;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDate;
//
//@Entity(name = "SocioColunasPersonalizadas")
//@Table(name = "socios_colunas_personalizadas")
//public class SocioColunasPersonalizadas {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(name = "nome_socio", nullable = false, length = 50)
//    private String nome;
//    @Column(name = "endereco_socio", nullable = false, length = 255)
//    private String endereco;
//    @Column(name = "telefone_socio", nullable = false, length = 15)
//    private String telefone;
//    @Column(name = "aniversario_socio", nullable = false)
//    private LocalDate aniversario;
//    @Column(name = "email_socio", nullable = false, length = 50, unique = true)
//    private String email;
//}
