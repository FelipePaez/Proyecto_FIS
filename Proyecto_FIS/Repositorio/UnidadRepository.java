package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Unidad;

public interface UnidadRepository extends JpaRepository<Unidad, Long> {
    List<Unidad> findByIntervaloMinimoPrestamo(int intervaloMinimoPrestamo);
}

