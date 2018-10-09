package edu.pitagoras.funcionarioDAO;

import edu.pitagoras.config.Conexao;
import edu.pitagoras.modelodados.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class FuncionarioDAO {
    
    public static void adicionarfuncionario(Funcionarios funcionarios) throws SQLException {
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "insert into funcionarios (nome,cpf,dataNascimento,endereco,telefone,rg,dataAdmissao,cargo) values(?,?,?,?,?,?,?)";
        PreparedStatement stmt =  con.prepareStatement(sql);
        stmt.setString(1, funcionarios.getNome());
        stmt.setString(2, funcionarios.getCpf());
        stmt.setString(3, funcionarios.getDataNascimento());
        stmt.setString(4, funcionarios.getEndereco());
        stmt.setString(5, funcionarios.getTelefone());
        stmt.setString(6, funcionarios.getRg());
        stmt.setString(7, funcionarios.getDataAdmissao());
        stmt.setString(8, funcionarios.getCargo());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public static List<Funcionarios> buscarFuncionarios() throws SQLException {
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "select * from funcionarios";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        while(rs.next()){
            Funcionarios funcionario = new Funcionarios();
            funcionario.setNome(rs.getString("nome"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setDataNascimento(rs.getString("dataNascimento"));
            funcionario.setEndereco(rs.getString("endereco"));
            funcionario.setTelefone(rs.getString("telefone"));
            funcionario.setRg(rs.getString("rg"));              
            funcionario.setDataAdmissao(rs.getString("dataAdmissao"));
            funcionario.setCargo(rs.getString("cargo"));            
            funcionarios.add(funcionario);  
        }
        rs.close();
        stmt.close();
        con.close();
        return funcionarios;
    }    
}
