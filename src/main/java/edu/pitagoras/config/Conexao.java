package edu.pitagoras.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexao {
    private static final String STRING_CONEXAO = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO_CONEXAO = "postgres";
    private static final String SENHA_CONEXAO = "123456";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(STRING_CONEXAO, USUARIO_CONEXAO, SENHA_CONEXAO);
    }
    
}
