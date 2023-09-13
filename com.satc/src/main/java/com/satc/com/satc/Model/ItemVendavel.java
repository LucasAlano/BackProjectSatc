package com.satc.com.satc.Model;

public class ItemVendavel extends EntityId {
    private String descricao;
    private Double valorUnitario;

    private Boolean estocavel;

    /**Getters**/
    public String getDescricao() {
        return descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Boolean getEstocavel() {
        return estocavel;
    }

    /** Setters **/
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setEstocavel(Boolean estocavel) {
        this.estocavel = estocavel;
    }
}

