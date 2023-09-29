package edu.pe.cibertec.DAWII_CL1_GRUPO7.repository;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
}
