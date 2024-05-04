package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import Modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
}

