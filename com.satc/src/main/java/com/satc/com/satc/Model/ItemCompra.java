package com.satc.com.satc.Model;

public class ItemCompra extends EntityId{
    private Produto produto;
    private Double  valorUnitario;
    private Double  quantidade;
    private Double  desconto;

    /** Getters **/

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

    /** Setters **/
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Double getValorCalculado() {
        double valorTotal = this.getValorUnitario() * this.getQuantidade();
        double descontoCalculado = valorTotal * ( this.getDesconto() / 100 ) ;
        return valorTotal - descontoCalculado;
    }
    public ItemCompra(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }


}
