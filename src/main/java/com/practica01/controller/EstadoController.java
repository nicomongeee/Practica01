package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import com.practica01.services.EstadoService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstadoController {

    @Autowired

    private EstadoService estadoService;
    
    @GetMapping("/estado/nuevo")
    public String clienteNuevo(Estado estado) {
        return "modificarEstado";
    }

    @PostMapping("/estado/guardar")
    public String clienteGuardar(Estado estado) {
        estadoService.save(estado);
        return "redirect:/"; //para redireccionar la ruta
    }

    @GetMapping("/estado/actualiza/{idEstado}")
    public String estadoActualiza(Estado estado, Model model) {
        estado = estadoService.getEstado(estado); // va y hace un select en la tabla
        model.addAttribute("estado",estado);
        return "modificarEstado"; 
    }
    
    @GetMapping("/estado/elimina/{idEstado}")
    public String estadoElimina(Estado estado) {
        estadoService.delete(estado); // va y hace un select en la tabla
        return "redirect:/"; 
    }
    

}
