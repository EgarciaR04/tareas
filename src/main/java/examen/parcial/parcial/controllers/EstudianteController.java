package examen.parcial.parcial.controllers;

import examen.parcial.parcial.Entity.Estudiante;
import examen.parcial.parcial.services.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("estudihambre/umg")
public class EstudianteController {
    private final EstudianteService estudianteService;

    @GetMapping()
    public String estudiantes(Model model) {
        model.addAttribute("users", new Estudiante());

        return "ingreso";
    }
}
