package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "pessoa_id")
@Table(name = "motoristas")
public class Motorista extends Pessoa{
    private String numeroCNH;
    @OneToMany(mappedBy = "motorista")
    private List<Aluguel> alugueis;
}
