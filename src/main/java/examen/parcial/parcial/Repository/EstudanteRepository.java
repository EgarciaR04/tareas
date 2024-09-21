package examen.parcial.parcial.Repository;

import examen.parcial.parcial.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudiante, Long> {
}
