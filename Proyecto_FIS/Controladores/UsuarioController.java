
package Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import DTO.UsuarioDTO;
import Servicios.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public UsuarioDTO getUsuario(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping("/")
    public UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.createUsuario(usuarioDTO);
    }

    @PutMapping("/{id}")
    public UsuarioDTO updateUsuario(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.updateUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
    }
}
