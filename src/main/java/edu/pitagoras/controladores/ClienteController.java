package edu.pitagoras.controladores;

import edu.pitagoras.clienteDAO.ClienteDAO;
import edu.pitagoras.modelodados.Cliente;
import edu.pitagoras.modelodados.Funcionarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {
    
    @RequestMapping(value= "/novocliente", method =  RequestMethod.GET)
    public String novoCliente(Model model){
        List<String> profissoes = new ArrayList<String>();
        profissoes.add("Administrador");
        profissoes.add("Médico");
        profissoes.add("Professor");
        profissoes.add("Jogador de Futebol");
        
        model.addAttribute("profissoes", profissoes);
        model.addAttribute("cliente", new Cliente());
        return "novocliente";
    }
    
    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public String salvar(@ModelAttribute Cliente cliente, Model model) throws SQLException{
        cliente.informacoesCliente();
        try{
            ClienteDAO.adicionarCliente(cliente);   
         } catch(SQLException e){
            List<String> erros = new ArrayList<String>();
            erros.add("Erro ao inserir registro no bando de dados");
            model.addAttribute("erros", erros);
            return "novocliente";
            }
            model.addAttribute("cliente", new Cliente());
	    return "novocliente";  
    }
    
    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public String clientes(Model model) throws SQLException {
        model.addAttribute("clientes", ClienteDAO.buscarClientes());
        return "clientes";
    }
    
}