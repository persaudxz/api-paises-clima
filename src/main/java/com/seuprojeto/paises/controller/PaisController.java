package com.seuprojeto.paises.controller;

import com.seuprojeto.paises.model.Pais;
import com.seuprojeto.paises.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaisController {

    @Autowired
    private PaisService service;

    @GetMapping("/")
    public String form() {
        return "index";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam String nome, Model model) {

        Pais pais = service.buscarPais(nome);

        if (pais == null) {
            model.addAttribute("erro", "País não encontrado!");
            return "index";
        }

        model.addAttribute("pais", pais);
        return "resultado";
    }
}