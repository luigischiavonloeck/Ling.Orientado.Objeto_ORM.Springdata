package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.model_6_3_heranca;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "submissao_id")
@Table(name = "minicursos")
public class Minicurso extends Submissao {
    private String justificativa;
    private String objetivo;
    private Integer duracao;
    private String publico;
    private String material;
    private String curriculo;
    private String arquivo;

}
