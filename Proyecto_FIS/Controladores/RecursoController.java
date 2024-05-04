package Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import DTO.RecursoDTO;
import Servicios.RecursoService;

@RestController
@RequestMapping("/recursos")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping("/{id}")
    public RecursoDTO getRecurso(@PathVariable Long id) {
        return recursoService.getRecursoById(id);
    }

    @PostMapping("/")
    public RecursoDTO createRecurso(@RequestBody RecursoDTO recursoDTO) {
        return recursoService.createRecurso(recursoDTO);
    }

    @PutMapping("/{id}")
    public RecursoDTO updateRecurso(@PathVariable Long id, @RequestBody RecursoDTO recursoDTO) {
        return recursoService.updateRecurso(id, recursoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRecurso(@PathVariable Long id) {
        recursoService.deleteRecurso(id);
    }
}
