package edu.pe.cibertec.DAWII_CL1_GRUPO7.repository;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.TipoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleadoRepository extends JpaRepository<TipoEmpleado, Integer> {
}
