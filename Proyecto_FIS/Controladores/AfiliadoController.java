package Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import DTO.AfiliadoDTO;
import Servicios.AfiliadoService;

@RestController
@RequestMapping("/afiliados")
public class AfiliadoController {

    @Autowired
    private AfiliadoService afiliadoService;

    @GetMapping("/{id}")
    public AfiliadoDTO getAfiliado(@PathVariable Long id) {
        return afiliadoService.getAfiliadoById(id);
    }

    @PostMapping("/")
    public AfiliadoDTO createAfiliado(@RequestBody AfiliadoDTO afiliadoDTO) {
        return afiliadoService.createAfiliado(afiliadoDTO);
    }

    @PutMapping("/{id}")
    public AfiliadoDTO updateAfiliado(@PathVariable Long id, @RequestBody AfiliadoDTO afiliadoDTO) {
        return afiliadoService.updateAfiliado(id, afiliadoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAfiliado(@PathVariable Long id) {
        afiliadoService.deleteAfiliado(id);
    }
}
