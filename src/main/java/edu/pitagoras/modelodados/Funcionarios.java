package edu.pitagoras.modelodados;

public class Funcionarios {
    
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String rg;
    private String dataAdmissao;
    private String cargo;
    
    public void informacoesFuncionarios(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("RG: " + this.getRg());
        System.out.println("Data de Admissao: " + this.getDataAdmissao());
        System.out.println("Cargo: " + this.getCargo());
      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dadaNascimento) {
        this.dataNascimento = dadaNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 
    
}
