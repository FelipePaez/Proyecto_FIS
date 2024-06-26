package Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import DTO.EstadoRecursoDTO;
import Servicios.EstadoRecursoService;

@RestController
@RequestMapping("/estados-recursos")
public class EstadoRecursoController {

    @Autowired
    private EstadoRecursoService estadoRecursoService;

    @GetMapping("/{id}")
    public EstadoRecursoDTO getEstadoRecurso(@PathVariable Long id) {
        return estadoRecursoService.getEstadoRecursoById(id);
    }

    @PostMapping("/")
    public EstadoRecursoDTO createEstadoRecurso(@RequestBody EstadoRecursoDTO estadoRecursoDTO) {
        return estadoRecursoService.createEstadoRecurso(estadoRecursoDTO);
    }

    @PutMapping("/{id}")
    public EstadoRecursoDTO updateEstadoRecurso(@PathVariable Long id, @RequestBody EstadoRecursoDTO estadoRecursoDTO) {
        return estadoRecursoService.updateEstadoRecurso(id, estadoRecursoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEstadoRecurso(@PathVariable Long id) {
        estadoRecursoService.deleteEstadoRecurso(id);
    }
}
