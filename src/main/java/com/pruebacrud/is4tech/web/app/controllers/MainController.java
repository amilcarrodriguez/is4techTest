package com.pruebacrud.is4tech.web.app.controllers;

import com.pruebacrud.is4tech.web.app.interfaceService.IcanalesService;
import com.pruebacrud.is4tech.web.app.interfaceService.IdistribuidorService;
import com.pruebacrud.is4tech.web.app.interfaceService.IproductosService;
import com.pruebacrud.is4tech.web.app.interfaceService.IusuariosService;
import com.pruebacrud.is4tech.web.app.models.Canales;
import com.pruebacrud.is4tech.web.app.models.Distribuidor;
import com.pruebacrud.is4tech.web.app.models.Productos;
import com.pruebacrud.is4tech.web.app.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private IdistribuidorService service;

    @Autowired
    private IproductosService servicep;

    @Autowired
    private IcanalesService servicec;

    @Autowired
    private IusuariosService serviceu;

    @GetMapping("/listar")
    public String listar(Model model){

        List<Distribuidor> distribuidores = service.listar();
        model.addAttribute("objeto",distribuidores);
        model.addAttribute("titulo","Listado de distribuidores");

        List<Productos> productos = servicep.listar();
        model.addAttribute("objetop",productos);
        model.addAttribute("titulop","Listado de productos");

        List<Canales>canales = servicec.listar();
        model.addAttribute("objetoc",canales);
        model.addAttribute("tituloc","Listado de canales");

        List<Usuarios>usuarios = serviceu.listar();
        model.addAttribute("objetou",usuarios);
        model.addAttribute("titulou","Listado de usuarios");

        return "listar";
    }

    @GetMapping("/verdist")
    public  String verdist(Model model){
        List<Canales> canales = servicec.listar();
        model.addAttribute("obj1",canales);

        List<Productos>productos = servicep.listar();
        model.addAttribute("obj2",productos);

        return "verdist";
    }

    @GetMapping("/new")
    public String agregar(Model model){

        model.addAttribute("titulod","Nuevo distribuidor");
        model.addAttribute("objetod",new Distribuidor());
        return "form";
    }

    @GetMapping("/newp")
    public String agregarp(Model model){

        model.addAttribute("titulop","Nuevo producto");
        model.addAttribute("objetop",new Productos());
        return "formp";
    }

    @GetMapping("/newc")
    public String agregarc(Model model){

        model.addAttribute("tituloc","Nuevo canal");
        model.addAttribute("objetoc",new Canales());
        return "formc";
    }

    @GetMapping("/newu")
    public String agregaru(Model model){

        model.addAttribute("titulou","Nuevo usuario");
        model.addAttribute("objetou",new Usuarios());
        return "formu";
    }

    @PostMapping("/save")
    public String save(@Validated Distribuidor d , Model model){
        service.save(d);
        return "redirect:/listar";
    }

    @PostMapping("/savep")
    public String savep(@Validated Productos p , Model model){
        servicep.save(p);
        return "redirect:/listar";
    }

    @PostMapping("/savec")
    public String savec(@Validated Canales c , Model model){
        servicec.save(c);
        return "redirect:/listar";
    }

    @PostMapping("/saveu")
    public String saveu(@Validated Usuarios u , Model model){
        serviceu.save(u);
        return "redirect:/listar";
    }

    @GetMapping(value = "/edit/{codigo}")
    public String edit(Model model, @PathVariable int codigo){

        Optional<Distribuidor> distribuidor= service.listarCodigo(codigo);
        model.addAttribute("objetod", distribuidor);

        return "form";
    }

    @GetMapping(value = "/editp/{codigo}")
    public String editp(Model model, @PathVariable int codigo){

        Optional<Productos> productos= servicep.listarCodigo(codigo);
        model.addAttribute("objetop", productos);
        return "formp";
    }

    @GetMapping(value = "/editc/{codigo}")
    public String editc(Model model, @PathVariable int codigo){

        Optional<Canales> canales= servicec.listarCodigo(codigo);
        model.addAttribute("objetoc", canales);
        return "formc";
    }

    @GetMapping(value = "/editu/{codigo}")
    public String editu(Model model, @PathVariable int codigo){

        Optional<Usuarios> usuarios= serviceu.listarCodigo(codigo);
        model.addAttribute("objetou", usuarios);
        return "formu";
    }

    @GetMapping(value = "/delete/{codigo}")
    public String delete(Model model, @PathVariable int codigo){
        service.delete(codigo);
        return "redirect:/listar";
    }

    @GetMapping(value = "/deletep/{codigo}")
    public String deletep(Model model, @PathVariable int codigo){
        servicep.delete(codigo);
        return "redirect:/listar";
    }

    @GetMapping(value = "/deletec/{codigo}")
    public String deletec(Model model, @PathVariable int codigo){
        servicec.delete(codigo);
        return "redirect:/listar";
    }

    @GetMapping(value = "/deleteu/{codigo}")
    public String deleteu(Model model, @PathVariable int codigo){
        serviceu.delete(codigo);
        return "redirect:/listar";
    }
}
