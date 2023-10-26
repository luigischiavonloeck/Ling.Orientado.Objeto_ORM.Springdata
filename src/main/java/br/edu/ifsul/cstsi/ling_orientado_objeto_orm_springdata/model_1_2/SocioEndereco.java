package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_1_2;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "SocioEndereco")
@Table(name = "socios")
public class SocioEndereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private LocalDate aniversario;

    @Embedded
    private Endereco endereco;
}
