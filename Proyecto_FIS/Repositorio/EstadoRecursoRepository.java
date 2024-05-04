package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import Modelo.EstadoRecurso;

public interface EstadoRecursoRepository extends JpaRepository<EstadoRecurso, Long> {
    EstadoRecurso findByDiaSemana(String diaSemana);
}

