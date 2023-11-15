package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import java.math.BigDecimal;
import java.util.List;

public class Carro {
    private String placa;
    private String chassi;
    private String cor;
    private BigDecimal valorDiaria;
    private List<Aluguel> alugueis;
    private List<Acessorio> acessorios;
    private ModeloCarro modelo;
}
