package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.GeneroRepository;
import application.model.genero;

@Controller
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    GeneroRepository generoRepo;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("generos", generoRepo.findAll());
        return "/genero/list";
    }

    @RequestMapping("/insert")
    public String insert() {
        return "/genero/insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("name") String nome){
        genero genero = new genero();
        genero.setNome(nome);

        generoRepo.save(genero);

        return "redirect:/genero/list";
    }

    @RequestMapping("/update")
    public String update(Model model, @RequestParam("id") int id, String nome) {
        Optional <genero> genero = generoRepo.findById(id);

        if(genero.isPresent()) {
            genero.get().setNome(nome);

            generoRepo.save(genero.get());
        }
        return nome;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(
        @RequestParam("id") int id,
        @RequestParam("nome") String nome
    ){
        Optional <genero> genero = generoRepo.findById(id);

        if(genero.isPresent()) {
            genero.get().setNome(nome);

            generoRepo.save(genero.get());
        }
        return "redirect:/genero/list";
    }

    @RequestMapping("/delete")
    public String delete(Model model, @RequestParam("id") int id, String nome) {
        Optional <genero> genero = generoRepo.findById(id);

        if(genero.isPresent()) {
            model.addAttribute("genero", genero.get());
            return "/genero/delete";
            
        }
        return "redirect:/genero/list";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestParam("id") int id){
        generoRepo.deleteById(id);

        return "redirect;/genero/list";
    }
}


