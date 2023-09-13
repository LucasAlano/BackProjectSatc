package com.satc.com.satc.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra extends EntityId implements OperacaoFinanceira{

    private LocalDate dataCompra;
    private Fornecedor fornecedor;
    private String observacao;
    private List<ItemCompra> itens = new ArrayList<>();

    /** Getteres **/
    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }


    /** Setters **/

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "dataCompra=" + dataCompra +
                ", fornecedor=" + fornecedor +
                ", observacao='" + observacao + '\'' +
                ", itens=" + itens +
                '}';
    }

    public void addCompra(ItemCompra item){
        this.itens.add(item);
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataCompra();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream().mapToDouble(ItemCompra::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.DEBITO;
    }

    public void addItemCompra(ItemCompra item) {
        this.itens.add(item);
    }
}
