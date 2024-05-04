package Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import DTO.HorarioDTO;
import Servicios.HorarioService;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping("/{id}")
    public HorarioDTO getHorario(@PathVariable Long id) {
        return horarioService.getHorarioById(id);
    }

    @PostMapping("/")
    public HorarioDTO createHorario(@RequestBody HorarioDTO horarioDTO) {
        return horarioService.createHorario(horarioDTO);
    }

    @PutMapping("/{id}")
    public HorarioDTO updateHorario(@PathVariable Long id, @RequestBody HorarioDTO horarioDTO) {
        return horarioService.updateHorario(id, horarioDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteHorario(@PathVariable Long id) {
        horarioService.deleteHorario(id);
    }
}
