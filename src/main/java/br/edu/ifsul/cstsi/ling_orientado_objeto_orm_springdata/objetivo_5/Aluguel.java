package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Aluguel {
    private Calendar dataPedido;
    private Date dataEntrega;
    private Date dataDevolucao;
    private BigDecimal valorTotal;
    private Motorista motorista;
    private Carro carro;
    private ApoliceSeguro apolice;
}
