package ec.voto.api.repository;

import ec.voto.api.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudiantePersistence extends JpaRepository<Pais, Long> {

}
