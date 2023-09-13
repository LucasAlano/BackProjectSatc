package com.satc.com.satc.Model;


public class ItemVenda extends EntityId {

    private ItemVendavel produtoServico;
    private Double valorUnitario;
    private Double quantidade;
    private Double desconto;




    /** Getters **/

    public ItemVenda(ItemVendavel produtoServico) {
        this.produtoServico = produtoServico;
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

    public void setProdutoServico(ItemVendavel produtoServico) {
        this.produtoServico = produtoServico;
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

    /** Adiciona Lista vendas **/


    /** To String - Usado para apresentação da classe **/
    @Override
    public String toString() {
        return "ItemVenda{" +
                " Produto =" + produtoServico +
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


    public ItemVenda(ItemVendavel produtoServico, Double valorUnitario, Double quantidade, Double desconto) {
        this.produtoServico = produtoServico;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }


}
