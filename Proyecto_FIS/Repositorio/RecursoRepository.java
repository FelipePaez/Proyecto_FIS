package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Recurso;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    List<Recurso> findByUnidadAsociadaId(int unidadId);
}
