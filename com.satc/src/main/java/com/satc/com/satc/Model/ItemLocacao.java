package com.satc.com.satc.Model;

public class ItemLocacao extends EntityId{

    private Produto produto;
    private Double valorUnitario;
    private Double quantidade;
    private Double desconto;

    public Produto getProduto() {
        return produto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "ItemLocacao{" +
                "produto=" + produto +
                ", valorUnitario=" + valorUnitario +
                ", quantidade=" + quantidade +
                ", desconto=" + desconto +
                '}';
    }

    public Double getValorCalculado() {
        double valorTotal = this.getValorUnitario() * this.getQuantidade();
        double descontoCalculado = valorTotal * ( this.getDesconto() / 100 ) ;
        return valorTotal - descontoCalculado;
    }

    public ItemLocacao(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
}
