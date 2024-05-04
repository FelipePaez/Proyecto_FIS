package Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import Repositorio.UnidadRepository;
import Modelo.Unidad;

@Service
public class UnidadService {

    private final UnidadRepository unidadRepository;

    @Autowired
    public UnidadService(UnidadRepository unidadRepository) {
        this.unidadRepository = unidadRepository;
    }

    public Unidad findById(Long id) {
        return unidadRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Unidad no encontrada con el ID: " + id));
    }

    public List<Unidad> findAll() {
        return unidadRepository.findAll();
    }

    public Unidad save(Unidad unidad) {
        return unidadRepository.save(unidad);
    }

    public void deleteById(Long id) {
        unidadRepository.deleteById(id);
    }
}
