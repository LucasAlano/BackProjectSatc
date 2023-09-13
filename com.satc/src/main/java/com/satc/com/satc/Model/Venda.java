package com.satc.com.satc.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityId implements OperacaoFinanceira{

    private LocalDate dataVenda;

    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private String observacao;

    private List<ItemVenda> itens = new ArrayList<>();


    /** Getters **/
    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    /** Setters **/
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItemVenda(ItemVenda item) {
        this.itens.add(item);
    }

    /** Deleta Lista vendas **/
    public void dellItemVenda(ItemVenda item) {
        this.itens.remove(item);
    }


    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream().mapToDouble(ItemVenda::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }


}
