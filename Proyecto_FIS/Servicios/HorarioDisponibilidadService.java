package Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import Repositorio.HorarioDisponibilidadRepository;
import Modelo.HorarioDisponibilidad;

@Service
public class HorarioDisponibilidadService {

    private final HorarioDisponibilidadRepository horarioDisponibilidadRepository;

    @Autowired
    public HorarioDisponibilidadService(HorarioDisponibilidadRepository horarioDisponibilidadRepository) {
        this.horarioDisponibilidadRepository = horarioDisponibilidadRepository;
    }

    public HorarioDisponibilidad findById(Long id) {
        return horarioDisponibilidadRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Horario de disponibilidad no encontrado con el ID: " + id));
    }

    public List<HorarioDisponibilidad> findAll() {
        return horarioDisponibilidadRepository.findAll();
    }

    public HorarioDisponibilidad save(HorarioDisponibilidad horarioDisponibilidad) {
        return horarioDisponibilidadRepository.save(horarioDisponibilidad);
    }

    public void deleteById(Long id) {
        horarioDisponibilidadRepository.deleteById(id);
    }
}
