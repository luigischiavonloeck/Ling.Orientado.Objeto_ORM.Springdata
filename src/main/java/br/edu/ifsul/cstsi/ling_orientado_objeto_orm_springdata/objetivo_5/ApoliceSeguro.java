package br.edu.ifsul.cstsi.ling_orientado_objeto_orm_springdata.objetivo_5;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;

@Embeddable
public class ApoliceSeguro {
    private BigDecimal valorFranquia;
    private Boolean protecaoTerceiro;
    private Boolean protecaoCausasNaturais;
    private Boolean protecaoRoubo;
}
