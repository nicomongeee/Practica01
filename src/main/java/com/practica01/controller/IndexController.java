package com.practica01.controller;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import com.practica01.services.EstadoService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class IndexController {
    @Autowired
    
    private EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var estados = estadoService.getEstado(); //hace select de la tabla y devuelve un arraylist
        
        model.addAttribute("estados", estados);
        
        return "index";
    }
        
}
