package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    List<Calificacion> findByUsuarioIdAndEmpleadoACalificarId(Long usuarioId, Long empleadoACalificarId);
}
