package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import jakarta.persistence.*;

@Entity
@Table(name = "modelos_carros")
public class ModeloCarro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "fabricante_id", referencedColumnName = "id")
    private Fabricante fabricante;
}
