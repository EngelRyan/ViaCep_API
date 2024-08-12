package br.com.viacep.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.viacep.app.Model.Endereco;
import br.com.viacep.app.Service.ViaCepService;

@Controller
public class CepController {

    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/buscarCep")
    public String buscarCep(@RequestParam("cep") String cep, Model model){
        Endereco endereco = viaCepService.buscarEndereco(cep);
        model.addAttribute("endereco",endereco);
        return "index";
    }
    
}
