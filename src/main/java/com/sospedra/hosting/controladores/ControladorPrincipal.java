package com.sospedra.hosting.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControladorPrincipal {
    @GetMapping({"/", "", "/home", "/inicio", "/index"})
    public String index(Model model) {

        return "index";
    }

    @GetMapping({"/admin"})
    public String admin(){
        return "admin/index";
    }
    @GetMapping({"/admin/edit"})
    public String edit(){
        return "admin/forms-editors";
    }
}
