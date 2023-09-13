package com.satc.com.satc.Model;

public class Cliente extends Pessoa{

    private String cpf;

    private String rg;

    /** getters **/
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    /** setters **/
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }
}
