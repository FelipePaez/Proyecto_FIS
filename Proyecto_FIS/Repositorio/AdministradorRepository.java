package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import Modelo.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
    List<Administrador> findByUnidadAsociadaId(int unidadId);
}
