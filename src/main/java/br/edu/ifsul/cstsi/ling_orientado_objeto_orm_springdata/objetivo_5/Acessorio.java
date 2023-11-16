package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "acessorios")
public class Acessorio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;
}
