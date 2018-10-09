package edu.pitagoras.modelodados;
public class Cliente {
    
    private String nome;
    private String tipoLogradouro;
    private String logradouro;
    private Integer numeroLogradouro;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;
    private String cpf;
    private String rg;
    private String profissao;

    public void informacoesCliente() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("TipoLogradouro: " + this.getTipoLogradouro());
        System.out.println("Logradouro: " + this.getLogradouro());
        System.out.println("NumeroLogradouro: " + this.getNumeroLogradouro());
        System.out.println("Telefone Residencial: " + this.getTelefoneResidencial());
        System.out.println("Telefone Comercial: " + this.getTelefoneComercial());
        System.out.println("Telefone Celular: " + this.getTelefoneCelular());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Profissão: " + this.getProfissao());
    }
    
      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(Integer numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
    
}
