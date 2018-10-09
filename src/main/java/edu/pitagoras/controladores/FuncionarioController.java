package edu.pitagoras.controladores;

import edu.pitagoras.funcionarioDAO.FuncionarioDAO;
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
public class FuncionarioController {
    
    @RequestMapping(value = "/novofuncionario", method = RequestMethod.GET)
    public String novoFuncionario(Model model) {
        List<String> cargos = new ArrayList<String>();
        cargos.add("Gerente");
        cargos.add("Encarregado");
        cargos.add("Estoquista");
        cargos.add("Vendedor");
        cargos.add("Gerente RH");
        cargos.add("Tesoureiro");
        
        model.addAttribute("cargos", cargos);
        model.addAttribute("funcionarios", new Funcionarios());
        return "novofuncionario";  
    }
    @RequestMapping(value="/salvarfuncionario", method = RequestMethod.POST)
        public String salvar(@ModelAttribute Funcionarios funcionarios, Model model) throws SQLException{
            funcionarios.informacoesFuncionarios();
            try{
                FuncionarioDAO.adicionarfuncionario(funcionarios);
            }catch(SQLException e){
                List<String> erros = new ArrayList<String>();
                erros.add("Erro ao inserir registro no banco de dados");
                model.addAttribute("erros", erros);
                return "novofuncionario";
            }
            model.addAttribute("funcionarios", new Funcionarios());
            return "novofuncionario";
        }
    
    @RequestMapping(value = "/listarfuncionarios", method = RequestMethod.GET)
    public String funcionarios(Model model) throws SQLException {
        model.addAttribute("listarfuncionarios", FuncionarioDAO.buscarFuncionarios());
        return "listarfuncionarios";
    }
    
    
}
