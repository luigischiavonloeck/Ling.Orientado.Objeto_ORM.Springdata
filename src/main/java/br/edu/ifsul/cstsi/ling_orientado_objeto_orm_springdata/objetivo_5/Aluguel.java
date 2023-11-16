package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "alugueis")
public class Aluguel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar dataPedido;
    private Date dataEntrega;
    private Date dataDevolucao;
    private BigDecimal valorTotal;
    @ManyToOne
    @JoinColumn(name = "motorista_id", referencedColumnName = "id")
    private Motorista motorista;
    @Embedded
    private ApoliceSeguro apolice;
    @ManyToOne
    @JoinColumn(name = "carro_id", referencedColumnName = "id")
    private Carro carro;
}
