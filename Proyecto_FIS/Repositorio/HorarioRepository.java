package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
    List<Horario> findByHoraInicioAndHoraFin(int horaInicio, int horaFin);
}

