package edu.pitagoras.clienteDAO;

import edu.pitagoras.config.Conexao;
import edu.pitagoras.modelodados.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class ClienteDAO {
    
    public static void adicionarCliente(Cliente cliente) throws SQLException {
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "insert into clientes" + "(nome,tipoLogradouro,numeroLogradouro,telefoneResidencial,telefoneComercial,telefoneCelular,cpf,profissao)" + "values(?,?,?,?,?,?,?,?,?)";       
        PreparedStatement stmt =  con.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getTipoLogradouro());
        stmt.setInt(3, cliente.getNumeroLogradouro());
        stmt.setString(4, cliente.getTelefoneResidencial());
        stmt.setString(5, cliente.getTelefoneComercial());
        stmt.setString(6, cliente.getTelefoneCelular());        
        stmt.setString(7, cliente.getCpf());
        stmt.setString(8, cliente.getRg());
        stmt.setString(9, cliente.getProfissao());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public static List<Cliente> buscarClientes() throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "select * from clientes ";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Cliente> clientes = new ArrayList<Cliente>();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("nome"));
            cliente.setTipoLogradouro(rs.getString("tipoLogradouro"));
            cliente.setNumeroLogradouro(rs.getInt("numeroLogradouro"));
            cliente.setTelefoneResidencial(rs.getString("telefoneResidencial"));
            cliente.setTelefoneComercial(rs.getString("telefoneComercial"));
            cliente.setTelefoneCelular(rs.getString("telefoneComercial"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setRg(rs.getString("rg"));
            cliente.setProfissao(rs.getString("profissao"));
            clientes.add(cliente);
        }
        rs.close();
        stmt.close();
        con.close();
        return clientes;
    }
    
}
