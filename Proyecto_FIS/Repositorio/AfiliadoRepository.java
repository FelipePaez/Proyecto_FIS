package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Afiliado;

public interface AfiliadoRepository extends JpaRepository<Afiliado, Long> {
    List<Afiliado> findByNumeroldentificacion(String numeroIdentificacion);
}

