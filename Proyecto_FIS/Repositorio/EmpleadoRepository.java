package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByUnidadAsociadaId(int unidadId);
}

