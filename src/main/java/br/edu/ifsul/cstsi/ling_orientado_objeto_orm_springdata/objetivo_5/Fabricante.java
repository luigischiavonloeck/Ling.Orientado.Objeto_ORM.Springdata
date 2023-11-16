package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import jakarta.persistence.*;

@Entity
@Table(name = "fabricantes")
public class Fabricante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
