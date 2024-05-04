package Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import DTO.AdministradorDTO;
import Servicios.AdministradorService;

@RestController
@RequestMapping("/administradores")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;

    @GetMapping("/{id}")
    public AdministradorDTO getAdministrador(@PathVariable Long id) {
        return administradorService.getAdministradorById(id);
    }

    @PostMapping("/")
    public AdministradorDTO createAdministrador(@RequestBody AdministradorDTO administradorDTO) {
        return administradorService.createAdministrador(administradorDTO);
    }

    @PutMapping("/{id}")
    public AdministradorDTO updateAdministrador(@PathVariable Long id, @RequestBody AdministradorDTO administradorDTO) {
        return administradorService.updateAdministrador(id, administradorDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrador(@PathVariable Long id) {
        administradorService.deleteAdministrador(id);
    }
}

