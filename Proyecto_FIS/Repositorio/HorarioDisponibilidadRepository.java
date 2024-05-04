package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;
import Modelo.HorarioDisponibilidad;

public interface HorarioDisponibilidadRepository extends JpaRepository<HorarioDisponibilidad, Long> {
    List<HorarioDisponibilidad> findByFechaInicioBetweenAndFechaFinBetween(Date fechaInicio, Date fechaFin);
}

