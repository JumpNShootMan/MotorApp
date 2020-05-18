package pe.upc.motor.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.upc.motor.entities.Motor;

public interface MotorRepositorio extends JpaRepository<Motor, Long> {
	@Query("select m from Motor m  where m.Precio between :v1 and :v2")
	List<Motor> obtenerMotoresEntrePrecios(Double v1, Double v2);
	
}
